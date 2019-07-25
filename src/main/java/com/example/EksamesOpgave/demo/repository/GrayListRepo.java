package com.example.EksamesOpgave.demo.repository;

import com.example.EksamesOpgave.demo.model.GrayList;
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
public class GrayListRepo {
    @Autowired
    JdbcTemplate template;

    public List<GrayList> fetchAllGrayLists(){
        String sql =" SELECT * FROM GrayList";
        RowMapper<GrayList> rowMapper = new BeanPropertyRowMapper<>(GrayList.class);
        return template.query(sql, rowMapper);
    }

    public void readByListId(int grayListId){
        String sql = "SELECT * FROM GrayList WHERE grayListId=?";
        RowMapper<GrayList> rowMapper = new BeanPropertyRowMapper<>(GrayList.class);
        template.queryForObject(sql, rowMapper, grayListId);
    }

    public void createGrayList(GrayList grayList){
        String sql = "insert into GrayList (bruger) values(?)";
        RowMapper<GrayList> rowMapper = new BeanPropertyRowMapper<>(GrayList.class);
        template.update(sql, rowMapper,rowMapper, grayList.getBruger());
    }

    public void updateGrayList(GrayList grayList){
        String sql ="Update GrayList SET bruger=?";
        template.update(sql, grayList.getBruger());
    }

    public void deleteById(int grayListId){
        String sql = " Delete from GrayList WHERE grayListId=?";
        template.update(sql, grayListId);
    }

}
