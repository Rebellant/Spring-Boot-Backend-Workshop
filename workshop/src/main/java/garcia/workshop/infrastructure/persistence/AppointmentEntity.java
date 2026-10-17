/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.infrastructure.persistence;

import garcia.workshop.domain.model.AppointmentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "appointment")
public class AppointmentEntity {
  
    
    private Long id;
    private String appointmentNumber;
    private LocalDateTime scheduledAt;
    private String vehicle_failure_Desc;
    private AppointmentStatus status;
   

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    
    public AppointmentEntity() {
    }
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private VehicleEntity vehicle;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private WorkshopEntity workshop;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private MechanicEntity mechanic;

    public AppointmentEntity(Long id, String appointmentNumber, LocalDateTime scheduledAt, String vehicle_failure_Desc, AppointmentStatus status, CustomerEntity customer, VehicleEntity vehicle, WorkshopEntity workshop, MechanicEntity mechanic) {
        this.id = id;
        this.appointmentNumber = appointmentNumber;
        this.scheduledAt = scheduledAt;
        this.vehicle_failure_Desc = vehicle_failure_Desc;
        this.status = status;
        this.customer = customer;
        this.vehicle = vehicle;
        this.workshop = workshop;
        this.mechanic = mechanic;
    }

  
    
    
}
