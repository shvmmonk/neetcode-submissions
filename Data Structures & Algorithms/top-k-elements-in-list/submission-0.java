class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num:nums){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }else{
                freq.put(num,1);
            }
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a,b) -> freq.get(b)-freq.get(a));

        int[] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
