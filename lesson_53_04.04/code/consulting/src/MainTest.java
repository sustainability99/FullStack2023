import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;
    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void testFindDom_noDominant(){
        int[] actual = {5,5,6,5,6,6};
        assertEquals(-1,m.findDominant(actual));

    }

}