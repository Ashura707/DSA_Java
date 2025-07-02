// Time: O(n) - We iterate through the array once, and HashSet operations are O(1) on average
// Space: O(n) - In the worst case (no duplicates), we store all n elements in the set

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int val:nums){
            if(set.contains(val)) return true;
            set.add(val);
        }
        return false;
    }
}
