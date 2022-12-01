package by.pms.controllers;

import by.pms.entity.Employe;
import by.pms.repository.EmploeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@Controller
public class MainController {
    private final EmploeRepository emploeRepository;

    public MainController(EmploeRepository emploeRepository) {
        this.emploeRepository = emploeRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {
        Iterable<Employe> em = emploeRepository.findAll();
        model.addAttribute("em", em);
        return "home";
    }

    @GetMapping("/search/{id}")
    public String search(Model model, int id) {
        Iterable<Employe> em = emploeRepository.findAllById(Long.valueOf(id));
        model.addAttribute("em", em);
        return "home";
    }

    @PostMapping("/add")
    public String add(@RequestParam String fio, @RequestParam int daywork, @RequestParam double rate, @RequestParam double salary) {
        try {
            //double salary = daywork * 8 * rate;
            emploeRepository.save(new Employe(fio, daywork, rate, salary));
        } catch (Exception e) {
            return e.getMessage();
        }
        /*Iterable<Employe> em = emploeRepository.findAll();
        model.addAttribute("em", em);*/
        return "redirect:/home";
    }
}