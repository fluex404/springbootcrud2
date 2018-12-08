package com.fluex404.springbootcrud2.controller;

import com.fluex404.springbootcrud2.dao.SiswaDao;
import com.fluex404.springbootcrud2.model.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMappingRestController {
    @Autowired
    private SiswaDao siswaDao;

    @GetMapping("/findOne")
    public Siswa createFindOne(@RequestParam("id") Integer id) {
        Siswa s = new Siswa();
        Siswa tmp = siswaDao.getOne(id);

        //init
        s.setId(tmp.getId());
        s.setNama(tmp.getNama());
        s.setJurusan(tmp.getJurusan());

        return s;
    }

}
