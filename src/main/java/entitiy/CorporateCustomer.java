package entitiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CorporateCustomer extends Customer{
    private String sectorName;

    public CorporateCustomer(String firstName, String lastName, LocalDate localDate,
                             String sectorName, Bill... bill) {
        super(firstName, lastName, localDate, List.of(bill));
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return super.toString() + " Sector Name : " + getSectorName();
    }
}
