
package com.idealpublicschool.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rollNumber;
    private String standard;
    private String email;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getStandard() { return standard; }
    public void setStandard(String standard) { this.standard = standard; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
