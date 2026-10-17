/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import garcia.workshop.infrastructure.persistence.CustomerEntity;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="vehicle")
public class VehicleEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String licensePlate;
    private String vin;
    private CustomerEntity customerE;


    @ManyToMany(mappedBy = "vehicles")
    private Set<CustomerEntity> customersList = new HashSet<>();
    
    public VehicleEntity() {
    }

    public VehicleEntity(Long id, String brand, String model, String licensePlate, String vin, CustomerEntity customerE) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.customerE = customerE;
    }
    
    
}
