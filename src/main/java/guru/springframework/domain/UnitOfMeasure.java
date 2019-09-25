package guru.springframework.domain;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure {

    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
