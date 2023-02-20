package entitiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Customer {
    private String firstName;
    private String lastName;
    private LocalDate localDate;
    private List<Bill> bill;

    public Customer(String firstName, String lastName, int id, LocalDate localDate, Bill... bill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.localDate = localDate;
        this.bill = new ArrayList<>(Arrays.asList(bill));
    }

    @Override
    public String toString() {
        return "First Name: \t" + getFirstName()+ " Last Name: \t" + getLastName() +
                " Date : \t" + getLocalDate();
    }
}
