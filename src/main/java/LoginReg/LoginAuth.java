package LoginReg;

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

@WebServlet (urlPatterns = {"/LoginAuth"})
public class LoginAuth extends HttpServlet {
    public static boolean isValid = false;

    public static void unauthorizedAccess(HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("Invalid Access<br/>");
        writer.println("<h4><a href=\"index.jsp\">Kembali ke Login</a></h4>");
        writer.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBUtils.connect();
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        //String passwordMD5 = Md5.getMd5(password);
        ResultSet resultSet = null;
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        try {
            resultSet = DBUtils.selectUser(email,password);
            if (resultSet.next()){
                isValid = true;
                resp.sendRedirect("Main.jsp");
//                writer.println("User " + email + " valid");
//                writer.println("<h4><a href=\"Main.jsp\">Silahkan ke Menu Utama</a></h4>");
            } else {
                isValid = false;
                resp.sendRedirect("index.jsp");
//                writer.println("Email/Password Invalid");
//                writer.println("<h4><a href=\"index.jsp\">Kembali ke Login</a></h4>");
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        writer.flush();
    }
}
