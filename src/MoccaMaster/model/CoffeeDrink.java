package MoccaMaster.model;


/*
CoffeeDrink arver fra Drink.

Dette er et eksempel på arv (inheritance).
*/

public class CoffeeDrink extends Drink {
    public CoffeeDrink(DrinkType type, Size size, boolean whippedCream) {
        super(type, size, whippedCream);
    }

    /*
    STUDENT TASK:

    Skriv en constructor.

    Constructoren skal kalde super(...) constructoren.
    */

    /*
    STUDENT TASK:

    Implementer prepare() metoden.

    Den skal returnere en tekst som beskriver
    hvilken kaffe der laves.
    */
    @Override
    public String prepare() {
        return "Preparing coffee: " + getType();
    }
}