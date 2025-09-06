//time limit exceeded

// class Solution {
//     public long minOperations(int[][] queries) {
//         ArrayList<Integer> L=new ArrayList<>();
//         ArrayList<Integer> res=new ArrayList<>();
//         int c=0;
//         long zcount=0;
//             for(int i=0;i<queries.length;i++){
//                 for(int x=queries[i][0];x<=queries[i][1];x++){
//                     L.add(x);
//                 }
//                 int size=L.size();
//                 for(int x=0;x<size;x++){
//                     c=0;
//                     int h=L.get(x);
//                     while(h!=0){
//                         c++;
//                         h=h/4;
//                     }
//                     res.add(c);
//                 }
//                 int total=0;
//                 for(int val:res){
//                     total+=val;
//                 }
//                 zcount+=(total+1)/2;
//                 res.clear();
//                 L.clear();
//             }
//         return zcount;
//     }
// }


//optimized code

class Solution {
    private long preOps(long n){
        if(n<=0) return 0;
        long base=1;
        long total=0;
        long ops=1;
        while(base<=n){
            long end=Math.min(n,base*4-1);
            total+=(end-base+1)*ops;
            base*=4;
            ops++;
        }
        return total;
    }
    public long minOperations(int[][] queries) {
        long totalOps=0;
            for(int[] q:queries){
                int l=q[0];
                int r=q[1];
                long result=preOps(r)-preOps(l-1);
                totalOps+=(result+1)/2;
            }
            return totalOps;
    }
}