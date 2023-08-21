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

@WebServlet(urlPatterns = {"/ShowTMM"})
public class ShowTMM extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (LoginAuth.isValid) {
            showAllRecord(resp);
        } else {
            LoginAuth.unauthorizedAccess(resp);
        }
    }

    public static void showAllRecord(HttpServletResponse resp) throws IOException{
        ResultSet resultSet = null;
        PrintWriter writer = resp.getWriter();
        try {
            resultSet = DBUtils.selectAll("data");
            writer.println("<html>");
            writer.println("<head>\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<style>\n" +
                    "body {\n" +
                    "  margin: 0;\n" +
                    "  font-family: Arial, Helvetica, sans-serif;\n" +
                    "}\n" +
                    "\n" +
                    ".topnav {\n" +
                    "  overflow: hidden;\n" +
                    "  background-color: #333;\n" +
                    "}\n" +
                    "\n" +
                    ".topnav a {\n" +
                    "  float: left;\n" +
                    "  color: #f2f2f2;\n" +
                    "  text-align: center;\n" +
                    "  padding: 14px 16px;\n" +
                    "  text-decoration: none;\n" +
                    "  font-size: 17px;\n" +
                    "}\n" +
                    "\n" +
                    ".topnav a:hover {\n" +
                    "  background-color: #ddd;\n" +
                    "  color: black;\n" +
                    "}\n" +
                    "\n" +
                    ".topnav a.active {\n" +
                    "  background-color: #fcba03;\n" +
                    "  color: white;\n" +
                    "}\n" +
                    "\n" +
                    "#TMM {\n" +
                    "  font-family: Arial, Helvetica, sans-serif;\n" +
                    "  border-collapse: collapse;\n" +
                    "  width: 100%;\n" +
                    "}\n" +
                    "\n" +
                    "#TMM td, #TMM th {\n" +
                    "  border: 1px solid #ddd;\n" +
                    "  padding: 8px;\n" +
                    "}\n" +
                    "\n" +
                    "#TMM tr:nth-child(even){background-color: #f2f2f2;}\n" +
                    "\n" +
                    "#TMM tr:hover {background-color: #ddd;}\n" +
                    "\n" +
                    "#TMM th {\n" +
                    "  padding-top: 12px;\n" +
                    "  padding-bottom: 12px;\n" +
                    "  text-align: left;\n" +
                    "  background-color: #fcba03;\n" +
                    "  color: white;\n" +
                    "}\n" +
                    ".buttonEdit {\n" +
                    "  background-color: white;\n" +
                    "  color: black;\n" +
                    "  border: 2px solid #fcba03;\n" +
                    "  border-radius: 4px;\n" +
                    "}\n" +
                    "\n" +
                    ".buttonEdit:hover {\n" +
                    "  background-color: #fcba03;\n" +
                    "  color: white;\n" +
                    "}\n" +
                    ".buttonDelete {\n" +
                    "  background-color: white;\n" +
                    "  color: black;\n" +
                    "  border: 2px solid red;\n" +
                    "  border-radius: 4px;\n" +
                    "}\n" +
                    "\n" +
                    ".buttonDelete:hover {\n" +
                    "  background-color: red;\n" +
                    "  color: white;\n" +
                    "}"+
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<div class=\"topnav\">\n" +
                    "  <a href=\"Main.jsp\">Home</a>\n" +
                    "  <a class=\"active\" href=\"ShowTMM\">Data</a>\n" +
                    "  <a href=\"InsertTMM\">Form</a>\n" +
                    "  <a href=\"Predict\">Predict</a>\n" +
                    "  <a href=\"About.jsp\">About</a>\n" +
                    "</div>\n" +
                    "\n" +
                    "<div style=\"padding-left:16px\">\n" +
                    "  <h2>Data Data TMM</h2>\n" +
                    "</div>\n" +
                    "\n" +
                    "</body>");
            writer.println("<table id=\"TMM\">");
            writer.println("<tr>\n" +
                    "   <th>Time</th>\n" +
                    "   <th>Set</th>\n" +
                    "   <th>Ture</th>\n" +
                    "   <th>Lamp</th>\n" +
                    "   <th>KF</th>\n" +
                    "   <th>FF</th>\n" +
                    "   <th>Fan</th>\n" +
                    "   <th>PC</th>\n" +
                    "   <th>TC</th>\n" +
                    "   <th>PF</th>\n" +
                    "   <th>PHF</th>\n" +
                    "   <th>AD</th>\n" +
                    "   <th>Smog</th>\n" +
                    "   <th>CE</th>\n" +
                    "   <th>TS1</th>\n" +
                    "   <th>TS2</th>\n" +
                    "   <th>TS3</th>\n" +
                    "   <th colspan=2>Action</th>\n" +
                    "</tr>");
            while (resultSet.next()){
                String time = resultSet.getString("time");
                int set1 = resultSet.getInt("set1");
                int ture = resultSet.getInt("ture");
                String lamp = resultSet.getString("lamp");
                float kf = resultSet.getFloat("kiln_Freq");
                float ff = resultSet.getFloat("feeding_Freq");
                int fan = resultSet.getInt("Fan");
                int pc = resultSet.getInt("Pump_Circulation");
                int tc = resultSet.getInt("Temp_Circulation");
                int pf = resultSet.getInt("Pump_Filterpress");
                int ph = resultSet.getInt("PH_Filterpress");
                int ad = resultSet.getInt("Air_Door");
                int smog = resultSet.getInt("Smog");
                int ce = resultSet.getInt("Cooling_Elevator");
                float ts1 = resultSet.getFloat("ts1");
                float ts2 = resultSet.getFloat("ts2");
                float ts3 = resultSet.getFloat("ts3");
                writer.println("<tr>");
                writer.println("<td>"+time+"</td>");
                writer.println("<td>"+set1+"</td>");
                writer.println("<td>"+ture+"</td>");
                writer.println("<td>"+lamp+"</td>");
                writer.println("<td>"+kf+"</td>");
                writer.println("<td>"+ff+"</td>");
                writer.println("<td>"+fan+"</td>");
                writer.println("<td>"+pc+"</td>");
                writer.println("<td>"+tc+"</td>");
                writer.println("<td>"+pf+"</td>");
                writer.println("<td>"+ph+"</td>");
                writer.println("<td>"+ad+"</td>");
                writer.println("<td>"+smog+"</td>");
                writer.println("<td>"+ce+"</td>");
                writer.println("<td>"+ts1+"</td>");
                writer.println("<td>"+ts2+"</td>");
                writer.println("<td>"+ts3+"</td>");
                writer.println("<td><a class=\"button buttonEdit\" href=EditTMM?time="+time+"&set1="+set1+"&ture="+ture+"&lamp="+lamp+"&Kiln_Freq="+kf+"&Feeding_Freq="+ff+"&Fan="+fan+
                        "&Pump_Circulation="+pc+"&Temp_Circulation="+tc+"&Pump_Filterpress="+pf+"&PH_Filterpress="+ph+"&Air_Door="+ad+"&Smog="+smog+"&Cooling_Elevator="+ce+
                        "&TS1="+ts1+"&TS2="+ts2+"+&TS3="+ts3+">Edit</a> </td>");
                writer.println("<td><a class=\"button buttonDelete\" href=DeleteTMM?time="+time+"&set1="+set1+"&ture="+ture+"&lamp="+lamp+"&Kiln_Freq="+kf+"&Feeding_Freq="+ff+"&Fan="+fan+
                        "&Pump_Circulation="+pc+"&Temp_Circulation="+tc+"&Pump_Filterpress="+pf+"&PH_Filterpress="+ph+"&Air_Door="+ad+"&Smog="+smog+"&Cooling_Elevator="+ce+
                        "&TS1="+ts1+"&TS2="+ts2+"+&TS3="+ts3+">Delete</a> </td>");
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
