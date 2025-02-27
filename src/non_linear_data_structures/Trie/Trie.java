package non_linear_data_structures.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode{
    public char value;
    public Map<Character, TrieNode> children;
    public boolean isEndOfWord;

    public TrieNode(char ch){
        this.value = ch;
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }

    public boolean hasChild(char ch){
        return children.containsKey(ch);
    }

    public void insertChild(char ch){
        children.put(ch, new TrieNode(ch));
    }

    public TrieNode getChild(char ch){
        return children.get(ch);
    }

    public TrieNode[] getChildren(){
        return children.values().toArray(new TrieNode[0]);
    }

    public String toString(){
        return "Value="+value;
    }
}
public class Trie {
    TrieNode root;

    public Trie(){
        this.root = new TrieNode(' ');
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()){
            if (!current.hasChild(ch))
                current.insertChild(ch);

            current = current.getChild(ch);
        }

        current.isEndOfWord = true;
    }

    private TrieNode getStarting(TrieNode root, String prefix, int index){
        if (index == prefix.length()) {
            return root;
        }

        char ch = prefix.charAt(index);
        TrieNode node = root.getChild(ch);
        return getStarting(node, prefix, index + 1);
    }

    private void getAutoCompleteWords(TrieNode root, String pre, List<String> result){
        if (root == null) return;
        if (root.isEndOfWord){
            result.add(pre);
        }

        for (TrieNode child : root.getChildren()){
            getAutoCompleteWords(child, pre + child.value, result);
        }
    }
    public List<String> autoComplete(String prefix){
        List<String> result = new ArrayList<>();
        TrieNode startingPoint = getStarting(root, prefix, 0);
        getAutoCompleteWords(startingPoint, prefix, result);
        return result;
    }

    private void remove(TrieNode root, String word, int index) {
        if(root == null) return;

        if (index == word.length()){
            root.isEndOfWord = false;
            return;
        }
        char currentChar = word.charAt(index);
        TrieNode current = root.getChild(word.charAt(index));
        remove(current, word, index + 1);

        if (current.getChildren().length == 0  && !current.isEndOfWord){
            root.children.remove(currentChar);
        }
    }

    public void remove(String word){
        remove(root, word, 0);
    }

    private void getCommonPrefix(TrieNode root, StringBuilder result)
    {
        if (root.value != ' ')
            result.append(root.value);

        if (root.getChildren().length != 1 || root.isEndOfWord){
            return;
        }

        for (TrieNode node: root.getChildren())
            getCommonPrefix(node, result);
    }

    public String getCommonPrefix(){
        StringBuilder result = new StringBuilder();
        getCommonPrefix(root, result);
        return result.toString();
    }
}
