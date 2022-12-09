package com.revature.dao;

import com.revature.model.Superhero;
import com.revature.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SuperHeroDaoImpl implements SuperHeroDao{

    Connection connection;

    public SuperHeroDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public Superhero save(Superhero superhero) {
        // Use prepared statement to prevent SQL injection
        String sql = "insert into superhero values(default, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, superhero.getSuperhero_name());
            preparedStatement.setString(2, superhero.getSuper_power());
            preparedStatement.setInt(3, superhero.getStrength());
            preparedStatement.setString(4, superhero.getWeakness());
            preparedStatement.setString(5, superhero.getFranchise());
            preparedStatement.setString(6, superhero.getWorld());

            // this will actually execute the statement
            int count = preparedStatement.executeUpdate();

            // if count is 1, that means success, we've updated the table:
            if(count == 1) {
                return superhero;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Exercise: Fill out 4 other CRUD methods (GetById, GetAll, Update, Delete)
    // Make some more fun queries like get by power, strength, etc.
    // Alter the save method so that it retrieves the id from the database and store it in the superhero object that you return (Recommend doing online research)
}