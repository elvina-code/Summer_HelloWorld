package Firstclass.Array;
//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
public class Arrays {
    public static void main(String[] args) {

        int[] numbersArray = new int [7];//To declare an array, define the variable type with square brackets:
        printIntArray(numbersArray);
        numbersArray[0] = 2;//You access an array element by referring to the index number.
        numbersArray [1] =34;
        numbersArray [2] = 45;
        System.out.println(numbersArray[1]);//34
        numbersArray = new int [9]; // overwrite  a new one from 7 to 98

        System.out.println(numbersArray[8]);// which is 0 cell 0

        final int NUMBER_OF_MONTH = 12;
        String [] nameOfMonths = new String[NUMBER_OF_MONTH]; // or 12

        String [] studentNames = new String[4]; // length is 4 index is 3
        studentNames [0] = "james";
        studentNames [1] = "Mike";
        String [] Class = studentNames;
        System.out.println(Class.equals(studentNames));// true
        System.out.println(Class.toString());// [Ljava.lang.String;@61bbe9ba




        int [] studentGrades = new int[20];
        studentGrades[0] =50;
        studentGrades[4] =89;
        studentGrades [4] = 100;

        System.out.println("the value of 4th index is " + studentGrades[4]); // overwrite from 89 to 100

        int [] dayOfWeeks = {1,2,3,4,5,6,7};
        int day = dayOfWeeks[3] + dayOfWeeks[2]; // --7
        System.out.println("day of week [3] and [2] " +day);

        System.out.println("before incrementing " + dayOfWeeks[1]); //2
        dayOfWeeks[1]++;
        System.out.println("after incrementing " +dayOfWeeks[1]); //3

        printIntArray(dayOfWeeks);

        System.out.println("----------------------------------");
        String []animals = {"dog", "cat", "horse"};
        System.out.println("size of array is " +animals.length);

        for(int i= 0; i < animals.length; i ++){
            System.out.println("The index is " +i+ " the value is " +animals[i]);
        }




        int [] arrays = new int[7];

        for(int i =0; i <= 6; i ++){
            arrays[i] = i +1;
        }
        System.out.println(arrays);


        for(int i =0; i < numbersArray.length; i++){
            numbersArray[i] = i+1;
        }
        for (int j =0; j < numbersArray.length; j++){
            System.out.println(numbersArray[j]);
        }
    }
    public static void printIntArray(int [] numberArray){
        for(int i =0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = " +numberArray[i]);
        }
    }
}
