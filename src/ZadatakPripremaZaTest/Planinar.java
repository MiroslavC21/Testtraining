package ZadatakPripremaZaTest;

public abstract class Planinar {
    /*Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
     Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
     Pored toga, klasa ima:
    apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.
     */
private String jedinstveniIdentifikacioniBr;
private String imePlaninara;
private String prezimePlaninara;

public Planinar(){

}

    public Planinar(String jedinstveniIdentifikacioniBr, String imePlaninara, String prezimePlaninara) {
        this.jedinstveniIdentifikacioniBr = jedinstveniIdentifikacioniBr;
        this.imePlaninara = imePlaninara;
        this.prezimePlaninara = prezimePlaninara;
    }

    public String getJedinstveniIdentifikacioniBr() {
        return jedinstveniIdentifikacioniBr;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPrezimePlaninara() {
        return prezimePlaninara;
    }
    public abstract void stampaj ();

public abstract int clanarinaPlaninara();

/*Pored toga, klasa ima:
    apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.*/

    public abstract boolean uspesanUspon(Planina visinaPlanine);





}
