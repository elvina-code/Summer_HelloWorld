package ProjectJira.Code;

public class DuplicateArray {
    public static void main(String[] args) {
        String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};

        for (int i = 0; i < strArray1.length-1; i++) {

            for (int j = i+1; j < strArray1.length; j++) {

                if( (strArray1[i].equals(strArray1[j])) && (i != j) ) {


                    System.out.println("Duplicates : "+strArray1[j]);

                }
            }
        }
    }
}


