class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //count freq
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        //
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i:map.keySet()){
            int f = map.get(i);
            if(bucket[f] == null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(i);
        }
        //collect top k
        List<Integer> result = new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && result.size()<k;i--){
            if(bucket[i]!=null){
                result.addAll(bucket[i]);
            }
        }
        //converting into array
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=result.get(i);
        }

       return res; 
    }
}
