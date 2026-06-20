import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void main() {
        App.main(null);
    }

    @Test
    void add() {
        App app    = new App();
        int result = app.add(1, 2);
        assert result == 3;
    }
}
