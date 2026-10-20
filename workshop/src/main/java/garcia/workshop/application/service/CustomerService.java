/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.application.service;

import garcia.workshop.application.port.in.CreateCustomerUseCase;
import garcia.workshop.domain.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CreateCustomerUseCase{
    
    @Override
    public Customer createCustomer (Customer customer){
    
    return null;
    };
}
