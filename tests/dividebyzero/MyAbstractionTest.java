import org.checkerframework.checker.dividebyzero.qual.*;

class MyAbstractionTest {
    public static void a() {
        int a = 0;
        a++;
        a--;
        // :: error: divide.by.zero
        int b = 5 / 1;
    }
}
