package it.unisa.ilike.segnalazioni.storage;

public class SegnalazioneBean {

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMotivazione() {
        return motivazione;
    }

    public void setMotivazione(String motivazione) {
        this.motivazione = motivazione;
    }

    public Boolean isGestita() {
        return gestita;
    }

    public void setGestita(Boolean gestita) {
        this.gestita = gestita;
    }

    private int tipo;
    private String motivazione;
    private Boolean gestita;
}
