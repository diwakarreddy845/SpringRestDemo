package com.diwakar.rest.SpringRestDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {


    @GetMapping("/books")
    public List<Book> getList(){
        return Arrays.asList(new Book(1,"D", "diwakar"));
    }
}
