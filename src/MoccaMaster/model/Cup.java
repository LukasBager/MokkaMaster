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
        return "";
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