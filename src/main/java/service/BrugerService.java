package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BrugerRepo;
import model.Bruger;

import java.util.List;

@Service
public class BrugerService {
    /**
     *  Injection of dependencies by our repository
     */
    @Autowired
    BrugerRepo brugerRepo;

    public List<Bruger> fetchAllBruger(){
        return brugerRepo.fetchAllBruger();
    }
    public void deleteById(int brugerId){
        brugerRepo.deleteById(brugerId);
    }
    public void createBruger(Bruger bruger) {
        brugerRepo.createBruger(bruger);
    }
    public void readById(int brugerId){
        brugerRepo.readById(brugerId);
    }
    public void updateBruger(Bruger bruger){
        brugerRepo.updateBruger(bruger);
    }

}
