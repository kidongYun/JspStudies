package com.word;

public class WordSet {
	
	private String wordKey;
	private String wordValue;
	
	public WordSet(String workKey, String wordValue) {
		this.wordKey = workKey;
		this.wordValue = wordValue;
	}

	public String getWordKey() {
		return wordKey;
	}

	public void setWordKey(String workKey) {
		this.wordKey = workKey;
	}

	public String getWordValue() {
		return wordValue;
	}

	public void setWordValue(String wordValue) {
		this.wordValue = wordValue;
	}
}
