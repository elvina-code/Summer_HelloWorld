package Exercises;
/*Fix the following method printEvenElements so that it will
print out all of the even Integers that are in the passed-in ArrayList list.
 */
import java.util.ArrayList;
public class ArrayListEvenElements {

        public static void printEvenElements(ArrayList <Integer> list){
            for (int i = 0; i < list.size(); i++)
            {
                if ((int)list.get(i) % 2 ==0)// explicit casting // no need (int)
                {
                    System.out.print(list.get(i) + ", ");
                }
            }
        }
        public static void main(String[] args)
        {
            //instantiate ArrayList and fill with Integers
            ArrayList<Integer> values = new ArrayList<Integer>();
            int[] nums = {1, 44, 7, 9, -16, 3, 2};
            for (int i = 0; i < nums.length; i ++)
            {
                values.add(nums[i]);
            }
            System.out.println("Expected Result:\t 44, -16, 2,");
            System.out.print("Your Result:\t\t ");
            printEvenElements(values);
        }
    }

