public class Feedback {

    //attributi

    private int idFeedback;
    private String titolo,testo;
    private int punteggio; //da 1 a 5

    //costruttore

    public Feedback(String titolo, String testo, int punteggio) {
        this.idFeedback = Utility.getIncrementFeedback();
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
    }
}