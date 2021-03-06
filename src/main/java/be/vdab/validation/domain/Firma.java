package be.vdab.validation.domain;

import be.vdab.validation.constraints.OndernemingsNummer;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Firma {
    @OndernemingsNummer
    private long ondernemingsNummer;

    public long getOndernemingsNummer() {
        return ondernemingsNummer;
    }

    public void setOndernemingsNummer(long ondernemingsNummer) {
        this.ondernemingsNummer = ondernemingsNummer;
    }
}
