import java.util.Objects;
import java.util.Scanner;

public class NoweZadanie {
    public static void main(String[] args) {
        /**
         * 1. Chcę, aby w programie było pytanie o imię, nazwisko i wiek
         * 2. Chcę, żeby po zapytaniu o wiek była pętla sprawdzająca, czy osoba jest pełnoletnia, czy nie -
         * (przy pełnoletniej napis 'Zapraszam do klubu', przy niepełnoletniej  napis 'Wypad'
         */
        String[] wygrani = new String[]{"Ania", "Zosia", "Magda", "Piotrek", "Adam"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        if (wiek >= 18) {
            System.out.println("Zapraszam do klubu");
            for (String wygrany: wygrani){
                if(Objects.equals(imie, wygrany)){
                    System.out.println("Dostajesz darmowego szota;)");
                }
            }
        }
        if (wiek < 18) {
            System.out.println("Wypad");
        }
    }
}

