class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            //m-1
            // char[] ch=s.toCharArray();
            // Arrays.sort(ch);
            // String key= new String(ch);


            int[] count = new int[26];
            for(char c:s.toCharArray()){
                count[c -'a']++;
            }
            String key= Arrays.toString(count);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            // if(!map.containsKey(key)){
            //     map.put(key,new ArrayList<>());
            // }
            // map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
