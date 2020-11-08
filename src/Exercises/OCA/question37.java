package Exercises.OCA;

public class question37 {

        static int count = 0;
        int i = 0;

        public void changeCount(){
            while(i < 5){
                i++;
                count++;

            }
        }
        public static void main (String[] args){

            question37 check1 = new question37();
            question37 check2 = new question37();
            check1.changeCount();
            check2.changeCount();
            System.out.print(check1.count + " : " + check2.count);


        }
    }

