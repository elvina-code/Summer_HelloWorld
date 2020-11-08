package HomeWork;
//Please write a program that prints all elements of the ArrayList then try to find "Red" color and print out:
// Found the element or there is no such elements.

import java.util.ArrayList;

public class SearchElementArrayList {
    public static void main(String[] args) {
        //ArrayList listColor = new ArrayList();
        String[] colors = {"red", "green", "orange", "white", "black"};

        ArrayList<String> listOfColors = new ArrayList<>();
        for (int i = 0; i < colors.length; i++) {
            listOfColors.add(colors[i]);
        }
        System.out.println(listOfColors.toString());

        if (listOfColors.contains("red")){
            System.out.println("Found the element");
        } else {
            System.out.println("there is no such elements");
        }
    }
}




