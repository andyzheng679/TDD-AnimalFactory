package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`--
    // TODO - Create tests for `speak`--
    // TODO - Create tests for `setBirthDate(Date birthDate)`--
    // TODO - Create tests for `void eat(Food food)`--
    // TODO - Create tests for `Integer getId()`--
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`--
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName(){
        Cat cat = new Cat("Zula", null, null);
        String expected = "Andy";
        cat.setName(expected);

        String actual = cat.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void speak(){
        Cat cat = new Cat("Zula", null, null);

        String actual = cat.speak();
        assertEquals("meow!", actual);
    }

    @Test
    public void setBirthday(){
        Cat cat = new Cat("Zula", new Date(), 0);
        Date expected = new Date();
        cat.setBirthDate(expected);

        assertEquals(expected, cat.getBirthDate());
    }

    @Test
    public void eat(){
        Cat cat = new Cat("Zula", new Date(), 0);

        Food food = new Food();
        int expected = 1;

        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        assertEquals(expected, actual);

    }

    @Test
    public void getId(){
        Cat cat = new Cat("Zula", new Date(), 0);
        Integer expected = 777;
        Integer actual = cat.getId();

        assertEquals(expected, actual);

    }

    @Test
    public void animalInheritance(){
        Cat cat = new Cat("Zula", new Date(), 0);
        Animal mammal = cat;

        assertTrue(mammal instanceof Animal);
    }

    @Test
    public void mammal(){
        Cat cat = new Cat("Zula", new Date(), 0);
        Mammal mammal = cat;

        assertTrue(mammal instanceof Mammal);
    }


}
