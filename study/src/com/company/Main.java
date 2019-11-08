package com.company;

public class Main {

    final static Customer c = new Customer(1, "a");

    public static void main(String[] args) {
        Customer localCustomer = new Customer(1, "Local customer 1");
        Customer localCustomer2 = new Customer(2, "Local customer 2");

        int localValue = 5;

        calculate(localValue);
        setNewCostumer(localCustomer);
        changeCustomerName(localCustomer2);

        System.out.println("Local value: " + localValue);
        System.out.println("Local customer: " + localCustomer);
        System.out.println("Local customer 2: " + localCustomer2);
    }

    private static void calculate(int calcValue) {
        /* The calcValue is a literary copy of the object received by params */
        calcValue *= 100;
        System.out.println("Value calculed: " + calcValue);
    }

    private static void setNewCostumer(Customer newCostumer) {
        // The [newCostumer] is a copy of the pointer to the object on the heap

        newCostumer = new Customer(2, "New Costumer");

        /*
         * When we instantiate a new object to [newCostumer]
         * the value of [newCostumer] on stack is changed
         * to a pointer to the a new object on the heap
         */

        System.out.println("Customer new customer: " + newCostumer);
    }

    private static void changeCustomerName(Customer customerRenamed) {
        /*
        new value on the stack that called customerRenamed
        that pointer to the object received by param.
         */
        customerRenamed.setNome("Name renamed");
        /*
        When we change the value of [ nome ]
        we create a new string in heap and pointer to it
         */
        System.out.println("Customer customer renamed: " + customerRenamed);
    }
}

class Customer {

    private int id;
    private String nome;

    public Customer(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
