package by.demo.controllers;

import by.demo.entity.Book;
import by.demo.entity.Publisher;
import by.demo.repository.BookRepository;
import by.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*@Autowired
    private BookRepository bookRepository;*/
    @Autowired
    private PublisherRepository publisherRepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<Publisher> books = publisherRepository.findAll();
        model.addAttribute("books", books);
        return "home";
    }
}
