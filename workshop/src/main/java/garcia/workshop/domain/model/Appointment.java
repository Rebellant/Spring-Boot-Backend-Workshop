/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.domain.model;

import java.time.LocalDateTime;


public class Appointment {
    private Long id;
    private String appointmentNumber;
    private LocalDateTime scheduledAt;
    private String vehicle_failure_Desc;
    private AppointmentStatus status;
    private Customer customer;
    private Vehicle vehicle;
    private Workshop workshop;
    private Mechanic mechanic;

    public Appointment(Long id, String appointmentNumber, LocalDateTime scheduledAt, String vehicle_failure_Desc, AppointmentStatus status, Customer customer, Vehicle vehicle, Workshop workshop, Mechanic mechanic) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public LocalDateTime getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(LocalDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public String getVehicle_failure_Desc() {
        return vehicle_failure_Desc;
    }

    public void setVehicle_failure_Desc(String vehicle_failure_Desc) {
        this.vehicle_failure_Desc = vehicle_failure_Desc;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

  
}
