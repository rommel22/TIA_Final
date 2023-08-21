package Menu;

import LoginReg.LoginAuth;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Main"})
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (LoginAuth.isValid){
            PrintWriter writer = resp.getWriter();
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Menu Utama</h2>");
            writer.println("<h4><a href=\"ShowTMM\">1. Show All TMM</a></h4>");
            writer.println("<h4><a href=\"InsertTMM\">2. Insert TMM</a></h4>");
            writer.println("<h4><a href=\"ShowUsers\">3. Show All Users</a></h4>");
            writer.println("<h4><a href=\"Predict\">4. Prediction</a></h4>");
            writer.println("<a href=\"Logout\">Logout</a>");
            writer.println("</body>");
            writer.println("</html>");
            writer.flush();
        } else {
            LoginAuth.unauthorizedAccess(resp);
        }
    }
}
