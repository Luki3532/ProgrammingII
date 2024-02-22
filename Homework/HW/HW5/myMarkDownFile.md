# C201/A506/I211 Homework Assignment #5 Spring 2024

## Preparation:

Make sure that you have completed Lab Assignment #3 before doing this assignment. In this
assignment, you will solve a problem using the top-down approach and following the problem
solving skills highlighted in this week’s lecture.

## Description:

##### Given two strings, determine whether they are anagrams of each other, meaning that they contain the same letters but in a different order. Lowercase and uppercase letters are considered the same. For simplification, we will only look at cases made of a single word without punctuation. 
##### Here are some examples: "read" and "dare"; "Listen" and "Silent"; "add", "dad"; "Elvis" and "lives".

## Procedure:

##### 1. Study and discuss the problem to ensure that you fully understand it. Then, write a solution plan and then refine the plan. Discuss special cases.
##### 2. Write an algorithm in pseudo code to solve the problem.
##### 3. Implement the algorithm in Java and debug it. Name the file “anagram.java” and structure your class(s) accordingly.
##### 4. Think about all the cases that you will need to test to ensure the correctness of your program. Then, execute the code testing for these cases. Correct any errors that become evident as a result of these tests.
##### 5. Make sure to document the work that you have done for all of the above steps (1-4).To do this, create a word processing document in .doc/.docx format that contains the solution plan, the pseudocode and a list of test cases with the expected results for each of
them.

## Submission:

\*) Make sure that your program (anagram.java) is properly documented and styled.
\*) Upload the .java file and the .doc/.docx file to the Homework Assignment #5 Canvas
folder.
\*) If you have not already done so, make sure that you upload the two files from Lab #3 to
the Canvas Lab Assignment #3 folder.

# LAB ASSIGNMENT 3
## Description:
Given a string, determine whether it is a palindrome. A palindrome is a word or phrase that reads the same forwards and backwards. Lowercase and uppercase letters are considered the same, and punctuation and spaces can be ignored. Here are some examples: "civic", "kayak", "mom", "Anna", "Racecar", "Step on no pets", "A man, a plan, a canal, Panama!".

## Procedure:
1) Study and discuss the problem to ensure that you fully understand it. Then, write a solution plan and then refine the plan. Discuss special cases.
2) Write an algorithm in pseudo code to solve the problem.
3) Implement the algorithm in Java and debug it. Name the file “palindrome.java” and structure your class(s) accordingly.

```java
public class Palindrome {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
