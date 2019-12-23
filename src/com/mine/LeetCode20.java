package com.mine;

import java.util.Stack;

/**
 * 150 71
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                Character c = stack.pop();
                Character match;
                if (s.charAt(i) == ')') {
                    match = '(';
                } else if (s.charAt(i) == ']') {
                    match = '[';
                } else {
                    assert s.charAt(i) == '}';
                    match = '{';
                }
                if (!c.equals(match)) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
