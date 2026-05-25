    class TrieNode{
        boolean isWordEnd;
        HashMap<Character,TrieNode>children;
        TrieNode(){
            this.isWordEnd=false;
            this.children=new HashMap<>();
        }

    }

class PrefixTree {

private TrieNode root;
    public PrefixTree() {
          this.root=new TrieNode();
    }

    public void insert(String word) {
          TrieNode node=this.root;
        for(char ch:word.toCharArray()){
            if(!node.children.containsKey(ch)){
                node.children.put(ch,new TrieNode());
            }
            node=node.children.get(ch);
        }
        node.isWordEnd=true;
    }

    public boolean search(String word) {
         TrieNode node=this.root;
        for(char ch:word.toCharArray()){
            node=node.children.get(ch);
            if(node==null){
                return false;
            }
        }
        return node.isWordEnd;
    }

    public boolean startsWith(String prefix) {
         TrieNode node=this.root;
        for(char ch:prefix.toCharArray()){
            node=node.children.get(ch);
            if(node==null){
                return false;
            }
        }
        return true;
    }
}
