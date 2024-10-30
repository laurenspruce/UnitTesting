package example.example;

import java.util.ArrayList;

public class Basket
{
    private ArrayList<Item> itsItems = new ArrayList<>();

    //default constructor
    public Basket(){

    }

    public Basket(Basket other) {
        itsItems = new ArrayList<Item>(other.itsItems);
    }

    public void addItem( Item item )
    {
        itsItems.add( item );
    }

    public double   getTotal()
    {
        double total = 0;

        for( Item item : itsItems )
        {
            total += item.getTotalPrice();
        }
        return total;
    }

}