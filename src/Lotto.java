import java.beans.PropertyEditorSupport;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {
    public static void main(String[] args) {
        int i;
        int j;
        int result;
        Random rnd = new Random();
        System.out.println("Generator Lotto");
        for (j=0; j<100; j++) {
            for (i = 0; i < 6; i++) {
                result = rnd.nextInt(49)+1;
                System.out.printf("Wylosowane liczby to: "+result + " ");
            }
            System.out.println();
        }
    }
}
