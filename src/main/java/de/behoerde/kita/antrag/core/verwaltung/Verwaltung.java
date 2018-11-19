package de.behoerde.kita.antrag.core.verwaltung;

import de.behoerde.kita.antrag.core.verwaltung.ausgabedaten.EintragDaten;
import de.behoerde.kita.antrag.core.verwaltung.eingabedaten.Entscheidung;
import de.behoerde.kita.antrag.core.verwaltung.eingabedaten.NeuerEintrag;

import java.util.List;

/**
 * Interface der AWK-Komponente zur Verwaltung (Erstellen und Lesen) von Einträgen.
 */
public interface Verwaltung {


    /**
     * Erstellt einen neuen Eintrag.
     *
     * @param neuerEintrag Schnittstellenobjekt mit den Daten des neuen Eintrags.
     * @return Schnittstellenobjekt mit den Daten des neuen Eintrags zur Darstellung.
     */
    EintragDaten neuerEintrag(NeuerEintrag neuerEintrag);


    /**
     * Liest alle vorhandenen Einträge.
     *
     * @return Eine Liste mit Schnittstellenobjekten zur Darstellung der Einträge.
     */
    List<EintragDaten> leseAlleEintraege();

    
    /**
     * Speichert entscheidung einer Behörde
     * @param entscheidung
     * @return true wenn Eintrag aktualisiert werden konnte
     */
	boolean patchEintrag(Long aktenzeichen, Entscheidung entscheidung);
}
