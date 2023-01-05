package it.unisa.ilike.liste.storage;

/**
 * Questa classe contiene gli attributi e i metodi di utilità relativi alle liste di contenuti degli iscritti
 * @author Simona Lo Conte
 * @version 0.1
 */
public class ListaBean {

    /**
     * Costruttore senza parametri
     */
    public ListaBean() {
    }

    /**
     * Costruttore con parametri
     * @param nome
     * @param emailIscritto
     * @param visibilita
     */
    public ListaBean(String nome, String emailIscritto, Boolean visibilita) {
        this.nome = nome;
        this.emailIscritto = emailIscritto;
        this.visibilita = visibilita;
    }

    /**
     * Questo metodo restituisce il nome della lista
     * @return nome della lista
     */
    public String getNome() {
        return nome;
    }

    /**
     * Questo metodo imposta il nome della lista
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Questo metodo restituisce l'email dell'iscritto a cui appartiene la lista
     * @return email dell'iscritto
     */
    public String getEmailIscritto() {
        return emailIscritto;
    }

    /**
     * Questo metodo imposta l'email dell'iscritto a cui appartiene la lista
     * @param emailIscritto
     */
    public void setEmailIscritto(String emailIscritto) {
        this.emailIscritto = emailIscritto;
    }

    /**
     * Questo metodo restituisce un valore booleano riguardo la visibilità della lista
     * (true se è public, quindi visibile a tutti; false, se è private, quindi visibile solo
     * all'iscritto a cui appartiene)
     * @return visibilita della lista
     */
    public Boolean isVisibile() {
        return visibilita;
    }

    /**
     * Questo metodo imposta un valore booleano per la visibilità della lista
     * (true se è public, quindi visibile a tutti; false, se è private, quindi visibile solo
     * all'iscritto a cui appartiene)
     * @param visibilita
     */
    public void setVisibilita(Boolean visibilita) {
        this.visibilita = visibilita;
    }

    private String nome;
    private String emailIscritto;
    private Boolean visibilita;
}