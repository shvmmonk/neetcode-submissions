class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String ans = new String(ch);
            list.putIfAbsent(ans , new ArrayList<>());
            list.get(ans).add(s);

        }

        return new ArrayList<>(list.values());
    }
}
