package by.pms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@ToString
@RequiredArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "EMPLOYE")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDEMP", nullable = false)
    private Integer id;

    @Column(name = "FIO", nullable = false)
    private String fio;

    @Column(name = "EMP_DAYWORK", nullable = false)
    private Integer daywork;

    @Column(name = "EMP_RATE", nullable = false)
    private Double rate;

    @Column(name = "EMP_SALARY")
    private Double salary;

    public Employe(String fio, Integer daywork, Double rate, Double salary) {
        this.fio = fio;
        this.daywork = daywork;
        this.rate = rate;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id != null && Objects.equals(id, employe.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getDaywork() {
        return daywork;
    }

    public void setDaywork(Integer daywork) {
        this.daywork = daywork;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = daywork * 8 * rate;
    }
}