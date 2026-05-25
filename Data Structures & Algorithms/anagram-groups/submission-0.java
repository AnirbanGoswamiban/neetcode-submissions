class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            String[] words = s.split("");
            Arrays.sort(words);
            String newString = String.join("",words);
            if(map.containsKey(newString)){
                List list=map.get(newString);
                list.add(s);
            }else{
                map.put(newString,new ArrayList<>());
                List list=map.get(newString);
                list.add(s);
            }
        }
        System.out.println(map);
        List<List<String>> res = new ArrayList<>();
        map.forEach((key, value) -> res.add(value));
        return res;
    }
}
