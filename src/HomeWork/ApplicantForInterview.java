package HomeWork;

import java.util.Scanner;

public class ApplicantForInterview {
   /* Write a function which will ask user for:
            1. years in college
2. years of programming experience
3. GPA
    and return true or false.
    An applicant must meet two conditions to be called for interview:
        4 or more years of college, AND

2 years experience programming in Java OR a grade point average greater than 3.5.
*/
   public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter your years in college");
       int years = scanner.nextInt();
       System.out.println("Enter your years of programming experience ");
       int yearsExperience = scanner.nextInt();
       System.out.println("Enter your GPA");
       double gradeGPA= scanner.nextDouble();

       if(years >= 4 && yearsExperience >= 2 || gradeGPA >=3.5){
           System.out.println("You have entered");
       }else{
           System.out.println("You have not selected");
       }

   }
}
