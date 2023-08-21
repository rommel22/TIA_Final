package LoginReg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.DBUtils;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBUtils.connect();
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        writer.println("<style>");
        writer.println("body {\n" +
                "  font-family: Arial, Helvetica, sans-serif;\n" +
                "  background-color: rgb(255, 255, 255);\n" +
                "  display: flex;\n" +
                "  justify-content: center;\n" +
                "  align-items: center;\n" +
                "  min-height: 100vh;\n" +
                "  background: #ffffff;\n" +
                "}");
        writer.println("* {\n" +
                "  box-sizing: border-box;\n" +
                "}");
        writer.println(".container {\n" +
                "  padding: 16px;\n" +
                "  background-color: white;\n" +
                "}");
        writer.println("input[type=text], input[type=password] {\n" +
                "  width: 100%;\n" +
                "  padding: 15px;\n" +
                "  margin: 5px 0 22px 0;\n" +
                "  display: inline-block;\n" +
                "  border: none;\n" +
                "  background: #f1f1f1;\n" +
                "}");
        writer.println("input[type=text]:focus, input[type=password]:focus {\n" +
                "  background-color: #ddd;\n" +
                "  outline: none;\n" +
                "}");
        writer.println("hr {\n" +
                "  border: 1px solid #f1f1f1;\n" +
                "  margin-bottom: 25px;\n" +
                "}");
        writer.println(".registerbtn {\n" +
                "  background-color: #04AA6D;\n" +
                "  color: white;\n" +
                "  padding: 16px 20px;\n" +
                "  margin: 8px 0;\n" +
                "  border: none;\n" +
                "  cursor: pointer;\n" +
                "  width: 100%;\n" +
                "  opacity: 0.9;\n" +
                "}");
        writer.println(".registerbtn:hover {\n" +
                "  opacity: 1;\n" +
                "}");
        writer.println("a {\n" +
                "  color: dodgerblue;\n" +
                "}");
        writer.println(".signin {\n" +
                "  background-color: #f1f1f1;\n" +
                "  text-align: center;\n" +
                "}");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<form action=\"Register\"method=\"post\">");
        writer.println("<div class=\"container\">");
        writer.println("<h1>Register</h1>");
        writer.println("<p>Please fill in this form to create an account.</p>");
        writer.println("<hr>");
        writer.println("<label for=\"email\"><b>Email</b></label>");
        writer.println("<input type=\"text\" placeholder=\"Enter Email\" name=\"email\" id=\"email\" required>");
        writer.println("<label for=\"Username\"><b>Username</b></label>");
        writer.println("<input type=\"text\" placeholder=\"Enter Username\" name=\"username\" id=\"username\" required>");
        writer.println("<label for=\"psw\"><b>Password</b></label>");
        writer.println("<input type=\"password\" placeholder=\"Enter Password\" name=\"password\" id=\"psw\" required>");
        writer.println("<hr>");
        writer.println("<p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
        writer.println(" <button type=\"submit\" class=\"registerbtn\"value=\"Save\"/>Register</button>");
        writer.println("</div>");
        writer.println("<div class=\"container signin\">");
        writer.println("<p>Already have an account? <a href=\"index.jsp\">Sign in</a>.</p>");
        writer.println("</div>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if (DBUtils.insertUsers(email,username,password)){
            resp.sendRedirect("index.jsp");
        } else {
            writer.println("<html><body>");
            writer.println("Insert " + email + " gagal!<br/>");
            writer.println("<h4><a href=\"index.jsp\">Lanjut Login</a></h4>");
            writer.println("</html></body>");
        }
        writer.flush();
    }
}
