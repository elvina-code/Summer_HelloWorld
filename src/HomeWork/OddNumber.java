package HomeWork;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class OddNumber {
    /*Write a program in Java to display the n terms of odd natural number and their sum.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25*/



    public static void main(String[] args) {

        System.out.println("The odd numbers are :");
        int sum =0;
        for(int i =1; i <= 10; i =i+2){
            sum +=i;
            System.out.println(i);
        }
        System.out.println("The Sum of odd Natural Number up to 5 terms is:" +sum);
    }

}















