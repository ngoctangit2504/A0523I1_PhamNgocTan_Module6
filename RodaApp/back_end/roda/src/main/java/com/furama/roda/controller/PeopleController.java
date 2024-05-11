package com.furama.roda.controller;

import com.furama.roda.model.People;
import com.furama.roda.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:3000") // Chỉ cho phép gọi từ domain http://localhost:3000
public class Controller {

    @Autowired
    private IPeopleService iPeopleService;
    @GetMapping("/")
    public ModelAndView showList(@RequestParam(defaultValue = "0", required = false) int page,
                                 @RequestParam(defaultValue = "3", required = false) int pageSize,
                                 Model model) {
        Sort sort = Sort.by("name").ascending();
        Pageable pageable = PageRequest.of(page, 3, sort);
        Page<People> pagePeople = iPeopleService.findAll(pageable);
        int size = pagePeople.getTotalPages();
        List<Integer> listPage = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            listPage.add(i);
        }
        model.addAttribute("page", listPage);
        return ;
    }
}
