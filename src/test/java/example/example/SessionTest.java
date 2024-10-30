package example.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SessionTest {

    interface IRegister {
        String getDelegate(int index);
        int getNumberRegistered();
    }

    class Register implements IRegister {
        private ArrayList<String> delegates = new ArrayList<>(); // simulates a db table

        public Register() { // constructor
            delegates.add("Lauren");
            delegates.add("Charlie");
            delegates.add("Callum");
        }

        // get delegate
        public String getDelegate(int index) {
            return delegates.get(index - 1);
        }

        public int getNumberRegistered() {
            return delegates.size();
        }
    }

    class Course {
        private IRegister reg;

        // Constructor must assign the register to the instance variable
        public Course(IRegister register) {
            this.reg = register; // Assign the passed register to the instance variable
        }

        public String getLastPersonRegistered() {
            int lastIndex = reg.getNumberRegistered(); // Get the total number of registered delegates
            return reg.getDelegate(lastIndex); // Get the last delegate
        }
    }

    @Test
    public void verify_lastName_returned_is_last_in_register() {
        // Arrange
        IRegister reg = mock(IRegister.class);
        Course cut = new Course(reg);
        String expectedResult = "Callum";

        // Stubbing behavior
        when(reg.getNumberRegistered()).thenReturn(3);
        when(reg.getDelegate(3)).thenReturn("Callum"); // Change this to specify index 3

        // Act
        String actualResult = cut.getLastPersonRegistered();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    // Other test methods...
    @Test
    public void verify_if_basket_has_correct_items()
    {
        // arrange
        Basket basket = new Basket();
        Item item1 = new Item("Bananas", 6, 0.19); // 1.14
        Item item2 = new Item("Avocado", 3, 0.89); // 2.67
        Item item3 = new Item("Spinach", 1, 1.27); // 1.27
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedResult = "";
        try
        {
            expectedResult = objectMapper.writeValueAsString(basket);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        IDataStore dataStore = mock(IDataStore.class);
        when(dataStore.getItemsInDB()).thenReturn(basket);
        Session cut = new Session(dataStore);

        // act
        String actualResult = cut.getItems();

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verify_if_basket_total_is_correct()
    {
        // arrange
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedResult = "";

        try
        {
            expectedResult = objectMapper.writeValueAsString(5.08);

        } catch (JsonProcessingException e)

        {
            e.printStackTrace();
        }
        IDataStore dataStore = mock(IDataStore.class);
        when(dataStore.getTotalPriceInDB()).thenReturn(5.08);
//        DataStore dataStore = new DataStore();
        Session cut = new Session(dataStore);

        // act
        String actualResult = cut.getTotalPrice();

        // assert
        assertEquals(expectedResult, actualResult);
    }


}
