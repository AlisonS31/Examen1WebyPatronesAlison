/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.service;

import com.Examen.entity.Locacion;
import com.Examen.repository.LocacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EB8470W
 */
@Service
public class LocacionService implements ILocacionService {

    @Autowired
    private LocacionRepository locacionRepository;

    @Override
    public List<Locacion> listCountry() {
        return (List<Locacion>) locacionRepository.findAll();
    }
}
