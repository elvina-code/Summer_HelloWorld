package Exercises;



public class NamePlay {
    public static void main(String[] args) {
        NamePlay x = new NamePlay();
        String fullName = "elvina begimbaeva";

        System.out.println("Full name is " + x.convertToUpperCaseFirstLetters(fullName));
        System.out.println("First name is " + x.getFirstName(fullName));
        System.out.println("Last name is " + x.getLastName(fullName));
        System.out.println("Initials " + x.getInitials(fullName));




    }
    public String convertToUpperCaseFirstLetters (String fullname){
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);

        firstName = Character.toUpperCase(firstName.charAt(0))+firstName.substring(1);
        lastName = Character.toUpperCase(lastName.charAt(0))+ lastName.substring(1);
        return  firstName + " " +  lastName;
    }

    public String getFirstName(String fullname){
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        firstName = Character.toUpperCase(firstName.charAt(0))+firstName.substring(1);
        return  firstName;

    }
    public String getLastName(String fullname){
        String lastName = fullname.substring(fullname.indexOf(" ")+1);
        lastName = Character.toUpperCase(lastName.charAt(0))+lastName.substring(1);
        return lastName;

    }

    public String getInitials(String fullname){
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);
        //String initials = Character.toUpperCase(firstName.charAt(0))+ " " + Character.toUpperCase(lastName.charAt(0));
        String initials = String.valueOf(firstName.charAt(0) + " " + lastName.charAt(0)).toUpperCase();
        //return initials.toUpperCase();
        return initials;

    }

}
