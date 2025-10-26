class Solution {
    int n;
    boolean[] used;
    int[] nums;
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        this.nums=nums;
        this.n=nums.length;
        this.used=new boolean[n];
        backtrack(new ArrayList<>());
        return result;
    }
    private void backtrack(List<Integer> selected){
        if(selected.size()==n){
            result.add(new ArrayList<>(selected));
            return;
        }
        for(int i=0;i<n;i++){
            if(!used[i]){
                used[i]=true;
                selected.add(nums[i]);
                backtrack(selected);
                selected.remove(selected.size()-1);
                used[i]=false;
            }
        }
    }
}