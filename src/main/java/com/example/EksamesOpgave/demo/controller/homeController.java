/*
Lavet a Leopold
 */
package com.example.EksamesOpgave.demo.controller;

import com.example.EksamesOpgave.demo.model.Bruger;
import com.example.EksamesOpgave.demo.service.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
    @Autowired
    BrugerService brugerService;

    //route - vi bruger view model til at gå til og fra browser.
    @GetMapping("/brugerdata")
    public String brugerdata(Model model){
        model.addAttribute("bruger", brugerService.fetchAllBruger());
        return "brugerdata";
    }
    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String createBruger(@ModelAttribute Bruger bruger){
        brugerService.createBruger(bruger);
        return "redirect:/brugerdata";
    }
    /*
    @GetMapping("/opdater/{brugerId}")
    public String opdaterBruger(@PathVariable("brugerId") int brugerId, Model model){
        model.addAttribute("bruger", brugerService.readById(brugerId));
        return "opdater";

    }
    @PostMapping("/opdater")
    public String
    */
}
