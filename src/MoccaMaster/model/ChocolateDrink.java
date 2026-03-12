package MoccaMaster.model;


/*
ChocolateDrink er en anden type drink.

Den kan have flødeskum.
*/

public class ChocolateDrink extends Drink {
    public ChocolateDrink(DrinkType type, Size size, boolean whippedCream) {
        super(type, size, whippedCream);
    }

    /*
    STUDENT TASK:

    Implementer prepare() metoden.
    */

    /*
    HER SKAL VÆRE EN IF

    Hvis drinken har flødeskum
    returneres en anden tekst.
    */

    @Override
    public String prepare() {
        if (this.getWhippedCream()) {
            System.out.println("Yay, your drink is getting whipped cream sprayed over it:D");
        }
        return
    }
}
