package Firstclass.HashMap;

import java.util.*;

public class HashMapEcx {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Map<Integer, String> zipAndCity = new HashMap<>();
        Map<Integer, Integer[]> numberToArrays = new HashMap<>();
        Map<Integer, Set<String>> numberToSets = new HashMap<>();


        System.out.println("inserting .. " + zipAndCity.put(11111, "Washington"));
        System.out.println("inserting2 .. " + zipAndCity.put(11111, "Boston"));

        zipAndCity.put(60610, "Chicago");
        System.out.println(zipAndCity.get(60610));


        zipAndCity.put(60611, "Chicago");
        zipAndCity.put(60612, "Oklahoma");
        zipAndCity.put(60613, "Orlando");
        zipAndCity.put(60614, "Milwauke");
        zipAndCity.put(60615, "Sokramento");
        zipAndCity.put(60617, "Chicago");
        Iterator<Integer> zipIterator = zipAndCity.keySet().iterator();
        while(zipIterator.hasNext()){
            int zip = zipIterator.next();
            String city = zipAndCity.get(zip);
            System.out.println(zip+ "-->" +city);
        }


        System.out.println("Please enter ZIP code to get name of the city");
        Integer zipCode = userInput.nextInt();
        System.out.println("The city is "+zipAndCity.get(zipCode));
        System.out.println("Check key if it is present");
        Integer zipCode1 = userInput.nextInt();
        System.out.println(zipCode1 + " is Present "+zipAndCity.containsKey(zipCode1));

        System.out.println("removing " + zipAndCity.remove(60617));
        System.out.println("removing1 " + zipAndCity.remove(60617));

        System.out.println("replacing " + zipAndCity.put(60615, "Sacramento"));
        System.out.println(zipAndCity.get(60615));
        System.out.println("size of the map is "+zipAndCity.size());

        Set<Integer> zipCodes = zipAndCity.keySet();
        for (Integer zip: zipCodes) {
            System.out.println("zip by keySet: "+zip + " belongs to city "+zipAndCity.get(zip));
        }
        System.out.println();

        Iterator<Integer> keySetIterator = zipCodes.iterator();
        while (keySetIterator.hasNext()){
            Integer key = keySetIterator.next();
            System.out.println("zip by Iterator: "+ key + " belongs to city " + zipAndCity.get(key));
        }

        System.out.println();
        Collection<String> cityList = zipAndCity.values();
        for (String val: cityList) {
            System.out.println("Value city is "+val);
        }
    }
}

