package Exercise_4;

import java.util.Objects;

public class Dog extends Animal {

    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal -> Dog{" +
                "animalName='" + getAnimalName() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                ", age=" + getAge() +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getBreed(), dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBreed());
    }
}