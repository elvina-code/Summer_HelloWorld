package Trial;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ArrayExs1 {
    public static void main(String[] args) {
        int [][] worldPopulation = {
    //states-->  0 1 2 3 4 5
                {16,276,387,48,5,654},// [0] country 1
                {156,27,35,49,50}, //  [1] country 2
                {123,24,378}     //  [2] country 3
        };
        System.out.println("world population " +worldPopulation + " and length is " + worldPopulation.length );
        System.out.println("world population [0]" +worldPopulation [0] + " and length is " + worldPopulation[0].length );
        System.out.println("world population [1] " +worldPopulation [1]+ " and length is " + worldPopulation[1].length );
        System.out.println("world population [2] " +worldPopulation [2]+ " and length is " + worldPopulation[2].length );
        //read signle element:
        System.out.println("world population [0] [2] " + worldPopulation[0][2]);
        //write update data
        worldPopulation[0][2]= 777;
        System.out.println("world population [0] [2] " + worldPopulation[0][2]);

        for(int i =0; i<worldPopulation.length; i++){ //0--2
            for(int j =0; j<worldPopulation[i].length; j++){
                System.out.println(worldPopulation[i][j] +"");
            }
            System.out.println();
        }


    }
}
