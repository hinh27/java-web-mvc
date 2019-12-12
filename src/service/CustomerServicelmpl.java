package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService{

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"A","A@gmail.com","Ha Noi"));
        customers.put(2,new Customer(2,"B","B@gmail.com","Nam Dinh"));
        customers.put(3,new Customer(3,"C","C@gmail.com","Hai Phong"));
        customers.put(4,new Customer(4,"D","D@gmail.com","Thai Binh"));
        customers.put(5,new Customer(5,"E","E@gmail.com","Ha Nam"));
        customers.put(6,new Customer(6,"F","F@gmail.com","Quang Ninh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }


    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}