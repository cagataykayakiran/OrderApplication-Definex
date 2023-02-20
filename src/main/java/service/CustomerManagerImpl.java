package service;


import entitiy.Bill;
import entitiy.CorporateCustomer;
import entitiy.IndividualCustomer;
import lombok.Getter;
import lombok.Setter;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
public class CustomerManagerImpl implements CustomerManager {

    private final List<IndividualCustomer> individualCustomers = new ArrayList<>();
    private final List<CorporateCustomer> corporateCustomers = new ArrayList<>();

    @Override
    public void addIndividualCustomer(IndividualCustomer individualCustomer) {
        individualCustomers.add(individualCustomer);
    }

    @Override
    public void addCorporateCustomer(CorporateCustomer corporateCustomer) {
        corporateCustomers.add(corporateCustomer);
    }

    @Override
    public void getAllCustomers() {
        System.out.println("----Individual Customers----");
        for (IndividualCustomer individualCustomer : individualCustomers) {
            System.out.println(individualCustomer.toString() + " Bill: " + individualCustomer.getBill().stream()
                    .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
        }
        System.out.println("----Corporate Customer----");
        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            System.out.println(corporateCustomer.toString() + " Bill: " + corporateCustomer.getBill().stream()
                    .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
        }

    }

    @Override
    public void getAllCustomersContainsInC() {
        System.out.println("Contains in C customers");
        for (IndividualCustomer individualCustomer : individualCustomers) {
            if (individualCustomer.getFirstName().toUpperCase().contains("C")) {
                System.out.println(individualCustomer.toString() +
                        " Bill " + individualCustomer.getBill().stream()
                        .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
            }
        }
        System.out.println("****************");
        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            if (corporateCustomer.getFirstName().toUpperCase().contains("C")) {
                System.out.println(corporateCustomer.toString() +
                        " Bill " + corporateCustomer.getBill().stream()
                        .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
            }
        }

    }

    @Override
    public void getAllCustomersBillsSignInJune() {
        double total = 0.0;

        for (IndividualCustomer individualCustomer : individualCustomers) {
            if (individualCustomer.getLocalDate().getMonth() == Month.JUNE) {
                List<Bill> bills = individualCustomer.getBill().stream().toList();
                for (Bill bill : bills) {
                    total += bill.getAmount();
                }
            }
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            if (corporateCustomer.getLocalDate().getMonth() == Month.JUNE) {
                List<Bill> bills = corporateCustomer.getBill().stream().toList();
                for (Bill bill : bills) {
                    total += bill.getAmount();
                }
            }
        }
        System.out.println("Total: " + total);
    }

    @Override
    public void getAllBill() {
        System.out.println("----All Bill List----");
        for (IndividualCustomer individualCustomer : individualCustomers) {
            System.out.println(
                    " Bill: " + individualCustomer.getBill().stream()
                            .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            System.out.println(
                    " Bill: " + corporateCustomer.getBill().stream()
                            .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
        }
        System.out.println();
    }

    @Override
    public void getAllListBillOver1500() {
        System.out.println("----All customers bill amount over 1500----");

        for (IndividualCustomer individualCustomer : individualCustomers) {
            List<Bill> bills = individualCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            if (bills.size() > 0) {
                System.out.println(
                        " Bill: " + individualCustomer.getBill().stream()
                                .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
            }
        }
        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            List<Bill> bills = corporateCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            if (bills.size() > 0) {
                System.out.println(
                        " Bill: " + corporateCustomer.getBill().stream()
                                .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
            }
        }
        System.out.println();
    }

    @Override
    public void getAllListBillOverAverage1500() {
        List<Double> numbers = new ArrayList<>();
        double total = 0.0;

        for (IndividualCustomer individualCustomer : individualCustomers) {
            List<Bill> bills = individualCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            for (Bill bill : bills) {
                numbers.add(bill.getAmount());
            }
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            List<Bill> bills = corporateCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            for (Bill bill : bills) {
                numbers.add(bill.getAmount());
            }
        }

        for (double number : numbers) {
            total += number;
        }

        System.out.println("Average customers bill over 1500 : " + total / numbers.size());
        System.out.println();
    }

    @Override
    public void getNameCustomerBillUnder500() {
        for (IndividualCustomer individualCustomer : individualCustomers) {
            List<Bill> bills = individualCustomer.getBill().stream().filter(invoice -> invoice.getAmount() < 500).toList();
            if (bills.size() > 0) {
                System.out.println("Name customers with bill under 500 : " + individualCustomer.getFirstName() +
                        " Bill: " + individualCustomer.getBill().stream()
                        .map(customer -> " Price " + customer.getAmount() + " Date: " + customer.getDate()).toList());
                System.out.println();
            }
        }
    }

    @Override
    public void getAllAveragesCustomersBillOver1500() {
        List<Double> numbers = new ArrayList<>();
        double total = 0.0;

        for (IndividualCustomer individualCustomer : individualCustomers) {
            List<Bill> bills = individualCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            for (Bill bill : bills) {
                numbers.add(bill.getAmount());
            }
        }

        for (CorporateCustomer corporateCustomer : corporateCustomers) {
            List<Bill> bills = corporateCustomer.getBill().stream().filter(invoice -> invoice.getAmount() > 1500).toList();
            for (Bill bill : bills) {
                numbers.add(bill.getAmount());
            }
        }

        for (double number : numbers) {
            total += number;
        }

        System.out.println("Total customers bill over 1500 : " + total);
        System.out.println();
    }

    @Override
    public void getAllCorporateCustomersBillAverage750() {
        List<CorporateCustomer> corporateCustomerList = new ArrayList<>();

        for (CorporateCustomer customer : corporateCustomers) {
            double JuneInvoiceTotal = 0;
            int JuneInvoiceCount = 0;
            for (Bill bill : customer.getBill()) {
                if (bill.getDate().getMonth() == Month.JUNE) {
                    JuneInvoiceTotal += bill.getAmount();
                    JuneInvoiceCount++;
                }
            }
            if (JuneInvoiceCount > 0 && (JuneInvoiceTotal / JuneInvoiceCount) < 750) {
                corporateCustomerList.add(customer);
            }

        }

        System.out.println();

        for (CorporateCustomer corporateCustomer : corporateCustomerList) {
            System.out.println(corporateCustomer.getSectorName() + " :" + corporateCustomer.getSectorName());
        }
        System.out.println();
    }
}

