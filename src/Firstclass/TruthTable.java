package Firstclass;

public class TruthTable {
    public static void main(String [] args){

        int ageOfAnn = 18;
        int ageOfBob =15;

        char maritalStatus = 'u';
        int age = 33;
        int height = 180; // if 181
        int weight = 60;  // if 71 then is true

        int y, m, d;
        y = 2010;
        m = 9;
        d = 15;


        boolean isEleigible = (maritalStatus == 'u') && (age >= 21 && age <= 35) && (height >180) && (weight > 70 && weight < 80);// true true true false =false


        boolean experiment1 = (ageOfAnn < ageOfBob) || !(ageOfAnn >= ageOfBob) && (ageOfBob != ageOfBob); // false -!true(->false) - false
        boolean experiment2 =!((ageOfAnn > ageOfBob)||(ageOfAnn<=ageOfBob) && !(ageOfAnn ==ageOfBob)); // true false !false(->true) so  !(true||false&&true)=false

        boolean isDateInRange = (y <=2010 ) && (d >= 1 && d <= 15) && (m>= 1 && m <= 10);

        String experiment3 = (y <= 2010) ? "YES": "No";

        int experiment4 = (d >= 15) ? 15: 5;

        System.out.println("Experiment4," + ((d > 15) ? "Greater" : "Smaler"));// no 0 amount instaed of Smaller// you can add +experiment4 -->5


        System.out.println("experiment 3, :" + experiment3);


        System.out.println(y + " Year,"  + m + "Month," + d + "Day is in Range" + isDateInRange);

        System.out.println(experiment1);
        System.out.println(experiment2);



    }
}
