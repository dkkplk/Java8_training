package com.learning.datastructutre.trie;

public class TrieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie t = new Trie();

		t.insert("absdfs");
		t.insert("abddccc");
		t.insert("xyz");
		t.insert("sapsss");
		t.insert("abtest");
		t.insert("abxza");
		t.insert("xcv");
		t.insert("aest");
		t.insert("btest");
		

		System.out.println(t.printStartWithPrifixNode("ab"));
	}

}
