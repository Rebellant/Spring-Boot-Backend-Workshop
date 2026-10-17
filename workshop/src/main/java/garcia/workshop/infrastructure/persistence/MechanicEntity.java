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
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "mechanic")
public class MechanicEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String specialty;
    private String phone;
    private String email;

    @ManyToMany(mappedBy = "mechanics")
    Set<WorkshopEntity> workshops = new HashSet<>();
    
    public MechanicEntity() {
    }

    public MechanicEntity(Long id, String documentNumber, String firstName, String lastName, String specialty, String phone, String email) {
        this.id = id;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.phone = phone;
        this.email = email;
    }
    
    
    
}
