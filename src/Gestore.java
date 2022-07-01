import java.util.ArrayList;
import java.util.HashSet;

public class Gestore {

    //attributi

    private HashSet<Abitazione> listaAbitazione;
    private HashSet<Utente> listaUtente;
    private HashSet<Host> listaHost;
    private ArrayList<Prenotazione> listaTotPrenotazioni; //totPrenotazioni = lista di tutte le prenotazioni

    //costruttore

    public Gestore() {
        this.listaAbitazione = new HashSet<>();
        this.listaUtente = new HashSet<>();
        this.listaHost = new HashSet<>();
        this.listaTotPrenotazioni = new ArrayList<>();
    }
}
