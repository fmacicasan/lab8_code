package ro.fasttrack.lab10;

import java.util.Objects;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Person {
    private String name;
    private Integer age;
    private Character gender;
    private int height;

    public Person(String name, Integer age, char gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
    
    public String toString() {
        return name + " are " + age + " ani si inaltime " + height + "cm";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }
        Person person =  (Person) o;
        return this.name.equals(person.name)
                && Objects.equals(this.age, person.age)
                && this.gender == person.gender
                && this.height == person.height;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (height != person.height) return false;
//        if (name != null ? !name.equals(person.name) : person.name != null) return false;
//        if (age != null ? !age.equals(person.age) : person.age != null) return false;
//        return gender != null ? gender.equals(person.gender) : person.gender == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (age != null ? age.hashCode() : 0);
//        result = 31 * result + (gender != null ? gender.hashCode() : 0);
//        result = 31 * result + height;
//        return result;
//    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }
}
