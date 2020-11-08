package Firstclass;

public class ForLoopExc {
    public static void main(String[] args) {
        String word = "devxschool";

        StringBuilder reverseWordBuilder = new StringBuilder();

        /*for(int i =0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        for(int i =word.length()-1; i >= 0; i--){
            System.out.println(word.charAt(i));
        }
        */
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWordBuilder.append(word.charAt(i));
            System.out.println(reverseWordBuilder.toString());
        }
    }
}
