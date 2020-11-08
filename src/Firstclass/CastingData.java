package Firstclass;

public class CastingData {
    public static void main(String []args){
        boolean a = true;//initial value of a is set to true;
        System.out.println("boolean a = true; " + a);
        a = !a;//now the value of a is set to false;
        System.out.println("a = !a; " + a);

        boolean weekday = true; //true --> !true = false;
        boolean vacation = false;

        if(weekday && !vacation){
            System.out.println("Vacation");
        }
        else if(weekday && !vacation){
            System.out.println("Weekday");
        }
        else {
            System.out.println("Weekend");
    }

    }
}
