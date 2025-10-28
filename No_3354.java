class Solution {
    public int countValidSelections(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int sum1=0;
                for(int j=0;j<i;j++){
                    sum1+=nums[j];
                }
                int sum2=0;
                for(int k=i+1;k<nums.length;k++){
                    sum2+=nums[k];
                }
                if(sum1==sum2){
                    count+=2;
                }
                else if(sum1-sum2==1||sum2-sum1==1){
                    count+=1;
                }
            }
        }
        return count;
    }
}