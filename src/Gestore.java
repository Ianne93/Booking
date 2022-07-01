import java.time.LocalDateTime;
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

    //Getter e Setter

    public HashSet<Abitazione> getListaAbitazione() {
        return listaAbitazione;
    }

    public HashSet<Utente> getListaUtente() {
        return listaUtente;
    }

    public HashSet<Host> getListaHost() {
        return listaHost;
    }

    public ArrayList<Prenotazione> getListaTotPrenotazioni() {
        return listaTotPrenotazioni;
    }

    //Metodi
    public void addUtente(Utente utente) {
        listaUtente.add(utente);
    }

    public void addHost(Host host, boolean b) {
        if (b)
            listaHost.add(host);
    }

    public void addAbitazione(Abitazione abitazione) {
        listaAbitazione.add(abitazione);
    }

    public void addPrenotazione(Prenotazione prenotazione) {
        listaTotPrenotazioni.add(prenotazione);
    }

    public ArrayList<Abitazione> abitazioniHost(int codiceId) {
        for (Host host : listaHost) {
            if (codiceId == host.getCodiceHost()) {
                return host.getListaAbitazione();
            }
        }
        return null;
    }

    // ottenere l'ultima prenotazione dato un id utente
    public Prenotazione prenotazioneIdUtente(int idUtente) {

        for (int i = listaTotPrenotazioni.size() - 1; i > 0; i--) {
            if (listaTotPrenotazioni.get(i).getUtente().getIdUtente() == idUtente) {
                return listaTotPrenotazioni.get(i);
            }
        }
        return null;
    }

    //ottenere tutti i super-host
    public void getSuperHost() {
        for (Host host : listaHost) {
            if (host.isSuperHost()) {
                System.out.println(host);
            }
        }
    }

    //ottenere il numero medio di posti letto calcolato in base a tutte le abitazioni caricate dagli host
    public void getMediaPostiletto() {
        int somma = 0;
        int media = 0;
        for (Abitazione abitazione : listaAbitazione) {
            somma += abitazione.getNrPostiLetto();
        }

        media = somma / listaAbitazione.size();
        System.out.println("La media posti letto è: " + media);
    }

    //ottenere l'abitazione più gettonata nell'ultimo mese

    public void abitazioneMaggiore() {
        int tmpMax = 0;
        Abitazione abitazioneTmp = null;
        int count = 0;
        for (Abitazione abitazione : listaAbitazione) {
            count = 0;
            for (Prenotazione prenotazione : abitazione.getListaPrenotazioni()) {
                if (prenotazione.getDataInizio().isAfter(LocalDateTime.now().minusMonths(1))) {
                    count++;
                }
            }
            if (count > tmpMax) {
                abitazioneTmp = abitazione;
                tmpMax = count;
            }
        }
        System.out.println("La miglior abitazione di questo mese è : " + abitazioneTmp);
    }

    //ottenere gli host con più prenotazioni nell'ultimo mese
    public void hostMaggiore() {
        int tmpMax = 0;
        int tmpMax2 = 0;
        Host hostTemp = null;
        Host hostTemp2 = null;
        int count = 0;
        count = 0;
        for (Host host : listaHost) {
            for (Prenotazione prenotazione : listaTotPrenotazioni) {
                if (prenotazione.getDataInizio().isAfter(LocalDateTime.now().minusMonths(1)) && prenotazione.getAbitazione().getHost().equals(host)) {
                    count++;
                }
            }
            if (count > tmpMax) {
                hostTemp = host;
                tmpMax = count;
            } else if (count > tmpMax2) {
                hostTemp2 = host;
                tmpMax2 = count;
            }
        }
        System.out.println("I migliori Host sono : " + hostTemp + hostTemp2);

        //provare funzione hostMaggiore!!
    }
}



