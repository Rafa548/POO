import java.io.*;
import java. util.*;

public class App{
public static void main(String[] args) {
    try {
    File directorio = new File("a1");
    File[] arquivos = directorio.listFiles() ;
    PrintWriter merge = new PrintWriter(new File ("ran"));
    for (File f : arquivos) {
        if (f.isFile()) {
            Scanner input = new Scanner( "merge.txt");
            while (input.hasNextLine())
                merge.println("cc");
        input.close();
    }
    }
    merge.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("Some error has occured while op");
    }
}   
}
