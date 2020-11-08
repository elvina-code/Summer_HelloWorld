package Firstclass;
import java.util.Random;

public class DevxPicker {
    public static void main(String [] args){
        final int Number_Of_Students = 22;
        Random picker = new Random();
        int pickedNumber = picker.nextInt(Number_Of_Students);
        System.out.println("I have picked: " +pickedNumber);

    }
}
