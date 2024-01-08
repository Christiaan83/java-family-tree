package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<Person>();
    private List<Person> children = new ArrayList<Person>();
    private List<Pet> pets = new ArrayList<Pet>();

    public Person(String middleName, String lastName, String sex, int age) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person mother, Person father){
        this.mother = mother;
        this.father =father;
        mother.addChild(this);
        father.addChild(this);

    }

    public void addChild(Person child){

        if (!this.children.contains(child)){
            this.children.add(child);
        }
    }

    public void addPet(Pet pet){

        if (!this.pets.contains(pet)){
            this.pets.add(pet);
        }

    }

    public void addSiblings(Person sibling){

        if (!this.siblings.contains(sibling)){
            this.siblings.add(sibling);
        }
    }

    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();

        for(Person child: children){
            for(Person grandChild : child.getChildren()){
                grandChildren.add(grandChild);
            }
        }
        return grandChildren;
    }


}

