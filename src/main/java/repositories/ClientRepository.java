package repositories;

import entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository // VIEW
public class ClientRepository {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Client> getAllCustomers() {
        String statement = "SELECT * FROM clients";
        return jdbcTemplate.query(statement, new ClientRowMapper());
    }


}
