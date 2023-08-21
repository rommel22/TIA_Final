package Menu;

import LoginReg.LoginAuth;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.DBUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/ShowUsers"})
public class ShowUSers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (LoginAuth.isValid) {
            showAllJobEmp(resp);
        } else {
            LoginAuth.unauthorizedAccess(resp);
        }
    }

    public static void showAllJobEmp(HttpServletResponse resp) throws IOException{
        ResultSet resultSet = null;
        PrintWriter writer = resp.getWriter();
        try {
            resultSet = DBUtils.selectAll("users");
            writer.println("<html>");
            writer.println("<h2>Data Users : </h2>");
            writer.println("<table border = 1>");
            writer.println("<tr>\n" +
                    "   <th>Email</th>\n" +
                    "   <th>Username</th>\n" +
                    "   <th>Password</th>\n" +
                    "</tr>");
            while (resultSet.next()){
                String Email = resultSet.getString("email");
                String Username = resultSet.getString("username");
                String Password = resultSet.getString("password");
                writer.println("<tr>");
                writer.println("<td>"+Email+"</td>");
                writer.println("<td>"+Username+"</td>");
                writer.println("<td>"+Password+"</td>");
            }
            writer.println("</tr>");
            writer.println("</table>");
            writer.println("<br>");
            writer.println("<a href=\"Main.jsp\">Kembali ke Menu Utama</a>");
            writer.println("</html>");
            writer.flush();
        } catch (SQLException e){
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
