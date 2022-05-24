package ZadatakPripremaZaTest;

public class Planina {
    /*Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
     Klasa mora imati konstruktore i getere i setere.
     */
    private String imePlanine;
    private String imeDrzave;
    private double visinaPlanine;

    public Planina(){

    }

    public Planina(String imePlanine, String imeDrzave, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.imeDrzave = imeDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImeDrzave() {
        return imeDrzave;
    }

    public void setImeDrzave(String imeDrzave) {
        this.imeDrzave = imeDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "imePlanine='" + imePlanine + '\'' +
                ", imeDrzave='" + imeDrzave + '\'' +
                ", visinaPlanine=" + visinaPlanine +
                '}';
    }
}
