package ZadatakPripremaZaTest;

public class Alpinista extends Planinar {
    /*Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
     i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
      placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
      a informacije o alpinisti se ispisuju u formatu:

                           Alpinista, id: id
                             ime: ime i prezime
                             Broj poena: poeni*/
    private int ostvareniPoeni;
    final int maxVisina = 4000;

    public Alpinista() {

    }


    public Alpinista(String jedinstveniIdentifikacioniBr, String imePlaninara, String prezimePlaninara, int ostvareniPoeni) {
        super(jedinstveniIdentifikacioniBr, imePlaninara, prezimePlaninara);
        if (ostvareniPoeni >= 0) {
            this.ostvareniPoeni = ostvareniPoeni;
        } else {
            System.err.println("Nedozvoljeni unos");

        }

    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        if (ostvareniPoeni >= 0) {
            this.ostvareniPoeni = ostvareniPoeni;
        } else {
            System.err.println("Nedozvoljeni unos");
        }
    }


    @Override
    public int clanarinaPlaninara() {
        int clanarina = 1500;
        clanarina = clanarina - (50 * ostvareniPoeni);
        if (clanarina < 0) {

            return 0;

        } else {
            return clanarina;
        }
    }
    @Override
    public boolean uspesanUspon(Planina visinaPlanine) {

        if (visinaPlanine.getVisinaPlanine() < maxVisina && visinaPlanine.getVisinaPlanine() > 0) {
            return true;
        } else {

            return false;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, " + "ime: " + getImePlaninara() + " prezime: " + getPrezimePlaninara() +
                " Broj poena: " + ostvareniPoeni);

    }
}
