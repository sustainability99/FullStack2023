import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;
    @BeforeEach
    void setUp(){
        main = new Main();
    }
    @Test

    @DisplayName("Проверка перевода из двоичной в 10-ую системы счисления, введите 1000")
    void test(){
        assertEquals(20,main,"должно получится число 8");
    }
}