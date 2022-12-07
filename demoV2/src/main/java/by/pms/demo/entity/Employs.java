package by.pms.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fio;
    private double emp_rate, emp_salary;
    private int emp_days;

    public Employs(){}
    public Employs(String fio, int emp_days, double emp_rate, double emp_salary){
        this.fio = fio;
        this.emp_days = emp_days;
        this.emp_rate = emp_rate;
        this.emp_salary = emp_salary;
    }

}
