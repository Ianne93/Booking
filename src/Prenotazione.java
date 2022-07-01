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

    //Getter e Setter

    public int getIdPrenotazione() {
        return idPrenotazione;
    }


    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public Abitazione getAbitazione() {
        return abitazione;
    }

    public Utente getUtente() {
        return utente;
    }

}
