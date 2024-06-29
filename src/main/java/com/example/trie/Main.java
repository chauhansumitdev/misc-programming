package com.example.trie;

// all we need to do is to fill that place of the ref array to idnetify the existence of the char at that index;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        System.out.println(trie.search("apple"));  // true
        System.out.println(trie.search("app"));    // true
        System.out.println(trie.search("appl"));   // false
        System.out.println(trie.startsWith("app")); // true
        System.out.println(trie.startsWith("apz")); // false
    }
}

class Trie{

    public Node root;

    public Trie(){
        this.root = new Node();
    }

    public void insert(String word){
        Node current = root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            int index = ch - 'a';

            if(current.children[index] == null){
                current.children[index] = new Node();
            }

            current = current.children[index];
        }
        current.flag = true;
    }

    public  boolean search(String word){
        Node current = root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            int index = ch - 'a';

            if(current.children[index] == null){
                return false;
            }

            current = current.children[index];
        }
        return current.flag;
    }

    public boolean startsWith(String word){
        Node current = root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            int index = ch - 'a';

            if(current.children[index] == null){
                return false;
            }

            current = current.children[index];
        }

        return true;
    }
}

class Node{
    boolean flag;
    Node[] children;

    public Node(){
        flag = false;
        children = new Node[26];
    }
}
