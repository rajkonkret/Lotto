import java.beans.PropertyEditorSupport;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {

    public static void main(String[] args) {
        int[] spool = new int[6];
        int i;
        int j;
        boolean itis;
        itis = false;
        int result=0;

        Random rnd = new Random();
        System.out.println("Generator Lotto by RJ");
        for (i=0 ; i<6 ; i++){
            spool[i]=0;
            }
        for (j=1; j<=100; j++) {
            System.out.println("Losowanie nr: "+j+" wylosowane liczby to:");
            for (i = 0; i < 6; i++) {
                itis = true;
                while (itis) {
                    itis = false;
                    result = rnd.nextInt(49)+1;
                    for (int k=0 ; k<6 ; k++){
                       if (spool[k] == result) { itis = true; }

                    }
                    spool[i] = result;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
