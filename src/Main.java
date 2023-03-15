import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in tal tills användaren anger ett negativt tal
        // skriv sedan ut det största och minsta talet som angavs

        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ange ett tal: ");
            int x = input.nextInt();

            if (x < 0) {
                break;
            }

            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        System.out.println("Störst: " + max);
        System.out.println("Minst: " + min);
    }
}