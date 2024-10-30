package example.example;

public interface IDataStore {
    double getTotalPriceInDB();
    Basket getItemsInDB();
    Item getTheLastItemSold(); // Should return an Item, not a Basket
}