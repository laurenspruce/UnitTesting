package example.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basket
{
    private ArrayList<Item> itsItems = new ArrayList<>();

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