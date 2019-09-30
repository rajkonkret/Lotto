import java.beans.PropertyEditorSupport;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {

    public static void main(String[] args) {
       // int[] spool = new int[6];
        int i;
        int j;
        boolean itis = false;
        int result = 0;
        //spool[1] = 1;
        Random rnd = new Random();
        System.out.println("Generator Lotto by RJ");
        /*for (i=0 ; i<6 ; i++){
            spool[i]=0;
            }*/
       /* clear.clearall(spool);
        for (int a : spool) {
            System.out.print(spool[a] + " ");
        }

        System.out.println(spool.length);*/
        for (j = 1; j <= 4000; j++) {
            System.out.println("Losowanie nr: " + j + " wylosowane liczby to:");
//            for (i = 0; i < 6; i++) {
//                itis = true;
//                while (itis) {
//                    itis = false;
//                    result = rnd.nextInt(49)+1;
//                    for (int k=0 ; k<6 ; k++){
//                       if (spool[k] == result) { itis = true; }
//
//                    }
//                    spool[i] = result;
//                }
            for (int a:number.numberR()) {
                System.out.print(" "+a+",");

            }

            System.out.println();
        }
    }
}

