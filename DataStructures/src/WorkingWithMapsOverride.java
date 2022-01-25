import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMapsOverride {
    public static void main(String[] args) {
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }
    static class Person{
        public Person(String name) {
            this.name = name;
        }

        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    record Diamond(String name){}
}
