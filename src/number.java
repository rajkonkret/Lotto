import java.util.Random;

public class number {
    static int[] numberR() {
        int[] finalsix = new int[6];
        boolean itis = true;
        int result=0;
        Random rnd = new Random();
        clear.clearall(finalsix); // nie do końca konieczne
        for (int i = 0; i < 6; i++) {
            itis = true;
            while (itis) {
                itis = false;
                result = rnd.nextInt(49) + 1;
                for (int k = 0; k < 6; k++) {
                    if (finalsix[k] == result) {
                        itis = true;
                    }
                }
                    finalsix[i] = result;

            }
        }
            return finalsix;
    }
}
