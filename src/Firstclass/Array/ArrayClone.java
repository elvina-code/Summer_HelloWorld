package Firstclass.Array;
//Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayClone {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 2);
        addIfNotExists(list1, 3);
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 3);
        System.out.println(list1.toString());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(100);
        System.out.println(list2.toString());

//            ArrayList<Integer> list3 = commonElementsWithCOntains(list1, list2);
//            System.out.println("The common elements are "+list3.toString());
//            ArrayList<Integer> list4 =diffElements(list1,list2);
//            System.out.println("The different elements are "+list4.toString());

//            ArrayList<Integer> list5 =mergeElements(list1,list2);
//            System.out.println("The merge elements are "+list5.toString());
//
//
//            ArrayList<Integer> list6 = mergeTwoLists(list1, list2);
//        System.out.println("The total of two arrays are" + list6.toString());

        ArrayList<Integer> list8 = cloneTheList(list1);
        System.out.println("clone list1" + list8.toString());

        ArrayList<Integer> list7 = cloneTheListByClone(list1);
        System.out.println("clone list1" + list7.toString());
    }

    /*public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1: list1){
            for (Integer element2: list2){
                if (element1.equals(element2)){
                    addIfNotExists(commonList, element1);
                }
            }
        }
        return commonList;
    }*/
//        public static ArrayList<Integer> commonElementsWithCOntains(ArrayList<Integer> list1, ArrayList<Integer> list2){
//            ArrayList<Integer> commonList = new ArrayList<>();
//            for (Integer element1: list1) {
//                if (list2.contains(element1))
//                    addIfNotExists(commonList, element1);
//            }
//            return commonList;
//        }
    public static Boolean addIfNotExists(ArrayList<Integer> list, Integer element) {
        if (!list.contains(element)) {
            list.add(element);
            return true;
        } else {
            return false;
        }
    }
//        public static ArrayList<Integer> diffElements (ArrayList<Integer> list1, ArrayList<Integer> list2){
//            ArrayList<Integer> commonList = new ArrayList<>();
//            for(Integer element1: list1) {
//                if (!list2.contains(element1))
//                    addIfNotExists(commonList, element1);
//            }
//            for(Integer element2: list2){
//                if(!list1.contains(element2))
//                    addIfNotExists(commonList,element2);
//            }
//            return commonList;
//        }

    public static ArrayList<Integer> mergeElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1 : list1) {
            for (Integer element2 : list2) {
                if (!element1.equals(element2))
                    addIfNotExists(commonList, element1);
                addIfNotExists(commonList, element2);
            }
        }
        return commonList;
    }

    public static ArrayList<Integer> mergeTwoLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.addAll(b);
        return a;
//        ArrayList<Integer> mergedList = new ArrayList<>();
//
//        mergedList.addAll(a);
//        mergedList.addAll(b);


//        for (Integer element : a) {
//            mergedList.add(element);
//        }
//        for(Integer element2 : b){
//            mergedList.add(element2);
//        }
//        return mergedList;

    }

    public static ArrayList<Integer> cloneTheList(ArrayList<Integer> list){
        ArrayList<Integer> cloneList = new ArrayList<>();
        for (Integer element : list) {
            cloneList.add(element);
        }
        return cloneList;

    }
    public static ArrayList<Integer> cloneTheListByClone(ArrayList<Integer> list){
        return (ArrayList<Integer>)list.clone();
    }
}
