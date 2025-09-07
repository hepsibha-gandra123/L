//order(n*m)
// long c=0;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if((i+j)%2!=0){
//             c++;
//         }
//     }
// }
// return c;

//order(1)
class Solution {
    public long flowerGame(int n, int m) {
        long a = (m + 1) / 2;
        long b = (m / 2);
        long c = (n + 1) / 2;
        long d = n / 2;
        return (a * d) + (c * b);
    }
}
