package com.ph.mysql.controller;

import com.ph.mysql.dao.AdressRepository;
import com.ph.mysql.model.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    private AdressRepository adressRepository;

    @GetMapping
    public @ResponseBody Iterable<Adress> getAllAdresses() {
        return adressRepository.findAll();
    }

    @PostMapping
    public @ResponseBody String addNewAdress(@RequestBody Adress adress) {
        adressRepository.save(adress);
        return "Saved";
    }

    @GetMapping("/{id}")
    public @ResponseBody
    List<Adress> getAllByPersonId(@PathVariable Long id) {
        return adressRepository.findAllByPersonId(id);
    }
}
