package accessmodifies;

import java.util.Objects;

public class Person {
    private String email;
    private int age;
    private String name;
    private char gender;
    private Address address;

    public Person() {
    }

    public Person(String email, int age, String name, char gender, Address address) {
        this.email = email;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    ///this was not explinedd earlier
    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && gender == person.gender && Objects.equals(email, person.email) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(email);
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + gender;
        return result;
    }
}
