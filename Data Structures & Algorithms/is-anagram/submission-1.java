class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
          int[] char_Count = new int[26];
          for(int i=0;i<s.length();i++){
            char_Count[s.charAt(i)-'a']++;
            char_Count[t.charAt(i)-'a']--;
          }

          for(int count:char_Count){
            if(count!=0){
                return false;
            }
          }
        return true;
         
    }
}
