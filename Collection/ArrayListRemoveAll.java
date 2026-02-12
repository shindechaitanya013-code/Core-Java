import java.util.ArrayList;

class ArrayListRemoveAll{
    public static void main(String[] args){

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");

        System.out.println("Programming Languages: " + languages);

        languages.removeAll(languages);

        System.out.println("ArrayList after removeAll(): " + languages);
    }
}
