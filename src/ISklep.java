import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



    public interface ISklep {
        void wyswietl();
        void dodaj(Samochod produkt);
        void usun(int index);
        ArrayList<Samochod> szukaj(String nazwa, String opis);
        void zapisz() throws IOException;
        void wczytaj() throws FileNotFoundException, IOException;



    }
