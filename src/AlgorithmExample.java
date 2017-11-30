import java.lang.reflect.Array;
import java.util.*;

public class AlgorithmExample {

    public static void main(String[] args) {

        String x = "Liselotte";
        //int rettetTal = 0;
        boolean erFundet = false;
//opretter mit String array med 6 pladser,  efterfølgende assigner jeg de forskellige pladser med en String - i dette tilfælde navne
        String[] names = new String[6];
        names[0] = "Lasse";
        names[1] = "Michael H";
        names[2] = "Niels";
        names[3] = "Liselotte";
        names[4] = "Kasper";
        names[5] = "Lisa";
//min for løkke - starter ved i = o og kører hver gang indtil i = 6.
        for (int i = 0; i < 6; i++) {
            //System.out.println(i);
           // System.out.println(names [5]);
            if (names[i] == x) {
                //rettetTal = i+1;
                erFundet = true;
                System.out.println(x + " er fundet som elev nummer " + i);

            }

        }
        if (erFundet == false){
            System.out.println(x + " er ikke fundet");
        }
    }
}





            



        /*ArrayList<String> names = new ArrayList<>();

        names.add("Michael");
        names.add("Kasper");
        names.add("Lasse");
        names.add("Niels");
        names.add("Liselotte");
        names.add("Mathias");
        names.add("Lisa");


        System.out.println("Følgende personer er i klassen " + names);*/



