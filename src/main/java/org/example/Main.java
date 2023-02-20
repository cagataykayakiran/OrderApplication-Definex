package org.example;

import entitiy.Bill;
import entitiy.CorporateCustomer;
import entitiy.IndividualCustomer;
import service.CustomerManager;
import service.CustomerManagerImpl;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final CustomerManager customerManager = new CustomerManagerImpl();

        CorporateCustomer corporateCustomer = new CorporateCustomer(" cagatay ", " kayakiran ",LocalDate.of(2023, Month.JUNE, 25), " IT ",
                new Bill(25.3,LocalDate.of(2023,Month.JUNE,26)));

        CorporateCustomer corporateCustomer1 = new CorporateCustomer(" cagatay1 ", " kayakiran1 ",LocalDate.of(2023, Month.JULY, 25), " HR ",
                new Bill(212.3,LocalDate.of(2023,Month.JULY,26)));

        CorporateCustomer corporateCustomer2 = new CorporateCustomer(" cagatay2 ", " kayakiran2 ",LocalDate.of(2023, Month.AUGUST, 25), " IT ",
                new Bill(29.5,LocalDate.of(2023,Month.AUGUST,26)));

        CorporateCustomer corporateCustomer3 = new CorporateCustomer(" cagatay3 ", " kayakiran3 ",LocalDate.of(2023, Month.SEPTEMBER, 25), " IT ",
                new Bill(2533.5,LocalDate.of(2023,Month.SEPTEMBER,26)));

        IndividualCustomer individualCustomer = new IndividualCustomer(" cagatay4 ", " kayakiran4 ", LocalDate.of(2023, Month.OCTOBER, 25),
                new Bill(2578.2,LocalDate.of(2023,Month.OCTOBER,26)));

        IndividualCustomer individualCustomer1 = new IndividualCustomer(" cagatay5 ", " kayakiran5 ", LocalDate.of(2023, Month.NOVEMBER, 25),
                new Bill(255,LocalDate.of(2023,Month.NOVEMBER,26)));

        IndividualCustomer individualCustomer2 = new IndividualCustomer(" cagatay6 ", " kayakiran6 ", LocalDate.of(2023, Month.DECEMBER, 25),
                new Bill(25,LocalDate.of(2023,Month.DECEMBER,26)));

        IndividualCustomer individualCustomer3 = new IndividualCustomer(" cagatay7 ", " kayakiran7 ", LocalDate.of(2024, Month.JANUARY, 25),
                new Bill(124.5,LocalDate.of(2024,Month.JANUARY,26)));

        IndividualCustomer individualCustomer4 = new IndividualCustomer(" cagatay8 ", " kayakiran8 ", LocalDate.of(2024, Month.FEBRUARY, 25),
                new Bill(168,LocalDate.of(2024,Month.FEBRUARY,26)));


        customerManager.addCorporateCustomer(corporateCustomer);
        customerManager.addCorporateCustomer(corporateCustomer1);
        customerManager.addCorporateCustomer(corporateCustomer2);
        customerManager.addCorporateCustomer(corporateCustomer3);
        customerManager.addIndividualCustomer(individualCustomer);
        customerManager.addIndividualCustomer(individualCustomer1);
        customerManager.addIndividualCustomer(individualCustomer2);
        customerManager.addIndividualCustomer(individualCustomer3);
        customerManager.addIndividualCustomer(individualCustomer4);

        customerManager.getAllCustomers();
        customerManager.getAllCustomersContainsInC();
        customerManager.getAllAveragesCustomersBillOver1500();
        customerManager.getAllCustomersBillsSignInJune();
        customerManager.getAllBill();
        customerManager.getAllListBillOver1500();
        customerManager.getAllListBillOverAverage1500();
        customerManager.getNameCustomerBillUnder500();
        customerManager.getAllCorporateCustomersBillAverage750();
    }
}