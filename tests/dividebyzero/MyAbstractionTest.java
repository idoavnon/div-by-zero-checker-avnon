import org.checkerframework.checker.dividebyzero.qual.*;

class MyAbstractionTest {
    public static void a() {
        int a = 0;
        a++;
        a--;
        // :: error: divide.by.zero
        int b = 5 / a;
        a++;
        // :: error: divide.by.zero
        int c = 5 / a;
        a *= 0;
        a++;
        int d = 5 / a;
        a *= 0;
        // :: error: divide.by.zero
        int e = 5 / a;
    }
}
