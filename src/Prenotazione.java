import java.time.LocalDateTime;

public class Prenotazione {

    //attributi
    private int idPrenotazione;
    private LocalDateTime dataInizio, dataFine;
    private Abitazione abitazione;
    private Utente utente;

    //costruttore

    public Prenotazione(LocalDateTime dataInizio, LocalDateTime dataFine, Abitazione abitazione, Utente utente) {
        this.idPrenotazione = Utility.getIncrementPrenotazione();
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.abitazione = abitazione;
        this.utente = utente;
    }
}
