package de.behoerde.kita.antrag.core.verwaltung.impl;

import de.behoerde.kita.antrag.core.enums.Status;
import de.behoerde.kita.antrag.core.verwaltung.Verwaltung;
import de.behoerde.kita.antrag.core.verwaltung.ausgabedaten.EintragDaten;
import de.behoerde.kita.antrag.core.verwaltung.eingabedaten.NeuerEintrag;
import de.behoerde.kita.antrag.persistence.verwaltung.dao.EintragDao;
import de.behoerde.kita.antrag.persistence.verwaltung.entity.Eintrag;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
public class VerwaltungImpl implements Verwaltung {

    private final EintragDao eintragDao;

    public VerwaltungImpl(EintragDao eintragDao) {
        this.eintragDao = eintragDao;
    }

    @Override
    public EintragDaten neuerEintrag(NeuerEintrag neuerEintrag) {
        Eintrag eintrag = new Eintrag();
        eintrag.setNachnameAntragssteller(neuerEintrag.getNachnameAntragssteller());
        eintrag.setVornameAntragssteller(neuerEintrag.getVornameAntragssteller());
        eintrag.setEmail(neuerEintrag.getEmail());
        eintrag.setNachnameKind(neuerEintrag.getNachnameKind());
        eintrag.setVornameKind(neuerEintrag.getVornameKind());
        eintrag.setKitaIdEins(neuerEintrag.getKitaIdEins());
        eintrag.setKitaIdZwei(neuerEintrag.getKitaIdZwei());
        eintrag.setKitaIdDrei(neuerEintrag.getKitaIdDrei());
        if (neuerEintrag.getStatus() == null) {
        	eintrag.setStatus(Status.OFFEN);
        } else {
        	eintrag.setStatus(neuerEintrag.getStatus());
        }
        
        eintrag.setAnmerkung(neuerEintrag.getAnmerkung());
        
        eintrag.setDatum(ZonedDateTime.now(ZoneId.of("Z")));

        eintragDao.speichere(eintrag);

        return mappeEintrag(eintrag);
    }

    @Override
    public List<EintragDaten> leseAlleEintraege() {
        return eintragDao.leseAlle().stream().map(this::mappeEintrag).collect(Collectors.toList());
    }

    private EintragDaten mappeEintrag(Eintrag eintrag) {
        return new EintragDaten(eintrag.getNachnameAntragssteller(), eintrag.getVornameAntragssteller(), eintrag.getEmail(),
        		eintrag.getNachnameKind(), eintrag.getVornameKind(), eintrag.getKitaIdEins(), eintrag.getKitaIdZwei(),
        		eintrag.getKitaIdDrei(), eintrag.getStatus(), eintrag.getAnmerkung(), eintrag.getDatum());        
    }
}
