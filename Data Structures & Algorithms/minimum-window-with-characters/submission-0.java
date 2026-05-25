class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char x = t.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int j=0;
        int need = map.size();
        int a=0;
        int b=0;
        int minSize = Integer.MAX_VALUE;
        int avialable=0;
        HashMap<Character,Integer>w=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(map.get(x)!=null){
                w.put(x,w.getOrDefault(x,0)+1);
                if(w.get(x)==map.get(x)){
                    avialable+=1;
                }
            }
            while(need==avialable){
            int size = (i-j)+1;
            if(minSize>size){
                a=j;
                b=i;
                minSize=size;
            }
            char y=s.charAt(j);
            if(map.get(y)!=null){
            w.put(y,w.get(y)-1);
            if(w.get(y)<map.get(y)){
                avialable-=1;
            }
            }
            j+=1;
            }
        }
        if (minSize == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(a,b+1);
    }
}
