class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int x=numBottles;
        int c=0;
        int count=numBottles;
        while(x/numExchange!=0){
            c++;
            x-=numExchange;
            numExchange++;
        }
        count+=c;
        if((c+x)/numExchange!=0){
            count++;
        }
        return count;
    }
}

// or

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles/numExchange!=0){
            count++;
            numBottles-=numExchange;
            numBottles--;
            numExchange++;
        }
        return count;
    }
}