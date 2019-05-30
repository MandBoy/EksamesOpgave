package service;

import model.BorrowList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BorrowListRepo;

import java.util.List;

@Service
public class BorrowListService {

    @Autowired
    BorrowListRepo borrowlistRepo;

    public List<BorrowList> fetchAllBorrowLists(){
        return borrowlistRepo.fetchAllBorrowLists();
    }
    public void deleteById(int borrowListId){
        borrowlistRepo.deleteById(borrowListId);
    }
    public void createBorrowList(BorrowList borrowList){
        borrowlistRepo.createBorrowList(borrowList);
    }
    public void updateBorrowList(BorrowList borrowList){
        borrowlistRepo.updateBorrowList(borrowList);
    }
    public void readByListId(int bruger){
        borrowlistRepo.readByListId( bruger);
    }
}
