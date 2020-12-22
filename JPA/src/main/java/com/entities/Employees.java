package com.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employees {

    @Id
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String hireDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Jobs jobId;
    private int salary;
    private int commissionPct;
    private int managerId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Departments departmentId;

}
