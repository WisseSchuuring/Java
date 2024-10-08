package snippets.syntax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void construct() {
        Pizza baseOnly = new Pizza();
        System.out.println("baseOnly default = " + baseOnly);

        Pizza baseOnlyThick = new Pizza(PizzaBase.THICK);
        System.out.println("baseOnly thick = " + baseOnlyThick);

        Pizza hawaii = new Pizza("cheese", "tomato sause", "ham", "pineapple");
        System.out.println("hawaii = " + hawaii);

        Pizza hawaiiThick= new Pizza(PizzaBase.THICK, "cheese", "tomato sause", "ham", "pineapple");
        System.out.println("hawaii = " + hawaiiThick);

    }

}