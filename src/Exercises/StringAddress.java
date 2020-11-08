package Exercises;

public class StringAddress {
    public static void main(String[] args) {
        String address = "160 Pearl, New York, NY 10005";
        StringAddress s = new StringAddress();


        System.out.println(""+s.getStreet(address));

        System.out.println(""+s.getCity(address));
        System.out.println("" +s.getState(address));
        System.out.println("" +s.getZipCode(address));


    }
    public String getStreet (String address){
        int indexOfFirstComma = address.indexOf(",");
        String street = address.substring(0, indexOfFirstComma);
        return street;

    }
    public String getCity (String address){
        int indexOfFirstComma = address.indexOf(",");
        int indexOfLastComma=address.lastIndexOf(",");
        String city = address.substring(indexOfFirstComma+2, indexOfLastComma);
        return city;

    }
    public String getState (String address){
        int indexOfLastComma = address.lastIndexOf(",");
        int endIndex = address.lastIndexOf(" ");
        String state = address.substring(indexOfLastComma +2, endIndex);
        return state;

    }
    public int getZipCode(String address){
        int endIndex = address.lastIndexOf(" ");
        int lastIndex = address.length();
        String zipCode = address.substring(endIndex+1,lastIndex);
        return Integer.parseInt(zipCode);

    }


}
