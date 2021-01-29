import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        anotherClass <Integer, String> myClass = new anotherClass(12, "Hello");
        int numVal = (int) myClass.getThingOne();
        String strVal = (String) myClass.getThingTwo();

        anotherClass <String, String> myClass2 = new anotherClass<>("really", "Really");
        String numVal2 = myClass2.getThingOne();
        String numval3 = myClass2.getThingTwo();

        System.out.println("Printing everything");
        System.out.println("numVal "+ numVal);
        System.out.println("strVal "+ strVal);

    Set<String> newSet = new HashSet<>();
    newSet.add("one");
    newSet.add("Two");
    newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("one");
        newSet2.add("Two");
        newSet2.add("Spring");

        Set<String> setResult = printStuff(newSet, newSet2);
        Iterator<String> myItr = setResult.iterator();
        while(myItr.hasNext()) {
            System.out.println(myItr.next());
        }
    }

    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo){
        Set<E> result = new HashSet();
        result.addAll(setTwo);
        return result;
    }
}
