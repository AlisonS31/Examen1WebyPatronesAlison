/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.repository;

import com.Examen.entity.Locacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author EB8470W
 */
@Repository
public interface LocacionRepository extends CrudRepository<Locacion,Long>{
    
}
