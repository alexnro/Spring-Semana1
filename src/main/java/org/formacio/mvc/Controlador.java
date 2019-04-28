package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {

    @Autowired
    private ServeiAlumnat serveiAlumnat;


    @RequestMapping(value ="/alumnes")
    @ResponseBody
    public int NombreAlumnes(){
        return serveiAlumnat.getListaAlumnes().size();
    }
}
