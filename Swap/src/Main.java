import com.sun.source.util.SourcePositions;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("До перестановки: a = " + a + ", b = " + b);
            swapXor(a, b);
            System.out.println("После перестановки: a = " + a + ", b = " + b);
        }

        public static void swapXor(int a, int b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
}

