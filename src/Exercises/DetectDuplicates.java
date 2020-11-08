package Exercises;

public class DetectDuplicates {
    public static void main(String[] args) {
        String arrString = "adhfhfhhhhhhhhasjfjfjaaaaaaa";
        int duplicateCounter;
        for( int i =0; i < arrString.length(); i ++){
            duplicateCounter =0;

            for(int j =i+1 ; j < arrString.length(); j++){
                if(arrString.charAt(i)== arrString.charAt(j))
                    duplicateCounter++;
            }

            System.out.println(arrString.charAt(i)+ ""+ duplicateCounter);
        }

    }
}
