package ProjectJira.Code;
import java.util.Scanner;
public class RetriveEmail {

    public static void main(String[] args) {
//            Scanner scn = new Scanner(System.in);
//            System.out.println("Enter your email: ");
//
//            String email = scn.next();// zalkar.ai7@gmail.com
//
//            System.out.println("Email id: "+email.substring(0, email.indexOf("@"))+
//                    "\nEmail domain: "+email.substring(email.indexOf(("@"))));
//        }
//    }
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your email: ");

        if (!scn.hasNextDouble()) {
            String email = scn.next();
            System.out.println("Email id: " + email.substring(0, email.indexOf("@")) +
                    "\nEmail domain: " + email.substring(email.indexOf(("g"))));
        } else if (scn.hasNextDouble()) {
            System.err.println("Incorrect input! Please enter your email address.");
        }
    }
}


