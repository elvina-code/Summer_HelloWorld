package Exercises;

public class MergeTwoWords {
    public static void main(String[] args) {
        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + " , " + word2);
        new MergeTwoWords().printMerge(word1, word2);

    }
    public void printMerge(String word1, String word2) {
        String result = "";
        if (word1.length() > 3 || word2.length() > 3) {
            System.out.println("Incorrect input! Cannot merge");
        } else {
            for (int i = 0; i < word1.length(); i++) {
                result = result + word1.charAt(i);
                result = result + word2.charAt(i);
            }
        }
        System.out.println(result);
    }
}

    /*String word1 = "ice";
    String word2 = "sea";
        System.out.println("Merging words: " + word1 + ", " + word2);
                // MergeTwoWords m = new MergeTwoWords();
                //String merge = m.printMerge(word1, word2);
                //System.out.println(merge);

or we can do like this:

                //new MergeTwoWords().printMerge(word1, word2);
                }

public String printMerge(String word1, String word2) {
        String result = "";
        if (word1.length() > 3 || word2.length() > 3) {
        System.out.println("Cannot merge");
        } else {
        for (int i = 0; i < word1.length(); i++) {
        result = result + word1.charAt(i);
        result = result + word2.charAt(i);
        }

        }

        return result;
        }
*/