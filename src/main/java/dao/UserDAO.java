package dao;

import model.UserModel;

public class UserDAO {

    public boolean validarLogin(UserModel userModel) {
        String sql = "SELECT * FROM users WHERE username= ? AND psw= ?";
    }
}
try (var con = Conection.getConnection()){
           
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2,senha);
            
            ResultSet rs = stmt.executeQuery(); 
            if(rs.next()){
                response.sendRedirect("Pages/dashBoard.html");
                        
            }else{
                out.println("<h2>Usuario ou senha invalidos</h2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Erro ao conectar com o banco de dados</h2>");
        }
        
    }
}
