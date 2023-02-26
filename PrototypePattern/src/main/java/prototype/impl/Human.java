package prototype.impl;

import java.util.Objects;
import prototype.Prototype;

public class Human implements Prototype {

    private int iqLevel;
    private int age;
    private String name;

    public Human() {
    }

    public Human(int iqLevel, int age, String name) {
        this.iqLevel = iqLevel;
        this.age = age;
        this.name = name;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Human clone() {
        return new Human(this.getIqLevel(), this.getAge(), this.getName());
    }

    @Override
    public String toString() {
        return "Human{" +
            "iqLevel=" + iqLevel +
            ", age=" + age +
            ", name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return iqLevel == human.iqLevel && age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iqLevel, age, name);
    }
}
