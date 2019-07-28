package com.zk.myspring;

public class TextEditor {
	private SpellChecker SpellChecker;
	private String name;
	
	public SpellChecker getSpellChecker() {
		return SpellChecker;
	}
	public void setSpellchecker(SpellChecker SpellChecker) {
		this.SpellChecker = SpellChecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck(){
		SpellChecker.checkSpelling();
	}
}
