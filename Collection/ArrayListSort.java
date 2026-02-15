import java.util.ArrayList;
import java.util.Comparator;

class ArrayListSort{
    public static void main(String args[]){

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Javascript");
        System.out.println("Unsorted ArrayList: "+languages);

        languages.sort(Comparator.naturalOrder());

        System.out.println("Sorted ArrayList: "+languages);
    }
}
