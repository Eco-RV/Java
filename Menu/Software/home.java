import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class home {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\oswal\\Desktop\\Java\\Menu\\Software\\menu\\menu.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        
    }
}

