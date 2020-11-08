package Firstclass.HashMap;

import java.util.HashMap;

public class HashMapEvenOddFreq {
//    using array create a map and calculate even and odd.
//1.create A hashmap
//2.ittireate through array of numbers and
//      if the number is even, update value of map "even" +1
//      if the number is odd, update value of map "odd" +1
//3.return hashmap
public static void main(String[] args) {
    HashMapEvenOddFreq hashMapEvenOddFreq = new HashMapEvenOddFreq();
     int [] array = {1,2,3,4,5,6,7};
    System.out.println(hashMapEvenOddFreq.calculateFreqEvenOdd(array));



}
public HashMap<String, Integer> calculateFreqEvenOdd(int [] array){ // String as a key will be for even and odd


    HashMap<String, Integer> resultMap = new HashMap<>();
    resultMap.put("even", 0);
    resultMap.put("odd", 0);

    for(int i= 0; i < array.length; i++){
        if(array[i] % 2 ==0){
            Integer count = resultMap.get("even");// get the value of even
            resultMap.put("even", count +1);

        }else {
            resultMap.put("odd", resultMap.get("odd")+1);
//            Integer count = resultMap.get("odd");
//            resultMap.put("odd", count +1);
        }
    }

    return resultMap;
}

}
