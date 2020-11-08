package Firstclass.Array;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "I love Java, java is a cool programming language and java is more useful than javascript, python python";

        String [] arr = sentence.split(" ");

        int countJava = 0;
        int countPython = 0;

        for(int i = 0; i < arr.length; i++){
            String eachWord = arr[i];
            if(eachWord.toLowerCase().contains("java")){
                countJava ++;
            }
            if(eachWord.toLowerCase().contains("python")){
                countPython ++;
            }


        }
        System.out.println("java " + countJava);
        System.out.println("python " + countPython);


    }
}
