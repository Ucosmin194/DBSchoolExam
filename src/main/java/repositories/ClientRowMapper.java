package repositories;

import entities.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientRowMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client(
                rs.getString("username"),
                rs.getString("last_name"),
                rs.getString("first_name"),
                rs.getString("phone"),
                rs.getString("address"),
                rs.getString("city"),
                rs.getString("postalCode"),
                rs.getString("country"));
        return client;
    }
}
