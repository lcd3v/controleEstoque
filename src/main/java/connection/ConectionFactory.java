/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author 232.005495
 */
public class ConectionFactory {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; //driver de conexão com o banco
    private static final String URL
            = "jdbc:mysql://localhost:3306/estoque_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"; // url de conexão com o banco
    private static final String USER = "root"; // usuário do banco
    private static final String PASSWORD = "leonardod3v"; // senha do banco

    //método pra fazer a conexão com o banco
    public static Connection getConnection() {
        Connection con = null; // variável de conexão   

        try {
            Class.forName(DRIVER); // carrega o driver na memória
            con = DriverManager.getConnection(URL, USER, PASSWORD); // cria a conexão com o banco usando os parametros url, user e password
            System.out.println("Banco de dados conectado."); // mensagem de sucesso no console
        } catch (Exception e) {
            System.out.println("Banco de dados não conectado"); // mensagem caso ocorra erro
            e.printStackTrace(); // mostra os detalhes do erro no console
        }
        return con; // retorna a conexão ou null se falhar 
    }
}

