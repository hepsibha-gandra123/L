class Solution {
    public String sortVowels(String s) {
        char[] t=s.toCharArray();
        ArrayList<Character> a=new ArrayList<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'||
                t[i]=='A'||t[i]=='E'||t[i]=='I'||t[i]=='O'||t[i]=='U'||){
                a.add(t[i]);
            }
        }
        for(int i=1;i<a.size();i++){
            char key=a.get(i);
            int j=i-1;
            while(j>=0&&a.get(j)>t[i]){
                a.set((j+1),t[i]);
                j--;
            }
            a.set((j+1),key);
        }

        Collections.sort(a);
        for(int i=0;i<s.length();i++){
            if(t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'||
                t[i]=='A'||t[i]=='E'||t[i]=='I'||t[i]=='O'||t[i]=='U'||){
                t[i]=a.get(c);
                c++;
            }
        }
    }
}