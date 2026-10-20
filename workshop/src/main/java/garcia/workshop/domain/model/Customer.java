/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garcia.workshop.domain.model;


public class Customer {
    private Long id;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;   

    public Customer() {
    }

    public Customer(Long id, String documentNumber, String firstName, String lastName, String phone, String email) {
        this.id = id;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }
    
    // Customer factory methods
    public static Customer create (String documentNumber, String firstName, String lastName, String phone, String email){
    
            return new Customer(null,documentNumber, firstName, lastName,phone,email);
    };
    
    public static Customer reconstitute(Long id, String documentNumber, String firstName, String lastName, String phone, String email) {
        return new Customer(id,documentNumber, firstName, lastName,phone,email);
    }
    
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

}
