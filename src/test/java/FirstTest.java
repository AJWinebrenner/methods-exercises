import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    void test1() {

        // GIVEN
        int first = 4;
        int second = 6;
        // WHEN
        int result = first + second;
        // THEN
        //--------------
        // from unitJ vanilla
            //assertEquals(8, result);
        // from assertJ dependency
            assertThat(result).isEqualTo(8);
        //--------------

    }

}
