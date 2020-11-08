package Firstclass;

public class SB {
    public static void main(String[] args) {
        String name = "john";
        name.concat("+Sam");
        System.out.println(name);

        String name2= name.concat("+Belle");
        System.out.println(name2);

        String st ="Sharing is Caring";


        int indexOfFirstSpace= st.indexOf(" ");
        System.out.println(st.indexOf("ing", indexOfFirstSpace));
        int indexar=st.indexOf(" ");
        System.out.println(st.indexOf("ar", indexar));
        int secondSpace= st.indexOf(" "+indexar +1);
        System.out.println(st.indexOf("is", secondSpace));
        System.out.println(st.lastIndexOf("in"));


        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println(sb);
        StringBuilder sb1 = sb.append("+end");
        System.out.println(sb1);

        String st4= sb.toString();// to make a String immutable
        st4.toLowerCase().trim(); // to be able to use String methods
        System.out.println(st4);
        StringBuilder sb6= new StringBuilder(st4);
        System.out.println(sb6);



        StringBuilder sb2 =new StringBuilder("9294849889");
        sb2.insert(3, " ").insert(7, "-").insert(10,"-");
        System.out.println(sb2);

        StringBuilder zipCode = new StringBuilder(" Brooklyn, NY, 11235");
        zipCode.delete(0,zipCode.lastIndexOf(" ")+1);
        System.out.println(zipCode);
        System.out.println(zipCode.charAt(4));
        System.out.println(zipCode.deleteCharAt(4));
        System.out.println(zipCode.insert(4, "5"));
        zipCode.reverse();
        System.out.println(zipCode);


    }
}
