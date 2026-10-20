/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ruben
 */
public interface SpringDataCustomerRepository extends JpaRepository<CustomerEntity,Long> {
    
}
