package com.brms;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.brms.book.Book;
import com.brms.book.service.BookRegisterService;
import com.brms.book.service.BookSearchService;
import com.brms.member.Member;
import com.brms.member.service.MemberRegisterService;
import com.brms.member.service.MemberSearchService;

public class MainClass {
	public static void main(String[] args) {
		String[] bNums = {"739", "985", "184", "830", "816"};
		String[] bTitles = {"html", "css", "jQuery", "java", "spring"};
		
		String[] mIds = {"rabbit", "hippo", "raccoon", "elephan", "lion"};
		String[] mPws = {"96539", "94875", "15284", "48765", "28661"};
		String[] mNames = {"agatha", "barbara", "chris", "doris", "elva"};
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		BookRegisterService bookRegisterService = ctx.getBean("bookRegisterService", BookRegisterService.class);
		for(int i=0; i<bNums.length; i++) {
			Book book = new Book(bNums[i], bTitles[i], true, null);
			bookRegisterService.register(book);
		}
		
		BookSearchService bookSearchService = ctx.getBean("bookSearchService", BookSearchService.class);
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("-----------------------------------------");
		for(int i=0; i<bNums.length; i++) {
			Book book = bookSearchService.searchBook(bNums[i]);
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.isbCanRental() + "\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId());
		}
		
		MemberRegisterService memberRegisterService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		for (int i = 0; i < mIds.length; i++) {
			Member member = new Member(mIds[i], mPws[i], mNames[i]);
			memberRegisterService.register(member);
		}
		
		MemberSearchService memberSearchService = ctx.getBean("memberSearchService", MemberSearchService.class);
		System.out.println("\nmId\tmPw\tmName");
		System.out.println("------------------------------------------");
		for (int i = 0; i < mIds.length; i++) {
			Member member = memberSearchService.searchMember(mIds[i]);
			System.out.print(member.getmId() + "\t");
			System.out.print(member.getmPw() + "\t");
			System.out.print(member.getmName() + "\n");
		}
		
		bookRegisterService.register(new Book("739", "html", false, memberSearchService.searchMember("elephan")));
		bookRegisterService.register(new Book("184", "jQuery", false, memberSearchService.searchMember("hippo")));
		bookRegisterService.register(new Book("816", "spring", false, memberSearchService.searchMember("rabbit")));
		bookRegisterService.register(new Book("985", "css", false, memberSearchService.searchMember("rabbit")));
		
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("------------------------------------------");
		for (int i = 0; i < bNums.length; i++) {
			Book book = bookSearchService.searchBook(bNums[i]);
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.isbCanRental() + "\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId());
		}
		
		ctx.close();
	}
}
