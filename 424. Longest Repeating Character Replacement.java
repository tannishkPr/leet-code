class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int maxCount = 0;
        while(end<s.length()){
            map[s.charAt(end)-'A']++;
            int count = map[s.charAt(end)-'A'];
            maxCount = Math.max(maxCount,count);
            while(end-start-maxCount+1>k){
                map[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}
