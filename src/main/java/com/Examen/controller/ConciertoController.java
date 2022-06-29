/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.controller;

import com.Examen.entity.Concierto;
import com.Examen.entity.Locacion;
import com.Examen.service.IConciertoService;
import com.Examen.service.ILocacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author EB8470W
 */
@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;

    @Autowired
    private ILocacionService locacionService;

    @GetMapping("/concierto")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "CONCIERTOS");
        model.addAttribute("concierto", listaConcierto);
        return "concierto";
    }
    
    @GetMapping("/conciertoN")
    public String crearConcierto (Model model){
        List<Locacion> listaLocacion = locacionService.listCountry();
        model.addAttribute("concierto",new Concierto());
        model.addAttribute("locacion",listaLocacion);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarConcierto (@ModelAttribute Concierto concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
    @GetMapping("/editConcierto/{id}")
    public String editarConcierto (@PathVariable("id")Long idConcierto, Model model){
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Locacion> listaLocacion = locacionService.listCountry();
        model.addAttribute("concierto",concierto);
        model.addAttribute("locacion",listaLocacion);
        return "crear";
    }
}
