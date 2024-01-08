package nl.novi;

import jdk.jfr.Description;
import nl.novi.enumeration.Sex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrandChildrenTest {
    @Test

    @Description("Is it possible to get grandchildren")

    public void canGetGrandChildren() {
        // Arrange
        var person1 = new Person("Christiaan", "Zielman", Sex.MALE, 40);
        var child1 = new Person("Elize", "Zielman", Sex.FEMALE, 18);
        var grandChild1 = new Person("Jan", "Ros", Sex.MALE, 0);
        //Act
        person1.addChild(child1);
        child1.addChild(grandChild1);
        //Assert
        assertEquals(List.of(grandChild1), person1.getGrandChildren());
    }

    @Test

    @Description("Is it possible to get two grandchildren")

    public void CanGetGrandChildren2() {
        // Arrange
        var person1 = new Person("Christiaan", "Zielman", Sex.MALE, 40);
        var child1 = new Person("Elize", "Zielman", Sex.FEMALE, 18);
        var grandChild1 = new Person("Jan", "Ros", Sex.MALE, 0);
        var grandChild2 = new Person("Eline", "Ros", Sex.FEMALE, 2);
        //Act
        person1.addChild(child1);
        child1.addChild(grandChild1);
        child1.addChild(grandChild2);
        //Assert
        assertEquals(List.of(grandChild1, grandChild2), person1.getGrandChildren());
    }
    @Test

    @Description("Is it possible to get zero grandchildren")

    public void CanGetGrandChildren0() {
        // Arrange
        var person1 = new Person("Christiaan", "Zielman", Sex.MALE, 40);
        var child1 = new Person("Elize", "Zielman", Sex.FEMALE, 18);
        //Act
        person1.addChild(child1);
        //Assert
        assertEquals(List.of(), person1.getGrandChildren());

    }
}
