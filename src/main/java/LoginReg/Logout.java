package LoginReg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginAuth.isValid = false;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("Logout Berhasil<br/>");
        writer.println("<h4><a href=\"index.jsp\">Kembali ke Login</a></h4>");
        writer.println("</html>");
    }
}
