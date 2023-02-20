package service;


import entitiy.CorporateCustomer;
import entitiy.IndividualCustomer;

public interface CustomerManager {

    //Add for individual customers
    void addIndividualCustomer(IndividualCustomer individualCustomer);

    //Add for corporate customers
    void addCorporateCustomer(CorporateCustomer corporateCustomer);

    //Return get all customers
    void getAllCustomers();

    //List customers with the letter 'C' in them
    void getAllCustomersContainsInC();

    //Calculate list the total amount of their bills registered in June.
    void getAllCustomersBillsSignInJune();

    //Lists all bill.
    void getAllBill();

    //List invoices over 1500TL in the system
    void getAllListBillOver1500();

    //The average of customers bill over 1500.
    void getAllListBillOverAverage1500();

    //List the names of customers with bills under 500TL in the system.
    void getNameCustomerBillUnder500();

    //Calculate the average of invoices over 1500TL in the system
    void getAllAveragesCustomersBillOver1500();

    //Write the code that lists the companies in which the average bill for the month of June are below 750.
    void getAllCorporateCustomersBillAverage750();







}
