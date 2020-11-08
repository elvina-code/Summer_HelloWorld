package Firstclass;

public class AboutTruth {
    public static void main(String [] args){
        int apples = 10;
        int peaches = 16;

        boolean isEqual = apples == peaches;
        boolean isNotEqual = apples !=peaches;

        boolean applesGreaterThanPeaches = apples > peaches;
        boolean applesLessThanPeaches = apples < peaches;

        boolean applesGreaterThenOrEqualTo = apples >= peaches;
        boolean applesLessThenOrEqualTo =apples <= peaches;


        System.out.println(apples + " is equal to " +peaches + " = " + isEqual);
        System.out.println(apples + " is  not equal to " +peaches + " = " + isNotEqual);

        System.out.println(apples + " is greater than " +peaches + " = " + applesGreaterThanPeaches);


        System.out.println(apples + " is less than " +peaches + " = " + applesLessThanPeaches);

        System.out.println(apples + " is greater than or equal to " +peaches + " = " + applesGreaterThenOrEqualTo);
        System.out.println(apples + " is less than or equal to " +peaches + " = " + applesLessThenOrEqualTo);

    }
}
