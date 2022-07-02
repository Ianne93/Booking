public class Feedback {

    //attributi

    private int idFeedback;
    private String titolo, testo;
    private int punteggio; //da 1 a 5

    //costruttore

    public Feedback(String titolo, String testo, int punteggio) {
        this.idFeedback = Utility.getIncrementFeedback();
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
    }

    //Getter e Setter
    public int getIdFeedback() {
        return idFeedback;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "idFeedback=" + idFeedback +
                ", titolo='" + titolo + '\'' +
                ", testo='" + testo + '\'' +
                ", punteggio=" + punteggio +
                '}';
    }
}