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
    private Vehicle vehicle;
    private Workshop workshop;
    private Mechanic mechanic;
}
