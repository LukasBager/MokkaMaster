package MoccaMaster.model;


/*
Cup repræsenterer koppen der serveres.

Den indeholder en Drink.
*/

public class Cup {

    /*
    STUDENT TASK:

    Opret en variabel:
    Drink drink
    */
    Drink drink;
    /*
    STUDENT TASK:

    Skriv en constructor der modtager en Drink.
    */
    public Cup (Drink drink) {
        this.drink = drink;
    }
    /*
    STUDENT TASK:

    Skriv en getter metode for drink.
    */
    public Drink getDrink() {
        return drink;
    }
    /*
    STUDENT TASK:

    Skriv en metode describe().

    Metoden skal returnere en tekst
    der beskriver koppen.
    */
    public String describe() {

        String returnText = "This drink is a " + drink.getType();

        if (drink.getSize() != null) {
            returnText += "\n This drink is a size: " + drink.getSize();
        }

        if (drink.getWhippedCream()) {
            returnText += "\n This drink also has whipped cream.";
        }

        return returnText;

    }
    /*
    HER SKAL VÆRE EN IF

    Hvis størrelse ikke er null.
    */



    /*
    HER SKAL VÆRE EN IF

    Hvis der er flødeskum.
    */

}