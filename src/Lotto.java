import java.beans.PropertyEditorSupport;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {
    public static void main(String[] args) {
        int i;
        int j;
        int result;
        Random rnd = new Random();
        System.out.println("Generator Lotto by RJ");
        for (j=1; j<=100; j++) {
            System.out.println("Losowanie nr: "+j+" wylosowane liczby to:");
            for (i = 0; i < 6; i++) {
                result = rnd.nextInt(49)+1;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
