import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void checkEntityRupee10NotSameAsOtherRupee10() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertNotSame(rupee1, rupee2);
    }

    @Test
    void checkValueRupee10SameAsOtherRupee10() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);


        assertTrue(rupee1.checkValue(rupee2));
    }
}
