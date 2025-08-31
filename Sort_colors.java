class Solution {
    public void sortColors(int[] nums) {

        //METHOD 1 USING INSERTION SORT O(n^2)
        // int n=nums.length;
        // for(int i=1;i<n;i++){
        //     int key=nums[i];
        //     int j=i-1;
        //     while(j>=0&&nums[j]>key){
        //         nums[j+1]=nums[j];
        //         j=j-1;
        //     }
        //     nums[j+1]=key;
        // }


        //METHOD 2 O(n)
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
