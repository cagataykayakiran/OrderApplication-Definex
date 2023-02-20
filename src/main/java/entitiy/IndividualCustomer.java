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
public class IndividualCustomer extends Customer{

    public IndividualCustomer(String firstName, String lastName,LocalDate localDate,
                              Bill... bills) {
        super(firstName, lastName, localDate, List.of(bills));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
