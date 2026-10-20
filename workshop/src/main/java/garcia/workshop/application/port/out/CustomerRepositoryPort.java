/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package garcia.workshop.application.port.out;

import garcia.workshop.domain.model.Customer;

/**
 *
 * @author ruben
 */
public interface CustomerRepositoryPort {
    
    Customer save(Customer customer);
    
}
