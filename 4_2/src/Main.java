import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Nihal", "Eþdoðan", 1999, "10901692334");

		customerManager.Save(customer);
		System.out.println();

	}

}
