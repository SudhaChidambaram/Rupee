import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void checkEntityRupee10NotSameAsOtherRupee10() {
        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(oneTenRupee, anotherTenRupee);
    }

    @Test
    void checkValueRupee10SameAsOtherRupee10() {
        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);


        assertEquals(oneTenRupee, anotherTenRupee);
    }

    @Test
    void checkValueRupee5NotSameAsOtherRupee10() {
        Rupee oneFiveRupee = new Rupee(5);
        Rupee oneTenRupee = new Rupee(10);

        assertNotEquals(oneFiveRupee, oneTenRupee);

    }

    @Test
    void checkNullRupee() {
        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = null;

        assertNotEquals(oneTenRupee, anotherTenRupee);
    }

    @Test
    void checkObjectTypesRupee() {
        Rupee oneTenRupee = new Rupee(10);
        Object anotherObject = new Object();

        assertNotEquals(oneTenRupee, anotherObject);
    }
}
