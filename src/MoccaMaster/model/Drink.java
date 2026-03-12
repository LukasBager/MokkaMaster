package MoccaMaster.model;


/*
Dette er en abstrakt klasse.

Det betyder:
- man kan ikke lave new Drink()
- den bruges som superklasse

Andre klasser skal arve fra denne klasse.
*/

public abstract class Drink {
    private DrinkType type;
    private Size size;
    private boolean whippedCream;

    public Drink(DrinkType type, Size size, boolean whippedCream) {
        this.type = type;
        this.size = size;
        this.whippedCream = whippedCream;
    }
    public DrinkType getType(){
        return type;
    }

    public Size getSize(){
        return size;
    }

    public boolean getWhippedCream(){
        return whippedCream;
    }

    public abstract String prepare();

}