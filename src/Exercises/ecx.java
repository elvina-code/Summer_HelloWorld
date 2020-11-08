package Exercises;

import HomeWork.StringReplace;

import java.util.ArrayList;
import java.util.List;

public class ecx {
    public static void main(String [] args){
        StringBuilder str = new StringBuilder(5);
        String s = "";
        if(str.equals(s)){
            System.out.println("match 1");
        }else if(str.toString().equals(s)){
            System.out.println("match2");
        }else{
            System.out.println("no match");
        }

        String result="true";

        switch (result){
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("****");
        }
        System.out.println("done");


        int num=5;
        do{
            System.out.print(num--+ "");
        }
        while(num ==0);

        System.out.println();

        int x=100;
        int a1 = x++;
        int b1 =++x;
        int c1 =x++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        String [][] chs = new String [2][];
        chs [0]= new String[2];
        chs [1]= new String[5];
        int i= 97;
        for(int a =0; a< chs.length; a++){
            for(int b = 0; b< chs.length; b++){
                chs [a][b]= " "+i;
                i++;
            }


        }
        for(String [] ca : chs){
            for(String c :ca){
                System.out.println(c+ " ");
            }
            System.out.println();
        }

        List <String> names = new ArrayList<>();
        names.add("Rob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names);




        int x1=5;
        while(isAvailable(x1)){
            System.out.println(x1);
            x1--;
        }


    }
    public static boolean isAvailable(int x){
        return x > 0 ? true: false;
    }
}
