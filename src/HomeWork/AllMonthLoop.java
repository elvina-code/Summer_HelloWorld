package HomeWork;

import java.util.Arrays;

//a) Print out all months
//
//b) By using index find the your birthday month among the String array below.
public class AllMonthLoop {
    public static void main(String[] args) {
        String m ="Apr";
        String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(Arrays.toString(MONTHS));

        for(int i =0; i<MONTHS.length; i++){
            if(MONTHS[i].equals(m)){
            }
        }
        System.out.print(m);
    }



}
