package MoccaMaster.util;

import MoccaMaster.model.Cup;
import java.util.Comparator;

//VILLA
/*
Comparator bestemmer hvordan cups sorteres.
*/

public class CupComparator implements Comparator<Cup>{

    @Override
    public int compare(Cup c1, Cup c2) {

        //Sammenlign drink type:
        int typeCompare = c1.getDrink().getType().compareTo(c2.getDrink().getType());

        if(typeCompare !=0){
            return typeCompare;
        }
     //Ellers sammenlignes størrelse:
        return c1.getDrink().getSize().compareTo(c2.getDrink().getSize());
    }


    /*
    STUDENT TASK:

    Implementer Comparator<Cup>.
    */

    /*
    STUDENT TASK:

    Implementer compare() metoden.
    */

    /*
    Sammenlign først drink type.
    */

    /*
    HER SKAL VÆRE EN IF

    Hvis typerne ikke er ens
    returneres resultatet.
    */

    /*
    Ellers sammenlignes størrelse.
    */

}