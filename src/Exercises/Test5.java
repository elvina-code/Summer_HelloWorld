package Exercises;
/*Fill in the method shiftLeftOne below to shift all of the elements of the passed-in ArrayList list left by one.
The original first element should be wrapped to the back of the list after the shift. Ex: {1, 2, 3, 4} should turn turn into {2, 3, 4, 1}
 */

import java.util.ArrayList;
public class Test5 {

        public static void shiftLeftOne(ArrayList<Integer> list) {
            Integer firstElement = list.remove(0);// removes 1
            list.add(firstElement);// adds 1 to the last


        }
        public static void main(String[] args)
        {
            //instantiate ArrayList and fill with Integers
            ArrayList<Integer> values = new ArrayList<Integer>();
            int[] nums = {1, 2, 3, 4, 5};
            for (int i = 0; i < nums.length; i ++)
            {
                values.add(nums[i]);
            }

            System.out.println(values.toString());
            shiftLeftOne(values);
            System.out.println(values.toString());
//            shiftLeftOne(values);
//            System.out.println(values.toString());
//            shiftLeftOne(values);
//            System.out.println(values.toString());
//            shiftLeftOne(values);
//            System.out.println(values.toString());
//            shiftLeftOne(values);

            System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
            System.out.println("Your Result:\t\t " + values);
        }
    }

