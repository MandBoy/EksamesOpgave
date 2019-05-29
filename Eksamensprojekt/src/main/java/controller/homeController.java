package controller;

import model.Bruger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.BrugerService;

@Controller
public class homeController {

    @Autowired
    BrugerService brugerService;

    @GetMapping("/brugerdata")
    public String personData(Model model){
        // tilføj person collection til model atribut persons
        model.addAttribute("Bruger", brugerService.fetchAllBruger());
        return "brugerdata";
    }

    @GetMapping("/create")
    public String showCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Bruger bruger){
        // tilføj person vha. add service
        brugerService.createBruger(bruger);
        // sikr mod refresh problem
        return "redirect:/brugerdata";
    }

    @GetMapping("/delete/{iden}")
    public String delete(@PathVariable("iden") int brugerId){
        //kald deleteservice med id
        brugerService.deleteById(brugerId);
        //sikr mod refresh fejl og sletter igen
        return "redirect:/brugerdata";
    }

}
