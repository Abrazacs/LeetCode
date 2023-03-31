package ru.sergeysemenov;

import java.util.*;

public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        int left =0;
        int right=0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(chars[0],0);
        int maxSize =1;
        for (int i = 1; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                left = Math.max(left, map.get(chars[i])+1);
            }
            right++;
            map.put(chars[i],i);
            maxSize = Math.max(maxSize, right-left+1);
        }
        return maxSize;
    }
}
