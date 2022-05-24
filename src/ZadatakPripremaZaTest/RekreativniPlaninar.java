package ZadatakPripremaZaTest;

public class RekreativniPlaninar extends Planinar {
    /*Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon
manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi
može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
                              Rekreativac, id: id
                              ime: ime prezime Okrug: okrug*/

    private int tezinaOpremeKg;
    private String nazivOkruga;
    private int maxUsponBezOpreme;

     static int clanarina=1000;

    public RekreativniPlaninar() {

    }

    public RekreativniPlaninar(String jedinstveniIdentifikacioniBr, String imePlaninara, String prezimePlaninara, int tezinaOpremeKg, String nazivOkruga, int maxUsponBezOpreme) {
        super(jedinstveniIdentifikacioniBr, imePlaninara, prezimePlaninara);
        this.tezinaOpremeKg = tezinaOpremeKg;
        this.nazivOkruga = nazivOkruga;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int getTezinaOpremeKg() {
        return tezinaOpremeKg;
    }

    public void setTezinaOpremeKg(int tezinaOpremeKg) {
        this.tezinaOpremeKg = tezinaOpremeKg;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    public void setMaxUsponBezOpreme(int maxUsponBezOpreme) {
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    /*da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon
manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi
može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
                              Rekreativac, id: id
                              ime: ime prezime Okrug: okrug*/
    public boolean uspesanUspon(Planina visinaPlanine) {

        if ((maxUsponBezOpreme -(50 * this.tezinaOpremeKg)) > visinaPlanine.getVisinaPlanine()) {

            return true;
        }else {

            return false;
        }


    }
    public int clanarinaPlaninara(){

        return clanarina;
    }


    @Override
    public void stampaj() {
        System.out.println( "Rekreativac, id: " + getJedinstveniIdentifikacioniBr() + "\n" + "ime: " + getImePlaninara() + getPrezimePlaninara() + "Okrug: " + nazivOkruga);
    }
}

