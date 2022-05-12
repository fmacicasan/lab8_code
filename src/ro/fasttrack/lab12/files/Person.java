package ro.fasttrack.lab12.files;

//record PersonRecord (String name, int age, String position) {
//
//}

public class Person {
    private final String name;
    private final int age;
    private final String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return position != null ? position.equals(person.position) : person.position == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Person p = new Person("ion", 45, "stanga");
        System.out.println(p.equals("cucu"));

//        PersonRecord pr = new PersonRecord("ion", 45, "stanga");
//        System.out.println(pr.equals(new PersonRecord("ion", 45, "stanga")));
    }
}
