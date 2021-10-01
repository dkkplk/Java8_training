package com.learning.datastructutre.trie.optimized;

import java.util.Arrays;

public class TrieNode {
	TrieNode[] arr;
	boolean isEnd;

	public TrieNode() {

		this.arr = new TrieNode[26];
	}

	@Override
	public String toString() {
		return "TrieNode [arr=" + Arrays.toString(arr) + ", isEnd=" + isEnd + "]";
	}

	
}
