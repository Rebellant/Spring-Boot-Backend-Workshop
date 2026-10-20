/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "customer")
public class CustomerEntity {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<VehicleEntity> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<VehicleEntity> vehicles) {
        this.vehicles = vehicles;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
      
    @Column(name = "document_number", nullable = false, unique = true, length = 20)
    private  String documentNumber;
    
    @Column(name = "first_name", nullable = false, length = 60)
    private  String firstName;
    
    @Column(name = "last_name", nullable = false, length = 80)
    private  String lastName;
    
    @Column(length = 20, nullable = false, unique = true)
    private  String phone;

    @Column(nullable = false, unique = true, length = 120)
    private  String email;
    
   @ManyToMany
    @JoinTable(
        name = "customer_vehicle",
        joinColumns = @JoinColumn(name = "customer_id"),
        inverseJoinColumns = @JoinColumn(name = "vehicle_id")
    )
    private Set<VehicleEntity> vehicles = new HashSet<>();
    
    public CustomerEntity() {}

    public CustomerEntity(Long id, String documentNumber, String firstName, String lastName, String phone, String email) {
        this.id = id;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }
    
    
}
