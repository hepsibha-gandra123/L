class Solution {
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':
                result=result+1000;
                break;
                case 'D':
                result=result+500;
                break;
                case 'C':
                if(i+1<s.length()&&s.charAt(i+1)=='M'){
                    result=result+900;
                    ++i;
                }
                else if(i+1<s.length()&&s.charAt(i+1)=='D'){
                    result=result+400;
                    ++i;
                }
                else{
                    result=result+100;
                }
                break;
                case 'L':
                result=result+50;
                break;
                case 'X':
                if(i+1<s.length()&&s.charAt(i+1)=='C'){
                    result=result+90;
                    ++i;
                }
                else if (i+1<s.length()&&s.charAt(i+1)=='L'){
                    result=result+40;
                    ++i;
                }
                else{
                    result=result+10;
                }
                break;
                case 'V':
                result=result+5;
                break;
                case 'I':
                if(i+1<s.length()&&s.charAt(i+1)=='V'){
                    result=result+4;
                    ++i;
                }
                else if(i+1<s.length()&&s.charAt(i+1)=='X'){
                    result=result+9;
                    ++i;
                }
                else{
                    result=result+1;
                }
                break;
            }
        }
        return result;
    }
}
