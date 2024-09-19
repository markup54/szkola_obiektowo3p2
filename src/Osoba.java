import java.util.Scanner;

public abstract class Osoba {
    /*
    Z klasy abstrakcyjnej nie można zrobić obiektu
    służy do dziedziczenia
     */
    private String imie;
    private String nazwisko;
    private int wiek;
    //hermetyzacja -> modyfikatory dostepu
    /*
    public to dostępne wszedzie
    private to dostępne tylko  w tej klasie
    protected dostępne w tej klasie i klasie pochodnej
    (w Javie protected to dostęne tez w ramach pakietu)
    brak modyfikatora - dostepne w pakiecie
     */
    public Osoba(String imie, String nazwisko, int wiek) {
        //zmienne lokalne imie, nazwisko, wiek
        this.imie = imie;
        //this.imie pole klasy
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //przeciążanie konstruktora
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek =7; // wiek to pole klasy
    }

    //metody dostępowe


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        System.out.println("Podaj haslo");
        Scanner scanner = new Scanner(System.in);
        String haslo = scanner.next();
        if(haslo.equals("qwe123")) {
            this.imie = imie;
        }
        else {
            System.out.println("odmowa dostępu");
        }
    }

    @Override
    public String toString() {
        return "Osoba:" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ',';
    }
}
