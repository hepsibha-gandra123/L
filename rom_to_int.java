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


//chatgpt solution

class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        
        // Define arrays for Roman numeral symbols and their corresponding values
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        // Extract the digits for thousands, hundreds, tens, and units
        int thou = num / 1000;
        int hund = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int unit = num % 10;
        
        // Build the Roman numeral string
        s.append(thousands[thou]);
        s.append(hundreds[hund]);
        s.append(tens[ten]);
        s.append(units[unit]);
        
        return s.toString();
    }
}