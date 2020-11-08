package Firstclass;

public class StringExcersices {
    public static void main(String[] args) {
        int apple = 10;
        int bananas = 9;
        String appleName = "Apple";
        String bananaName = new String("bananas");// same thing as apple

        String sentence1 = "I have " + apple + "of " + appleName;
        String sentence2 = "I have " + bananas + "of " + bananaName;
        String sentence3 = "Total " + (apple + bananas) + "of " + appleName + "and" + bananaName;
        String sentence4 = "Total " + apple + bananas + "of " + appleName + "and" + bananaName;
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);

        char someCharacter =appleName.charAt(0);// capital A of apple 01234
        char lastCharacter = bananaName.charAt(bananaName.length()-1);// bananas 7 letters takes 8-1 comes s
        System.out.println(someCharacter);
        System.out.println(lastCharacter);

        String setOfWords = "ballabscountryabcdcake";
        String cake =setOfWords.substring(18); // not 17
        System.out.println("The cake is " + cake );

        String country = setOfWords.substring(7,14);
        System.out.println("the country "+ country);

        String ball = setOfWords.substring(0,4);// new word starts with 0
        System.out.println("the ball "+ ball);

        System.out.println(country.concat(ball));// countryball
        System.out.println(country.concat(ball.concat(cake)));//countryballcake

        System.out.println("The index of c is "+setOfWords.indexOf('c')); // index of char
        System.out.println("The index of ball is " +setOfWords.indexOf("ball")); // index of string ball starts with 0

        String bagOfWords= "ballabccountryabcdcakeabsball";
        System.out.println("the index of b " +bagOfWords.indexOf("ball",3));// third b???
        System.out.println("the index of c "+ bagOfWords.indexOf('c',5));
        System.out.println("Last index of ball " +bagOfWords.lastIndexOf("ball"));// string last ball 25
        System.out.println("Last index of a " + bagOfWords.lastIndexOf('a'));// character last a 26

        String month9 = "September";
        String month9_1= "september";
        System.out.println("September equals september"+(month9.equals(month9_1)));
        System.out.println("September == september" + (month9==month9_1));
        if(month9==month9_1) {
            System.out.println("September is september");
        }else{
            System.out.println("September is not september");
        }

        String peach ="Peach";
        String peachObject = new String ("peach");
        String peach_2 = "peach";
        System.out.println("peach is equals to peachObject " +(peach.equals(peachObject)));//false
        System.out.println("peach is == to peachObject " +(peach ==peachObject)); //false
        System.out.println("peach is ==to peach_2 " +peach == peach_2); // false
        System.out.println("compare with ignoring case " + peach.equalsIgnoreCase("peach")); //true

        System.out.println("some text in lowercase".toUpperCase());
        System.out.println("SOME TEXT IN UPPERCASE".toLowerCase());



        String username = "Password   ";
        System.out.println(username.length()+"--> length before trim");
        System.out.println(username.trim().length() + "--->length after trim");

        System.out.println("banana".replace('a', 'o'));

        String someS = "June06July07August08";
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
        //index of character 'a'
        int myindex = someS.indexOf('a');
        //extract word august
        String august = someS.substring(12, 18);
        System.out.println("Changing august to capital (a) " +august);
        System.out.println(someS.trim().toLowerCase().substring(12,18).toUpperCase());

        int someVal = 65;
        char someChar = (char)someVal;
        int intValueOfB = (int)'B';

        System.out.println(someChar);
        System.out.println(someVal);
        System.out.println(intValueOfB);

        String s = "Hello World";
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf(3, 0));
        System.out.println(s.charAt(3));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.charAt(s.length()-1));
    }
}
