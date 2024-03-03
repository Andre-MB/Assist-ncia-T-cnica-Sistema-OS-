package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    
    //método responsavel por estabelecer a conexão com o banco
    public static Connection conector(){
        
        // variavel especial
        java.sql.Connection conexao = null;
        
        // a linha abaixo chama o drive
        String driver = "com.mysql.cj.jdbc.Driver";
        
        // Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3307/dbinfox";
        String user = "root";
        String password = "";
        
        // Estabelecendo a conecxao com o banco
        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
