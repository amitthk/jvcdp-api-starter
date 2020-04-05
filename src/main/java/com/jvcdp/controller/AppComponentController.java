package com.jvcdp.controller;

import java.util.List;
import java.util.Optional;

import com.jvcdp.model.AppComponentEntity;
import com.jvcdp.model.RecordNotFoundException;
import com.jvcdp.repository.AppComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class AppComponentController
{
    @Autowired
    AppComponentService service;

    @RequestMapping
    public String getAllAppComponents(Model model)
    {
        List<AppComponentEntity> list = service.findAll();

        model.addAttribute("appcomponents", list);
        return "list";
    }

    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editAppComponentById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException
    {
        if (id.isPresent()) {
            AppComponentEntity entity = service.findOne(id.get());
            model.addAttribute("appcomponent", entity);
        } else {
            model.addAttribute("appcomponent", new AppComponentEntity());
        }
        return "edit";
    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteAppComponentById(Model model, @PathVariable("id") Long id)
            throws RecordNotFoundException
    {
        service.delete(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/createAppComponent", method = RequestMethod.POST)
    public String createOrUpdateAppComponent(AppComponentEntity AppComponent)
    {
        service.saveAndFlush(AppComponent);
        return "redirect:/";
    }
}