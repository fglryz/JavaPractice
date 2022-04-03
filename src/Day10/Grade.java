package Day10;

public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        String level;

            if (grade == 'A') {
            level ="'A' : Excellent";

        }   else if (grade == 'B') {
            level = "'B': Great job";
        }   else if (grade == 'C') {
            level = "'C' : Good";
        }   else if (grade == 'D') {
            level = "'D': Passed";
        }   else if (grade =='F') {
            level = "'F': Failed";}

        else {
                level = "Invalid Grade";
            }
            System.out.println(level);


        }}




/*
Create a class called Grade, a char variable named grade is given. write a
program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */