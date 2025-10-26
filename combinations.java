import java.util.ArrayList;
import java.util.List;

public class Solution {
    int n;
    List<List<Integer>> result=new ArrayList<>();
    int k;
    int nums[];
    public List<List<Integer>> combine(int n, int k) {
        this.n=n;
        this.k=k;
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        this.nums=nums;
        backtrack(new ArrayList<>(),0);
        return result;
    }
    private void backtrack(selected,start){
        if(selected.size()==k){
             result.append(new ArrayList<>(selected))
        }
        for(int i=start;i<n;i++){
            selected.append(nums[i]);
            backtrack(selected,i+1);
            selected.remove(selected.size()-1);
        }
    }
}
