class Solution {
    public boolean hasDuplicate(int[] nums) {
//we have a nums array we need find the duplicates in it, to solve it we can take a new array where we can we iterate the nums add that value to the new array before add to the that we should make sure it doesn't contain same value if it contains we can return true else false, in other way we can iterate the complete array by comparing the value if we found a duplicate we can return true or else false.4
boolean duplicate = false;
for(int i=0; i< nums.length;i++){
    for(int j=0;j< nums.length;j++){
        if(i!=j && nums[i]==nums[j]){
            return true;
        }
    }
}

    return false;
 }
}