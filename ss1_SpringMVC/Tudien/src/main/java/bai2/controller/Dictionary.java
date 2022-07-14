package bai2.controller;

import bai2.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {

    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("")
    public String showFormList() {
        return "list";
    }

    @PostMapping("")
    public String save(@RequestParam(value = "name", defaultValue = "") String name, Model model) {
        String txtSearch = dictionaryService.dictionary(name);
        model.addAttribute("txtSearch", txtSearch);
        return "list";
    }
}
