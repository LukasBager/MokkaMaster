package MoccaMaster.ui;

import MoccaMaster.*;
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

    public void start(){

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

        /*
        STUDENT TASK:

        Kald sorteringsklassen som sorterer listen.
        */

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
        try {
            FileWriter writer = new FileWriter("cups.csv", true);
            for (Cup c : cups) {
                writer.write(c.getDrink().getType().toString() + "," + c.getDrink().getSize().toString() + "," + Boolean.toString(c.getDrink().getWhippedCream()) + System.lineSeparator());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}