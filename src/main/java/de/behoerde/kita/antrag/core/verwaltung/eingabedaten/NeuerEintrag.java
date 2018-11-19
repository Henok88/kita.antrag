package de.behoerde.kita.antrag.core.verwaltung.eingabedaten;

/**
 * Schnittstellenobjekt zum Erzeuges eines neuen Eintrags.
 */
public class NeuerEintrag {
    private String verfasser;
    private String text;

    public NeuerEintrag() {
    }

    /**
     * Erzeugt ein neues Schnittstellenobjekt für einen neuen Eintrag.
     *
     * @param verfasser Der Verfasser des Eintrags
     * @param text Der Text des Eintrags
     */
    public NeuerEintrag(String verfasser, String text) {
        this.verfasser = verfasser;
        this.text = text;
    }

    public String getVerfasser() {
        return verfasser;
    }

    public void setVerfasser(String verfasser) {
        this.verfasser = verfasser;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
