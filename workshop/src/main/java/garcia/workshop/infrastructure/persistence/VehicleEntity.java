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
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="vehicle")
public class VehicleEntity {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<CustomerEntity> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(Set<CustomerEntity> customersList) {
        this.customersList = customersList;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "license_plate", nullable = false, unique = true, length = 15)
    private String licensePlate;

    @Column(length = 17, unique = true)
    private String vin;

    @Column(length = 50)
    private String brand;

    @Column(length = 50)
    private String model;


    @ManyToMany(mappedBy = "vehicles")
    private Set<CustomerEntity> customersList = new HashSet<>();
    
    public VehicleEntity() {
    }

    public VehicleEntity(Long id, String brand, String model, String licensePlate, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.vin = vin;
    }
    
    
}
