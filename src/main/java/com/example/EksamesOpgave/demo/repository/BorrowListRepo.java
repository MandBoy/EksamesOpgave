package com.example.EksamesOpgave.demo.repository;

import com.example.EksamesOpgave.demo.model.BorrowList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Repository class that handle our SQL querries
 */

@Repository
public class BorrowListRepo {
    @Autowired
    JdbcTemplate template;

    public List<BorrowList> fetchAllBorrowLists(){
        String sql =" SELECT * FROM BorrowList";
        RowMapper<BorrowList> rowMapper = new BeanPropertyRowMapper<>(BorrowList.class);
        return template.query(sql, rowMapper);
    }

    public void readByListId(int bruger){
        String sql = "SELECT * FROM BorrowList WHERE bruger=?";
        RowMapper<BorrowList> rowMapper = new BeanPropertyRowMapper<>(BorrowList.class);
        template.queryForObject(sql, rowMapper, bruger);
    }

    public void createBorrowList(BorrowList borrowList){
        String sql = "insert into BorrowList (tidspunkt, Afleverer) values(?, ?)";
        RowMapper<BorrowList> rowMapper = new BeanPropertyRowMapper<>(BorrowList.class);
        template.update(sql, rowMapper, rowMapper, borrowList.getTidspunkt(), borrowList.getAfleverer());
    }

    public void updateBorrowList(BorrowList borrowList){
        String sql ="Update BorrowList SET tidspunt=?, Afleverer=?";
        template.update(sql, borrowList.getAfleverer(), borrowList.getTidspunkt());
    }

    public void deleteById(int borrowListId){
        String sql = " Delete from BorrowList WHERE borrowListId=?";
        template.update(sql, borrowListId);
    }

}

