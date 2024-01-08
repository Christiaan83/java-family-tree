package nl.novi;

import jdk.jfr.Description;
import nl.novi.enumeration.Sex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person child;
    Person mother;
    Person father;
    @BeforeEach
    void setUp() {
        child = new Person("Elize", "Zielman", Sex.FEMALE, 8);
        father = new Person("Jan", "Zielman",Sex.MALE, 40);
        mother = new Person("Maartje", "Zielman", Sex.FEMALE, 36);
    }
   @Test
    public void canAddParents() {
        // Arrange
        // Act
        child.addParents(mother, father);
        // Assert
       assertEquals(father.getName(), child.getFather().getName());
       assertEquals(mother.getName(), child.getMother().getName());

    }

    @Test
    public void canAddChild(){

    List<Person> elize = new ArrayList<>();
        elize.add(child);
        //Act
        mother.addChild(child);
        //Assert
        assertEquals(true, mother.getChildren().contains(child));
        assertEquals(elize, mother.getChildren());
    }

    @Test
    public void canAddPet(){
        // Arrange
        var pet = new Pet("Wollie", 8,"kat");
        List<Pet> wollie = new ArrayList<>();
        wollie.add(pet);
        //Act
        father.addPet(pet);
        //Assert
        assertEquals(wollie, father.getPets());
    }
    @Test

    public void canAddSiblings(){
        // Arrange

        // List<Person> siblings = new ArrayList<>();
        //        siblings.add(child);
        var expectedSiblings = List.of(child);
        //Act
        child.addSiblings(child);
        //Assert
        assertEquals(expectedSiblings, child.getSiblings());
    }


}


