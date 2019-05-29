/*
Lavet af Leopold.
 */

package repository;

import model.Bruger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
public class BrugerRepo{
    @Autowired
    JdbcTemplate template;

    public List<Bruger> fetchAllBruger(){
        String sql =" SELECT * FROM bruger";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        return template.query(sql, rowMapper);
    }
    public void readById(int brugerId){
        String sql = "SELECT * FROM bruger WHERE brugerId=?";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
         template.queryForObject(sql, rowMapper, brugerId);
    }
    public void createBruger(Bruger bruger){
        String sql = "insert into Bruger (navn, cpr, sms, email, niveau, rykker) values(?, ?, ?, ?, ?, ? )";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        template.update(sql, rowMapper, bruger.getNavn(), bruger.getCpr(),bruger.getEmail(), bruger.getNiveau(), bruger.getRykker() );
    }
    public void updateBruger(Bruger bruger){
        String sql ="Update bruger SET navn=?, cpr=?, sms=?, email=?, niveau=?, rykker=? WHERE brugerID=? ";
        template.update(sql, bruger.getId(), bruger.getNavn(), bruger.getCpr(),bruger.getEmail(), bruger.getNiveau(), bruger.getRykker());
    }
    public void deleteById(int brugerId){
        String sql = " Delete from bruger WHERE id=?";
        template.update(sql, brugerId);
    }
}

