package snippets.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaSizeTest {

    @Test
    void testOrdinal() {
        PizzaSize pz = PizzaSize.LUNATIC;

        if (pz.ordinal() >= PizzaSize.LARGE.ordinal()) {
            System.out.println("Are you sure? This size is for really hungry people.");
        }
    }
}