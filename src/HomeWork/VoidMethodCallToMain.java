package HomeWork;

public class VoidMethodCallToMain {
    public static void main(String[] args) {
        int mark = 49;
        System.out.println("The mark is "+ mark);

        CheckedPassFail(mark);

    }
    public static void CheckedPassFail(int number){
        if(number <= 49){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
}
