package HomeWork;
//Given array (elements): 10 11 12 13 14
//Output:
//Odd numbers in the array are : 10 12 14
//Even numbers in the array are : 11 13
public class OddEvenArray {
    public static void main(String[] args) {
        int [] arr = {10,11,12,13,14};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 ==0){

                System.out.println("Even numbers in the array are " + arr[i]);
            }else {
                System.out.println("Odd numbers in the array are " + arr[i]);
            }

        }
    }
}
