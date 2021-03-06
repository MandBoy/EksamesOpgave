package com.example.EksamesOpgave.demo.service;

import com.example.EksamesOpgave.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EksamesOpgave.demo.repository.ItemRepo;
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
    public Item readById(int itemId){
        return itemRepo.readById(itemId);
    }
}
