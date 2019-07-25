package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepo;
import model.Item;

import java.util.List;

@Service
public class ItemService {
    /**
     *  Injection of dependencies by our repository
     */
    @Autowired
    ItemRepo itemRepo;
    public List<Item> fetchAllItems(){
        return itemRepo.fetchAllItems();
    }
    public void deleteById(int itemId){
        itemRepo.deleteById(itemId);
    }
    public void createItem(Item item){
        itemRepo.createItem(item);
    }
    public void updateItem(Item item){
        itemRepo.updateItem(item);
    }
    public void readById(int itemId){
        itemRepo.readById(itemId);
    }
}
