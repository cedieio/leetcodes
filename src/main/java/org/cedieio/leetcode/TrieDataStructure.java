package org.cedieio.leetcode;

import java.util.HashMap;
import java.util.Map;

class Node{
    
    private char c;
    private Map<Character, Node> children;
    private boolean wordCompleted;
    public Node(char c){
        this.c = c;
        children = new HashMap<>();
    }
    
    public char getChar() {
    	return c;
    }
    public void putChild(char c, Node node){
        children.put(c, node);
    }
    
    public Node getChild(char c){
        return children.get(c);
    }
    
    public void setWordCompleted(boolean wordCompleted){
        this.wordCompleted = wordCompleted;
    }
    
    public boolean isWordCompleted(){
        return this.wordCompleted;
    }
}
public class TrieDataStructure {

    private Node root;
    
    public TrieDataStructure() {
        root = new Node('\0');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node val = root;
        for(char c : word.toCharArray()){
            Node tmp = val.getChild(c);
            if(null == tmp){
                tmp = new Node(c);
                val.putChild(c, tmp);
            }
            val = tmp;
        }
        val.setWordCompleted(true);
    }
    
    public boolean search(String word) {
        Node val = root;
        for(char c : word.toCharArray()){
            Node tmp = val.getChild(c);
            if(null == tmp){
                return false;
            }
            val = tmp;
        }
        return val.isWordCompleted();
    }
    
    public boolean startsWith(String prefix) {
        Node val = root;
        for(char c : prefix.toCharArray()){
            Node tmp = val.getChild(c);
            if(null == tmp){
                return false;
            }
            val = tmp;
        }
        return true;
    }
}

