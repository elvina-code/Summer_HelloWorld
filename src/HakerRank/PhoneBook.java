package HakerRank;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        HashMap<String, Integer> phoneBook = new HashMap<>(); // define map key= name, value = phonenumbers

        int n = in.nextInt();
        in.nextLine();// moving cursor to the next line
        // input
        for(int i= 0; i < n; i++){
            String name = in.nextLine();
            int phoneNumber = in.nextInt();
            phoneBook.put(name, phoneNumber);
            in.nextLine(); // moving cursor again for the next line

        }
        while(in.hasNext()){ // make scanner will wait for input
            String query = in.nextLine();
            if(phoneBook.containsKey(query)){
                System.out.println(query + " = "+phoneBook.get(query) ); // read the queries until end of
            }else{
                System.out.println("Not found");
            }

        }
//        System.out.println(phoneBook.toString());
        // hasnext returns true if scanner has another token in its input. This method may block waiting to scan
    }

}
