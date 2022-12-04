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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getEmp_rate() {
        return emp_rate;
    }

    public void setEmp_rate(double emp_rate) {
        this.emp_rate = emp_rate;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public int getEmp_days() {
        return emp_days;
    }

    public void setEmp_days(int emp_days) {
        this.emp_days = emp_days;
    }

}
