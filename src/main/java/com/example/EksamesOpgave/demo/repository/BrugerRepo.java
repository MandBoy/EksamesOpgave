/*
Lavet af Leopold.
 */

package com.example.EksamesOpgave.demo.repository;

import com.example.EksamesOpgave.demo.model.Bruger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Repository class that handle our SQL querries
 */

@Repository
public class BrugerRepo{
    @Autowired
    JdbcTemplate template;

    public List<Bruger> fetchAllBruger(){
        String sql =" SELECT * FROM bruger";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        return template.query(sql, rowMapper);
    }

    public Bruger readById(int brugerId){
        String sql = "SELECT * FROM bruger WHERE brugerId=?";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        return template.queryForObject(sql, rowMapper, brugerId);
    }

    public void createBruger(Bruger bruger){
        String sql = "insert into Bruger (navn, cpr, sms, email, niveau, ) values(?, ?, ?, ?, ?, ? )";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        template.update(sql, rowMapper, bruger.getNavn(), bruger.getCpr(),bruger.getEmail(), bruger.getNiveau());
    }

    public void updateBruger(Bruger bruger){
        String sql ="Update bruger SET navn=?, cpr=?, sms=?, email=?, niveau=? WHERE brugerId=? ";
        template.update(sql, bruger.getId(), bruger.getNavn(), bruger.getCpr(),bruger.getEmail(), bruger.getNiveau());
    }

    public void deleteById(int brugerId){
        String sql = " Delete from bruger WHERE brugerId=?";
        template.update(sql, brugerId);
    }
}

