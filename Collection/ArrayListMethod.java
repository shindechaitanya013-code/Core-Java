import java.util.ArrayList;

public class ArrayListMethod{
    public static void main(String args[]){

        ArrayList<String> languages = new ArrayList<>();
        
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("Array List: "+languages);

        languages.add(3, "C++");

        String str = languages.get(1);
        System.out.println("Element at index 1: "+str);

        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: "+languages);
    }
}
