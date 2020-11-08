package Firstclass.Array;
import java.util.ArrayList;

public class ArrayDuplicateDetect {
    public static void main(String[] args) {
        String [] cities = {"Chicago", "NY", "SF", "London", "Johannesburg", "Bishkek", "Almaty", "NY", "Almaty", "London" };
        ArrayList <String> listOfCities = new ArrayList<>();
        for(int i =0; i < cities.length; i ++){
            listOfCities.add(cities[i]);

            System.out.println(listOfCities.toString());
        }
        for(int i = 0; i< listOfCities.size(); i++){
            for(int j = i +1; j<listOfCities.size(); j++){
                if(listOfCities.get(i).equals(listOfCities.get(j))){
                    System.out.println("Duplicate detected " + listOfCities.get(i));
                }
            }
        }
        System.out.println(listOfCities.toString());
    }
}
