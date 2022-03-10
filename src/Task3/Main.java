package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args)
    {
        Customer one = new Customer("Sebastian", "Berry", "Berry11");
        Customer two = new Customer("Lasse", "Jack", "Lass22");
        Customer three = new Customer("Abdullah", "Marawan", "Abdullahx9000");
        Customer four = new Customer("Jack", "jackson", "jackie");
        Customer five = new Customer("Mogens", "Perry", "Perry11");
        Customer six = new Customer("John", "Terry", "Terry11");

        customers.add(one);
        customers.add(two);
        customers.add(three);
        customers.add(four);
        customers.add(five);
        customers.add(six);

        printCustomers();
    }

    public static void printCustomers()
    {
        for (Customer c:customers)
        {
            System.out.println(c);
        }
    }
}
