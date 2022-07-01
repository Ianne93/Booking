public class Utente {

    //Attributi

    private String nome, cognome, email, indirizzo;
    private int idUtente;

    //Costruttore
    public Utente(String nome, String cognome, String email, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.indirizzo = indirizzo;
        this.idUtente = Utility.getIncrementUtente();

    }

    //Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getIdUtente() {
        return idUtente;
    }

    //metodi
    public void daiFeedback(Feedback feedback, Host host){
        host.getListaFeedback().add(feedback);
    }

    public void faiPrenotazione(Prenotazione prenotazione, Gestore gestore){
        prenotazione.getAbitazione().getListaPrenotazioni().add(prenotazione);
        gestore.addPrenotazione(prenotazione);
        prenotazione.getAbitazione().getHost().getIncrementNumPrenotazioni();
    }

}
