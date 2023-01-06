
public class Samochod {
    private String nazwaProd;
    private String opis;
    private float cena;

    public Samochod(String nazwaProd, String opis, float cena) {
        this.nazwaProd = nazwaProd;
        this.opis = opis;
        this.cena = cena;
    }

    public String getNazwaProd() {
        return nazwaProd;
    }

    public void setNazwaProd(String nazwa) {
        this.nazwaProd = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public Samochod (){
        this.nazwaProd = "domyslna";
        this.opis = "domyslna";
        this.cena = 0;
    }

    public void info(){
        String wiadomosc ="Samochod: \n" +
                "\tNazwaProd: " + this.nazwaProd +
                "\tOpis: "  + this.opis +
                "\tCena: "  + this.cena;
        System.out.println(wiadomosc);
    }



}




