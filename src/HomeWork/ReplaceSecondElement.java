package HomeWork;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("green");
        System.out.println("Original array list "+ color);

        String newColor ="white";
        color.set(1, newColor);
        System.out.println("Replace second element with white");
        for(int i=0; i< color.size(); i++){
            System.out.print(color.get(i) +" ");
        }
    }
}
