package com.fluex404.springbootcrud2.controller;

import com.fluex404.springbootcrud2.dao.SiswaDao;
import com.fluex404.springbootcrud2.model.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HttpMappingController {
    @Autowired
    private SiswaDao siswaDao;

    @GetMapping("/")
    public String createIndex(Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
        model.addAttribute("siswas", siswaDao.findAll(new PageRequest(page, 4)));
        model.addAttribute("buatPage", page);
        model.addAttribute("buatSiswa", new Siswa());
        return "index";
    }

    @PostMapping("/save")
    public String save(Siswa siswa) {
        siswaDao.save(siswa);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteSiswa(@RequestParam("id") int id) {
        siswaDao.deleteById(id);

        return "redirect:/";
    }
}
