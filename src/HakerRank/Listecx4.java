package HakerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listecx4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        List<Integer> numberLines = new ArrayList<>();

        Integer n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            numberLines.add(userInput.nextInt());
        }
    }
}
