package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrayListService {

    @Autowired
    GrayListService grayListService;

    public List<GrayList> fetchAllGrayLists(){
        return grayListService.fetchAllGrayLists();
    }
    public void deleteById(int grayListId){
        grayListService.deleteById(grayListId);
    }
    public void createGrayList(GrayList grayList){
        grayListService.createGrayList(grayList);
    }
    public void updateGrayList(GrayList grayList){
        grayListService.updateGrayList(grayList);
    }
    public void readByListId(int grayListId){
        grayListService.readByListId( grayListId);
    }
}
