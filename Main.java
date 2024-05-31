import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static List<String> baza = new ArrayList<>();
    private static int wygrane = 0, przegrane = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        baza.addAll(BazaSlow.getBazaSlow());
        while (true) {
            System.out.println("1. Nowa gra 2. Dodaj słowo 3. Statystyki 4. Wyjście");
            int wybor = scanner.nextInt();
            scanner.nextLine(); // konsumuje nową linię
            switch (wybor) {
                case 1 -> nowaGra();
                case 2 -> dodajSlowo();
                case 3 -> statystyki();
                case 4 -> System.exit(0);
            }
        }
    }

    private static void nowaGra() {
        String slowo = baza.get(new Random().nextInt(baza.size()));
        StringBuilder ukryteSlowo = new StringBuilder("_".repeat(slowo.length()));
        int proby = 6;
        while (proby > 0 && ukryteSlowo.toString().contains("_")) {
            System.out.println("Słowo: " + ukryteSlowo + " Próby: " + proby);
            char litera = scanner.nextLine().charAt(0);
            if (slowo.contains(String.valueOf(litera))) {
                for (int i = 0; i < slowo.length(); i++) {
                    if (slowo.charAt(i) == litera)
                        ukryteSlowo.setCharAt(i, litera);
                }
            } else {
                proby--;
                WisielecRysunek.rysujWisielca(proby);
            }
        }
        if (ukryteSlowo.toString().equals(slowo)) {
            System.out.println("Wygrałeś! Słowo to: " + slowo);
            wygrane++;
        } else {
            System.out.println("Przegrałeś. Słowo to: " + slowo);
            przegrane++;
        }
    }

    private static void dodajSlowo() {
        System.out.println("Podaj nowe słowo:");
        String noweSlowo = scanner.nextLine();
        baza.add(noweSlowo);
    }

    private static void statystyki() {
        System.out.println("Wygrane: " + wygrane + " Przegrane: " + przegrane);
    }
}
