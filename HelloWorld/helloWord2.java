import java.util.Scanner;

public class helloWord2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] letter = {"h","e","l","l","o","w","o","r","l","d"};

        String letter_Save = "";

        for (int a = 0; a < letter.length; a++) {
            for (char b = 'a'; b <= 'z'; b++) {
                if (letter[a].equals(Character.toString(b))) {
                    letter_Save += b;
                    System.out.println(letter_Save);
                    break;
                } else {
                    System.out.println(letter_Save + b);
                }
            }
        }
    }
}