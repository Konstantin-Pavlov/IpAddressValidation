import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    Main main = new Main();

   @Test
    void ip1() {
        assertEquals("YES", main.checkIP("192.168.1.2"), "fail message");
    }

    @Test
    void ip2() {
        assertEquals("NO", main.checkIP("192.11.690.0"));
    }

    @Test
    void ip3() {
        assertEquals("NO", main.checkIP("67.67.67"));
    }

    @Test
    void ip4() {
        assertEquals("NO", main.checkIP(".67.67"));
    }

    @Test
    void ip5() {
        assertEquals("NO", main.checkIP(".67."));
    }

    @Test
    void ip6() {
        assertEquals("NO", main.checkIP("."));
    }

    @Test
    void ip7() {
        assertEquals("NO", main.checkIP(""));
    }

    @Test
    void ip8() {
        assertEquals("YES", main.checkIP("100.100.100.100"));
    }

    @Test
    void ip9() {
        assertEquals("NO", main.checkIP("100..10...10.0"));
    }

    @Test
    void ip10() {
        assertEquals("YES", main.checkIP("1.1.1.1"));
    }
}
