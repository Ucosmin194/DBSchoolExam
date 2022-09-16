package repositories;

import entities.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository // VIEW
public class StoreRepository {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public StoreRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Store> getAllCustomers() {
        String statement = "SELECT * FROM clients";
        return jdbcTemplate.query(statement, new StoreRowMapper());
    }
}
