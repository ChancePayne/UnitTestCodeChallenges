package com.lambdaschool.unittestcodechallenges;

public class ReverseStringChallenge {
    public static String reverseString(String text) {
        StringBuilder builder = new StringBuilder();
        if(text != null) {
            for (int i = text.length() - 1; i >= 0; --i) {
                builder.append(text.charAt(i));
            }
        }
        return builder.toString();
    }
}
