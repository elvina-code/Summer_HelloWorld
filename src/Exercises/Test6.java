package Exercises;
//Fix the following code so that it prints every other value in the array arr1 starting with the value at index 0.

public class Test6 {
    public static void main(String[] args) {
                int [] arr1 = {1, 3, 7, 9, 15, 17};
                for (int index = 0; index <= arr1.length; index +=2)
                {
                    System.out.print(index + ", "+arr1[index]+ "\n");
                }
            }
        }


