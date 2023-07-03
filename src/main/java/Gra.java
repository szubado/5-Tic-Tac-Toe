import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        List<String> gra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //= List.of("1","2","3","4","5","6","7","8","9");
        gra.add("1");
        gra.add("2");
        gra.add("3");
        gra.add("4");
        gra.add("5");
        gra.add("6");
        gra.add("7");
        gra.add("8");
        gra.add("9");

        int i = 0;
        for (i = 0; i < 9; i += 3) {
            System.out.println(gra.get(i) + "|" + gra.get(i + 1) + "|" + gra.get(i + 2));
            if (i < 6) {
                System.out.println("-----");
            }
        }
        System.out.println();
        boolean win = false;
        while (!win) {
            System.out.println("Podaj index od 1 do 9:");
            int position = Integer.parseInt(scanner.nextLine());
            System.out.println("Podaj symbol:");
            String option = scanner.nextLine();
            gra.set(position - 1, option);

            for (i = 0; i < 9; i += 3) {
                System.out.println(gra.get(i) + "|" + gra.get(i + 1) + "|" + gra.get(i + 2));
                if (i < 6) {
                    System.out.println("-----");
                }
            }
            for (i = 0; i < 7; i += 3) {
                if((gra.get(i).equals(gra.get(i + 1)) && (gra.get(i).equals(gra.get(i + 2))))) {
                    win = true;
                    System.out.println("Wygrał: " + option.toUpperCase() + "!!!");
                }
            }
            for (i = 0; i < 3; i ++) {
                if((gra.get(i).equals(gra.get(i + 3)) && (gra.get(i).equals(gra.get(i + 6))))) {
                    win = true;
                    System.out.println("Wygrał: " + option.toUpperCase() + "!!!");
                }
            }
            if ((gra.get(0).equals(gra.get(4)) && gra.get(0).equals(gra.get(8))) ||
                (gra.get(2).equals(gra.get(4)) && gra.get(2).equals(gra.get(6)))) {
                win = true;
                System.out.println("Wygrał: " + option.toUpperCase() + "!!!");
            }
        }
    }
}
