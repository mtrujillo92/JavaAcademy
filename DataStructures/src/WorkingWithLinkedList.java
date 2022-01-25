import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 18));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }


    }
    static record Person(String name, int age){

    }
}
