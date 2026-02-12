import java.util.ArrayList;

class ArrayToList{
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    String[] arr = new String[languages.size()];

    languages.toArray(arr);
    System.out.print("Array: ");

    for (String item : arr) {
      System.out.print(item + ", ");
    }
  }
}
