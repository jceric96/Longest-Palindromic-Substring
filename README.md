## Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.

questiones:
1. what's the range of string s(at least one)?
2. Dose s consist of digits and English letter together(or only digits, only English letters)? 
3. Is the result unique?(if I input "ababd" should return "aba" and "bab" together 
                         or just return only one result)


Constraints:

1. 1 <= s.length <= 1000
2. s consist of only digits and English letters.
3. just return only one result

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"