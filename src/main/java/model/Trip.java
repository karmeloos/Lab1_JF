package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Trip {
    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destiny;
    private BigDecimal price;

    public LocalDate getStartOfTrip() {
        return startOfTrip;
    }

    public void setStartOfTrip(LocalDate startOfTrip) {
        this.startOfTrip = startOfTrip;
    }

    public LocalDate getEndOfTrip() {
        return endOfTrip;
    }

    public void setEndOfTrip(LocalDate endOfTrip) {
        this.endOfTrip = endOfTrip;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
