package MoccaMaster.main;


/*
PROGRAMMET STARTER HER.

Main-klassen skal være meget lille i gode programmer.
Den skal kun starte programmet.

STUDERENDE SKAL:
- oprette et UI objekt
- kalde start() metoden
*/

import MoccaMaster.ui.CoffeeMachineUI;

public class MoccaMasterApp {

    public static void main(String[] args) {

        // STUDENT TASK:
        // Opret CoffeeMachineUI objekt
        CoffeeMachineUI coffeeMachineUI = new CoffeeMachineUI();

        // STUDENT TASK:
        // Kald start() metoden
        coffeeMachineUI.start();

    }
}