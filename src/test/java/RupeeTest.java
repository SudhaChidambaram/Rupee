import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {
    @Test
    void checkRupee10NotSameAsOtherRupee10() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertNotSame(rupee1,rupee2);
    }
}
