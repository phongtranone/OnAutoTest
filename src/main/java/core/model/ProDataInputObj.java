package core.model;

import com.opencsv.bean.CsvBindByPosition;

public class ProDataInputObj {
    @CsvBindByPosition(position = 0)
    String departure;

    @CsvBindByPosition(position = 1)
    String destination;

    @CsvBindByPosition(position = 2)
    String departDate;

    @CsvBindByPosition(position = 3)
    String returntDate;

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public void setReturntDate(String returntDate) {
        this.returntDate = returntDate;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartDate() {
        return departDate;
    }

    public String getReturntDate() {
        return returntDate;
    }
}
