import java.util.ArrayList;

public class Host extends Utente {

    //attributi
    private int codiceHost;
    private boolean superHost;
    private ArrayList<Abitazione> listaAbitazione;
    private int nrPrenotazione;
    private ArrayList<Feedback> listaFeedback;

    private int countPrenotazioneMensile;

    //Costruttore
    public Host(String nome, String cognome, String email, String indirizzo) {
        super(nome, cognome, email, indirizzo);
        this.codiceHost = Utility.getIncrementHost();
        listaAbitazione = new ArrayList<>();
        listaFeedback = new ArrayList<>();
        this.countPrenotazioneMensile = 0;
    }

    //Getter e Setter

    public int getCodiceHost() {
        return codiceHost;
    }

    public boolean isSuperHost() {
        return superHost;
    }

    public void setSuperHost(boolean superHost) {
        this.superHost = superHost;
    }

    public ArrayList<Abitazione> getListaAbitazione() {
        return listaAbitazione;
    }

    public int getNrPrenotazione() {
        return nrPrenotazione;
    }

    public void setNrPrenotazione(int nrPrenotazione) {
        this.nrPrenotazione = nrPrenotazione;
    }

    public ArrayList<Feedback> getListaFeedback() {
        return listaFeedback;
    }

    public int getCountPrenotazioneMensile() {
        return countPrenotazioneMensile;
    }

    //metodi
    public void getIncrementNumPrenotazioni() {
        nrPrenotazione++;
        if (nrPrenotazione == 100) {
            superHost = true;
        }
    }
    public void addAbitazione(Abitazione abitazione, Gestore gestore){
        listaAbitazione.add(abitazione);
        gestore.addAbitazione(abitazione);
    }

}
