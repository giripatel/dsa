package non_linear_data_structures.Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        String[] words = new String[]{
                "car",
                "carpet",
                "carlet"
        };

        for (String word : words) {
            trie.insert(word);
        }
        System.out.println(trie.getCommonPrefix());
//        trie.insert("car");
//        trie.remove("car");
//        System.out.println(trie.autoComplete("c"));
    }
}
