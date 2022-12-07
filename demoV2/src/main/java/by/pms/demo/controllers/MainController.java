package by.pms.demo.controllers;

import by.pms.demo.entity.Employs;
import by.pms.demo.repository.EmploysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class MainController {
    @Autowired
    private EmploysRepository employsRepository;

    //add
    @PostMapping(path = "/add")
    public String addNewEmp(@RequestParam String fio,
                            @RequestParam int emp_days,
                            @RequestParam double emp_rate,
                            @RequestParam double emp_salary) {
        Employs emp = new Employs(fio, emp_days, emp_rate/10, emp_salary);
        employsRepository.save(emp);
        employsRepository.saveAll(employsRepository.findAll());
        return "redirect:/home";
    }

    //all
    @GetMapping(path = "/home")
    public String getAll(Model model) {
        Iterable<Employs> emp = employsRepository.findAll();
        model.addAttribute("emp", emp);
        return "home_page";
    }

    //delete
    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable Long id) {
        employsRepository.deleteById(id);
        return "redirect:/home";
    }

    @PostMapping(path = "/update")
    public String update(@RequestParam Long id,
                         @RequestParam String fio,
                         @RequestParam int emp_days,
                         @RequestParam double emp_rate,
                         @RequestParam double emp_salary) {
        try{
            Optional<Employs> e = employsRepository.findById(id);
            e.get().setFio(fio);
            e.get().setEmp_days(emp_days);
            e.get().setEmp_rate(emp_rate);
            e.get().setEmp_salary(emp_salary);
            employsRepository.save(e.get());
        } catch (Exception e){
            return "redirect:/home";
        }
        return "redirect:/home";
    }
}
