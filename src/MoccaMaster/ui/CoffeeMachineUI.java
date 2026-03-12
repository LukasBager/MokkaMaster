package MoccaMaster.ui;

import MoccaMaster.*;
import MoccaMaster.model.Drink;
import MoccaMaster.model.DrinkType;
import MoccaMaster.model.Size;
import MoccaMaster.service.CoffeeMachine;
import MoccaMaster.util.CupSorter;
import MoccaMaster.file.FileHandler;


/*
UI-klassen styrer programmet.

Den må IKKE:
- lave drinks
- læse filer
- sortere data

Den skal kun koordinere andre klasser.
*/

import MoccaMaster.model.Cup;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CoffeeMachineUI {

    /*
    STUDENT TASK:
    Opret en variabel af typen CoffeeMachine.
    */
    CoffeeMachine coffeeMachine = new CoffeeMachine();

    public void start() {

        /*
        STUDENT TASK:

        Opret en ArrayList som skal indeholde Cup objekter.
        */
        ArrayList<Cup> cups = new ArrayList<>();
        /*
        STUDENT TASK:

        Tilføj flere drinks til listen.
        Brug machine.serve(...)
        */
        coffeeMachine.serve(DrinkType.BLACK_COFFEE, Size.LARGE, false);
        coffeeMachine.serve(DrinkType.ESPRESSO, null, false);
        coffeeMachine.serve(DrinkType.CHOCOLATE_DRINK, Size.LARGE, true);
        /*
        STUDENT TASK:

        Kald sorteringsklassen som sorterer listen.
        */
        sortCups(cups);
        /*
        HER SKAL VÆRE ET LOOP

        Loop gennem alle cups i ArrayList
        og print en beskrivelse af dem.

        Hint:
        Det er et for-each loop.
        */
        for (Cup c : cups) {
            c.describe();
        }
        /*
        STUDENT TASK:

        Gem listen til en CSV fil ved hjælp af FileHandler.
        */
        writeOrders("cups.txt", cups);
    }

}