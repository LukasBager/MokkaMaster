package MoccaMaster.service;

import MoccaMaster.model.*;

//Jeppe


/*
CoffeeMachine laver drinks.

Denne klasse indeholder logikken
til at oprette de rigtige objekter.
*/

public class CoffeeMachine {

    /*
    STUDENT TASK:

    Skriv metoden serve() */
    public void serve(DrinkType e1, Size e2, Boolean cream) {

        if (e1 == DrinkType.CHOCOLATE_DRINK) {
            Drink ChocolateDrink = new ChocolateDrink();
        } else {
            Drink CoffeeDrink = new CoffeeDrink();

    }


    /*
    Metoden skal:
    - modtage DrinkType
    - modtage Size
    - modtage boolean cream
    */

    /*
    HER SKAL VÆRE EN IF

    Hvis typen er en chokoladedrik
    oprettes ChocolateDrink.
    */

    /*
    ELSE

    Ellers oprettes CoffeeDrink.
    */

    /*
    STUDENT TASK:

    Returner en Cup med drinken.
    */

}