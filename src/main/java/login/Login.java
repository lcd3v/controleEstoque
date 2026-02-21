/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login") // caminho
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;  

    protected void doPost(HttpServletRequest request, HttpServletResponse response)// fazemos uma requisição e uma resposta no servidor local
            throws ServletException, IOException {
        String usuario = request.getParameter("user"); // aqui falo qual parametro( name ) que uso no html 
        String senha = request.getParameter("passw");//aqui falo qual parametro( name ) que uso no html
        
        response.setContentType("text/html");// eu estou setando de que forma ele vai me responder ( em texto html ) 
        PrintWriter out = response .getWriter(); // escreve no html, fazendo o get do que será escrito 
                
        if("admin".equals(usuario)&& "1234".equals(senha)){
            response.sendRedirect("dashBoard.html");// direciona para a pagina
            //out.println("<h2>Login realizado</h2>");
        }else{
            out.println("<h2>Usuario ou senha incorretos</h2>");
        }
        
    }
}
