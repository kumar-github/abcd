import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void main() {
    }

    @Test
    void test1() {
    }

    @Test
    void add() {
        final int add = App.add(1, 2);
        Assertions.assertEquals(3, add);
    }
}
