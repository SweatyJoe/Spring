package by.pms.demo.entity;

import jakarta.persistence.*;
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
    private double emp_salary_bonus;

    @PostLoad
    private void postLoad(){
        this.emp_salary = emp_rate/10*8*emp_days+emp_salary_bonus;
    }
    public Employs(){}
    public Employs(String fio, int emp_days, double emp_rate, double emp_salary_bonus){
        this.fio = fio;
        this.emp_days = emp_days;
        this.emp_rate = emp_rate;
        this.emp_salary_bonus = emp_salary_bonus;
    }

}
