class Solution {
    public String intToRoman(int num) {
        StringBuilder s=new StringBuilder();
        ArrayList<Integer> l=new ArrayList<>();
        int x=num;
        while(x>0){
            l.add(0,x%10);
            x=x/10;
        }
        while(l.size()<4){
            l.add(0,0);
        }
        if(l.get(0)==1 || l.get(0)==2 ||l.get(0)==3){
            for(int i=0;i<l.get(0);i++){
                s.append("M");
            }
        }
        if(l.get(1)==4){
            s.append("CD");
        }
        else if(l.get(1)==9){
            s.append("CM");
        }
        else if(l.get(1)==1||l.get(1)==2||l.get(1)==3){
            for(int i=0;i<l.get(1);i++){
                s.append("C");
            }
        }
        else if(l.get(1)==5){
            s.append("D");
        }
        else if(l.get(1)>5&&l.get(1)<=8){
            s.append("D");
            for(int i=0;i<l.get(1)-5;i++){
                s.append("C");
            }
        }
        if(l.get(2)==4){
            s.append("XL");
        }
        else if(l.get(2)==9){
            s.append("XC");
        }
        else if(l.get(2)==1||l.get(2)==2||l.get(2)==3){
            for(int i=0;i<l.get(2);i++){
                s.append("X");
            }
        }
        else if(l.get(2)==5){
            s.append("L");
        }
        else if(l.get(2)>5&&l.get(2)<=8){
            s.append("L");
            for(int i=0;i<l.get(2)-5;i++){
                s.append("X");
            }
        }
        if(l.get(3)==4){
            s.append("IV");
        }
        else if(l.get(3)==9){
            s.append("IX");
        }
        else if(l.get(3)==1||l.get(3)==2||l.get(3)==3){
            for(int i=0;i<l.get(3);i++){
                s.append("I");
            }
        }
        else if(l.get(3)==5){
            s.append("V");
        }
        else if(l.get(3)>5&&l.get(3)<=8){
            s.append("V");
            for(int i=0;i<l.get(3)-5;i++){
                s.append("I");
            }
        }
        return s.toString();
    }
}