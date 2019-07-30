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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @Autowired
    BrugerService brugerService;

    //route - vi bruger view model til at gå til og fra browser.
    @GetMapping("")
    public String frontPage(){
        return "frontPage";
    }
    @PostMapping("")
    public String goFrontPage(){
        return "redirect:/frontPage";
    }

    @GetMapping("/frontPage")
    public String getFrontPage(){
        return "frontPage";
    }
    @PostMapping("/frontPage")
    public String goFront(){ return "redirect:/frontPage"; }

    @GetMapping("/login")
    public String login(){ return "login"; }
    @PostMapping("/login")
    public String goLogin(){ return "redirect:/login"; }

    @GetMapping("/actionPage")
    public String actionPage(){ return "actionPage"; }
    @PostMapping("/actionPage")
    public String goActionPage(){ return "redirect:/actionPage"; }

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

    @GetMapping("/website")
    public String website(){
        return "website";
    }
    @PostMapping("/website")
    public String goWebsite(){
        return "redirect:/website";
    }

    @GetMapping("/borrow")
    public String borrow(){
        return "borrow";
    }
    @PostMapping("/borrow")
    public String goBorrow(){
        return "redirect:/borrow";
    }


    @GetMapping("/opdater/{brugerId}")
    public String opdaterBruger(@PathVariable("brugerId") int brugerId, Model model){
        model.addAttribute("bruger", brugerService.readById(brugerId));
        return "opdater";
    }


    @PostMapping("/opdater")
    public String opdateringfærdig(@ModelAttribute Bruger bruger){
        brugerService.updateBruger(bruger);
        return "redirect:/createBruger"+bruger.getId();
    }

    @GetMapping("/delete/{brugerId}")
    public String delete(@PathVariable("brugerId") int brugerId){
        brugerService.deleteById(brugerId);
        return "redirect:/createBruger";
    }



}
