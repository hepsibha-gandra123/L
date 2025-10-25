class Solution {
    public int nextBeautifulNumber(int n) {
        int val=n+1;
        while(val<=10000000){
            int h=1;
            int p=1;
            int[] count=new int[10];
            int temp=val;
            while(temp>0){
                int x=temp%10;
                if(x==0){
                    p=0;
                    break;
                }
                count[x]++;
                temp/=10;
            }
            if(p!=0){
                for(int i=1;i<10;i++){
                    if(count[i]!=i&&count[i]>0){
                        h=0;
                        break;
                    }
                }
                if(h==1){
                    return val;
                }
            }
            val++;
        }
        return -1;
    }
}