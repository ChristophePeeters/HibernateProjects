package be.vdab.muziek.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class Track implements Serializable {
    private static final long serialVersionUID = 1L;
    private String naam;
    private BigDecimal tijd;

    protected Track(){    }

    public String getNaam() {
        return naam;
    }

    public BigDecimal getTijd() {
        return tijd;
    }

// equals en hashCode gebaseerd op naam

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(getNaam(), track.getNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam());
    }
}