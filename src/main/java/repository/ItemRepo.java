/*
Lavet af Leopold.
 */

package repository;

import model.Item;
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
public class ItemRepo {

    @Autowired
    JdbcTemplate template;

    public List<Item> fetchAllItems(){
        String sql =" SELECT * FROM Item";
        RowMapper<Item> rowMapper = new BeanPropertyRowMapper<>(Item.class);
        return template.query(sql, rowMapper);
    }

    public void readById(int itemId){
        String sql = "SELECT * FROM bruger WHERE itemId=?";
        RowMapper<Item> rowMapper = new BeanPropertyRowMapper<>(Item.class);
        template.queryForObject(sql, rowMapper, itemId);
    }

    public void createItem(Item item){
        String sql = "insert into Bruger (navn, pris, opløsning, vægt, udgivelse, model) values(?, ?, ?, ?, ?, ? )";
        RowMapper<Item> rowMapper = new BeanPropertyRowMapper<>(Item.class);
        template.update(sql, item.getNavn(), item.getPris(),item.getOpløsning(), item.getVægt(), item.getUdgivelse(), item.getModel() );
    }

    public void updateItem(Item item){
        String sql ="Update Item SET navn=?, pris=?, opløsning=?, vægt=?, udgivelse=?, model=? WHERE itemId=? ";
        template.update(sql, item.getNavn(), item.getPris(),item.getOpløsning(), item.getVægt(), item.getUdgivelse(), item.getModel());
    }

    public void deleteById(int itemId){
        String sql = " Delete from Item WHERE id=?";
        template.update(sql, itemId);
    }
}

