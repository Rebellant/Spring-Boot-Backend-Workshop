/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;

import garcia.workshop.domain.model.Customer;
import org.springframework.stereotype.Repository;
import garcia.workshop.application.port.out.CustomerRepositoryPort;

@Repository
public class JpaCustomerRepositoryAdapter implements CustomerRepositoryPort {
    
    private final SpringDataCustomerRepository springCustomerRepository;
    
    public JpaCustomerRepositoryAdapter (SpringDataCustomerRepository springCustomerRepository){
          
        this.springCustomerRepository = springCustomerRepository;
        
    };
    
    
    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity(customer.getId(),customer.getDocumentNumber(), customer.getFirstName(), customer.getLastName(), customer.getPhone(), customer.getEmail());
         CustomerEntity savedCustomer = springCustomerRepository.save(customerEntity);
        return new Customer(savedCustomer.getId(),savedCustomer.getDocumentNumber(),savedCustomer.getFirstName(),savedCustomer.getLastName(),savedCustomer.getPhone(),savedCustomer.getEmail());
    }
}
