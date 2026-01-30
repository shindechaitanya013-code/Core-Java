import java.io.*;

public class FileCreate{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        String s = "Welcome";
        byte b[] = s.getBytes();

        FileOutputStream fout = new FileOutputStream("E:\\Github2026\\Core-Java\\File Handling\\oop.txt");
        fout.write(b);

        System.out.println("File is created");
        fout.close();
    }
}
