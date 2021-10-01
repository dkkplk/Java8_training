package com.learning.datastructutre.trie;

import java.util.HashMap;

public class TrieNode {
	char c;
	HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isLeaf;

	public TrieNode() {

	}

	public TrieNode(char c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "TrieNode [c=" + c + ", children=" + children + ", isLeaf=" + isLeaf + "]";
	}
	
	
}
