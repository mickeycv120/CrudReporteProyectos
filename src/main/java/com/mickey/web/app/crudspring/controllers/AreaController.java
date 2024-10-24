package com.mickey.web.app.crudspring.controllers;

import com.mickey.web.app.crudspring.models.dao.IAreaDao;
import com.mickey.web.app.crudspring.models.entity.Areas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AreaController {

    @Autowired
    private IAreaDao<Areas> areaDao;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo","Listado de areas");
        model.addAttribute("Areas",areaDao.findAll());
        return "listar";
    }
}
