public class Person {
    public String name;
    public String surname;
    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
    public static void changePerson(Person person) {
        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}
