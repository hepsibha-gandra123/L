class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        String prevSort="";
        for(String word:words){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(!sorted.equals(prevSort)){
                result.add(word);
                prevSort=sorted;
            }
        }
        return result;
    }
}

