class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int pointer_a = 0, pointer_b = 0, max = 0;
        HashSet<Character> hs = new HashSet();
        while(pointer_b < s.length())
        {
            if(!hs.contains(s.charAt(pointer_b)))
            {
                hs.add(s.charAt(pointer_b));
                pointer_b++;
                max = Math.max(max, hs.size());
            }
            else 
            {
                hs.remove(s.charAt(pointer_a));
                pointer_a++;
            }
        }
        return max;
    }
}