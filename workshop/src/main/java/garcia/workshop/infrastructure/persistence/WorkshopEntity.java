/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "workshop")
public class WorkshopEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String phone;
    private String email;
    
    @JoinTable(
    name = "workshop_mechanic",
    joinColumns = @JoinColumn(name = "workshop_id"),
    inverseJoinColumns = @JoinColumn(name = "mechanic_id")
    )
    
    private Set<MechanicEntity> mechanics = new HashSet<>();

    public WorkshopEntity() {
    }

    public WorkshopEntity(Long id, String name, String address, String postalCode, String city, String country, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }
    
    
    
}
