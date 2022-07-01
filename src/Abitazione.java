import java.time.LocalDateTime;
import java.util.ArrayList;

public class Abitazione {

    //attributi

    private double prezzo;
    private LocalDateTime dataInzio;
    private LocalDateTime dataFine;
    private String nome, indirizzo;
    private int idAbitazione, nrLocali, nrPostiLetto, nrPiano; //Locali = num Stanze

    private Host host;
    private ArrayList<Prenotazione> listaPrenotazioni;

    //costruttore

    public Abitazione(double prezzo, LocalDateTime dataInzio, LocalDateTime dataFine, String nome, String indirizzo, int nrLocali, int nrPostiLetto, int nrPiano, Host host) {
        this.prezzo = prezzo;
        this.dataInzio = dataInzio;
        this.dataFine = dataFine;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.idAbitazione = Utility.getIncrementAbitazione();
        this.nrLocali = nrLocali;
        this.nrPostiLetto = nrPostiLetto;
        this.nrPiano = nrPiano;
        this.host = host;
        this.listaPrenotazioni = new ArrayList<>();
    }

    //Getter e Setter

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public LocalDateTime getDataInzio() {
        return dataInzio;
    }

    public void setDataInzio(LocalDateTime dataInzio) {
        this.dataInzio = dataInzio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getIdAbitazione() {
        return idAbitazione;
    }

    public int getNrLocali() {
        return nrLocali;
    }

    public int getNrPostiLetto() {
        return nrPostiLetto;
    }

    public void setNrPostiLetto(int nrPostiLetto) {
        this.nrPostiLetto = nrPostiLetto;
    }

    public int getNrPiano() {
        return nrPiano;
    }

    public Host getHost() {
        return host;
    }
    
    public ArrayList<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

}
