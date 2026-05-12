class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen_num = new HashSet<>();
        for(int num:nums){
            if(seen_num.contains(num)){
                return true;
            }
            seen_num.add(num);
        }
        return false;
    }
}