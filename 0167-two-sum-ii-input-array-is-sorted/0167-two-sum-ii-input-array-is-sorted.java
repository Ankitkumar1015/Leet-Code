class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i= 0;
        int j = n-1;
        int[] res=new int[2];
while (i<j){
        if((numbers[i]+numbers[j]) > target ){
            j=j-1;
        }
        else if((numbers[i]+numbers[j]) < target ){
            i=i+1;
        }
        else{
            res=new int []{(i+1),(j+1)};
            break;
        }
        }
        return res;
        
    }
}