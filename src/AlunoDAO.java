// Kevin Shibuya Borges CB3005674

import java.sql.*;
import java.sql.PreparedStatement;

public class AlunoDAO { 
    private Connection connection;
    String name;
    Integer age;
    Double weight;
    Double height;
    String goal;

    public AlunoDAO(){ 
        this.connection = new JavaConnect().getConnection();
    } 
    public void insert(Aluno s){ 
        String sqlInsert = "INSERT INTO alunos(name,age,weight,height, goal) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement state= connection.prepareStatement(sqlInsert);
            state.setString(1, s.getName());
            state.setInt(2, s.getAge());
            state.setDouble(3, s.getWeight());
            state.setDouble(4, s.getHeight());
            state.setString(5, s.getGoal());
            state.execute();
            state.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}