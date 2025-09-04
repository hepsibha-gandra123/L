class Solution {
    public boolean isHappy(int n) {
    ArrayList<Integer> list=new ArrayList<>();
    int sum=0;
    int x=n;
    while(x>0){
        int y=x%10;
        sum+=y*y;
        x=x/10;
        if(x==0&&sum!=1&&list.contains(sum)){
            return false;
        }
        else if(x==0&&sum!=1){
            list.add(sum);
            x=sum;
            sum=0;
        }
    }
    return true;
    }
}