import java.util.ArrayList;
import java.util.Comparator;

class ArrayListReverse{
    public static void main(String args[]){
        ArrayList<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("C++");
        languages.add("Python");
        languages.add("DSA");
        languages.add("HTML");

        System.out.println("ArrayList: "+languages);

        languages.sort(Comparator.reverseOrder());

        System.out.println("Reverse ArrayList: "+languages);
    }
}
