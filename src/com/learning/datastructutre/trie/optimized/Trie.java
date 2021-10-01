package com.learning.datastructutre.trie.optimized;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode p = root;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (p.arr[index] == null) {
				TrieNode temp = new TrieNode();
				p.arr[index] = temp;
				p = temp;
			} else {
				p = p.arr[index];
			}
		}
		p.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode p = searchNode(word);
		if (p == null) {
			return false;
		} else {
			if (p.isEnd)
				return true;
		}

		return false;
	}

	public boolean startsWith(String prefix) {
		TrieNode p = searchNode(prefix);

		if (p == null) {
			return false;
		} else {
			System.out.println(p);
			return true;
		}
	}

	public TrieNode searchNode(String word) {

		TrieNode p = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (p.arr[index] != null) {
				p = p.arr[index];
			} else {
				return null;
			}

		}

		if (p == root) {
			return null;
		}
		return p;
	}
}
