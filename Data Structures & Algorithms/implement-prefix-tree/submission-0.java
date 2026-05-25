
    class TrieNode{
        HashMap<Character,TrieNode>children;
        boolean isEndOfWord;
        TrieNode(){
            children=new HashMap<>();
            isEndOfWord=false;
        }
    }

class PrefixTree {

    private TrieNode root;
    public PrefixTree() {
        this.root=new TrieNode();
    }

    public void insert(String word) {
        TrieNode node=this.root;
        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            if(!node.children.containsKey(ch)){
                node.children.put(ch,new TrieNode());
            }
            node=node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node=this.root;
        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            node=node.children.get(ch);
            if(node==null){
                return false;
            }
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node=this.root;
        for(int i=0;i<prefix.length();i++){
            Character ch=prefix.charAt(i);
            node=node.children.get(ch);
            if(node==null){
                return false;
            }
        }
        return true;
    }
}
