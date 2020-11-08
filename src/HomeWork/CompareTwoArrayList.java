package HomeWork;

import java.util.ArrayList;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> firstColors = new ArrayList<>();
        firstColors.add("red");
        firstColors.add("green");
        firstColors.add("black");
        firstColors.add("white");
        firstColors.add("pink");

        System.out.println(firstColors);

        ArrayList<String> secondColors = new ArrayList<>();
        secondColors.add("red");
        secondColors.add("green");
        secondColors.add("black");
        secondColors.add("pink");
        System.out.println(secondColors);


        ArrayList<String> thirdColors = new ArrayList<String>();
        for (String tempList : firstColors)    //tempList is  a variable
            thirdColors.add(secondColors.contains(tempList) ? "Yes" : "No");
        System.out.println(thirdColors);


    }
}
//        secondColors.retainAll(firstColors);
//        System.out.println("Common elements in both list: " + secondColors);