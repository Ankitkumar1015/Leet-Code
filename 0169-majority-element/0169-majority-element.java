class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int cat = 1 ; 

        for ( int i = 1 ; i< nums.length ;i++){
            
                if (el == nums[i]){
                    cat ++;
                }
                else{
                    cat--;
                }
            if (cat > nums.length/2){
            return el;

        }
        else if (cat==0){
            el= nums[i];
            cat= 1;
        }
        }
        return el;
    }
}