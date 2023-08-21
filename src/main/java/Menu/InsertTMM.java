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

@WebServlet (urlPatterns = {"/InsertTMM"})
public class InsertTMM extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (LoginAuth.isValid){
            PrintWriter writer = resp.getWriter();
//            writer.println("<html>");
//            writer.println("<body>");
//            writer.println("<pre>");
//            writer.println("<h2>Input Data Employee</h2>");
//            writer.println("<form action=\"InsertTMM\"method=\"post\">");
//            writer.println("Time :  <input type=\"text\"size=\"5\"name=\"time\"/><br/>");
//            writer.println("Set  :  <input type=\"text\"size=\"3\"name=\"set1\"/><br/>");
//            writer.println("Ture :  <input type=\"text\"size=\"3\"name=\"ture\"/><br/>");
//            writer.println("Lamp :  <input type=\"text\"size=\"1\"name=\"lamp\"/><br/>");
//            writer.println("Kiln Frequency  :   <input type=\"text\"size=\"10\"name=\"Kiln_Freq\"/><br/>");
//            writer.println("Feeding Frequency  :   <input type=\"text\"size=\"10\"name=\"Feeding_Freq\"/><br/>");
//            writer.println("Fan  :   <input type=\"text\"size=\"1\"name=\"Fan\"/><br/>");
//            writer.println("Pump Circulation  :   <input type=\"text\"size=\"1\"name=\"Pump_Circulation\"/><br/>");
//            writer.println("Temp Circulation  :   <input type=\"text\"size=\"2\"name=\"Temp_Circulation\"/><br/>");
//            writer.println("Pump Filterpress  :   <input type=\"text\"size=\"1\"name=\"Pump_Filterpress\"/><br/>");
//            writer.println("PH Filterpress  :   <input type=\"text\"size=\"1\"name=\"PH_Filterpress\"/><br/>");
//            writer.println("Air Door  :   <input type=\"text\"size=\"1\"name=\"Air_Door\"/><br/>");
//            writer.println("Smog  :   <input type=\"text\"size=\"1\"name=\"Smog\"/><br/>");
//            writer.println("Cooling_Elevator  :   <input type=\"text\"size=\"1\"name=\"Cooling_Elevator\"/><br/>");
//            writer.println("TS1  :   <input type=\"text\"size=\"10\"name=\"TS1\"/><br/>");
//            writer.println("TS2  :   <input type=\"text\"size=\"10\"name=\"TS2\"/><br/>");
//            writer.println("TS3  :   <input type=\"text\"size=\"10\"name=\"TS3\"/><br/>");
//            writer.println("<input type=\"submit\"value=\"Simpan\"/>");
//            writer.println("</form>");
//            writer.println("</pre>");
//            writer.println("</body>");
//            writer.println("</html>");
            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                    "<style>\n" +
                    "body {\n" +
                    "  font-family: Arial;\n" +
                    "  font-size: 17px;\n" +
                    "  padding: 8px;\n" +
                    "}\n" +
                    "\n" +
                    "* {\n" +
                    "  box-sizing: border-box;\n" +
                    "}\n" +
                    "\n" +
                    ".row {\n" +
                    "  display: -ms-flexbox;\n" +
                    "  display: flex;\n" +
                    "  -ms-flex-wrap: wrap;\n" +
                    "  flex-wrap: wrap;\n" +
                    "  margin: 0 -16px;\n" +
                    "}\n" +
                    "\n" +
                    ".col-25 {\n" +
                    "  -ms-flex: 25%;\n" +
                    "  flex: 25%;\n" +
                    "}\n" +
                    "\n" +
                    ".col-50 {\n" +
                    "  -ms-flex: 50%;\n" +
                    "  flex: 50%;\n" +
                    "}\n" +
                    "\n" +
                    ".col-75 {\n" +
                    "  -ms-flex: 75%;\n" +
                    "  flex: 75%;\n" +
                    "}\n" +
                    "\n" +
                    ".col-25,\n" +
                    ".col-50,\n" +
                    ".col-75 {\n" +
                    "  padding: 0 16px;\n" +
                    "}\n" +
                    "\n" +
                    ".container {\n" +
                    "  background-color: #f2f2f2;\n" +
                    "  padding: 5px 20px 15px 20px;\n" +
                    "  border: 1px solid lightgrey;\n" +
                    "  border-radius: 3px;\n" +
                    "}\n" +
                    "\n" +
                    "input[type=text] {\n" +
                    "  width: 100%;\n" +
                    "  margin-bottom: 20px;\n" +
                    "  padding: 12px;\n" +
                    "  border: 1px solid #ccc;\n" +
                    "  border-radius: 3px;\n" +
                    "}\n" +
                    "\n" +
                    "label {\n" +
                    "  margin-bottom: 10px;\n" +
                    "  display: block;\n" +
                    "}\n" +
                    "\n" +
                    ".btn {\n" +
                    "  background-color: #fcba03;\n" +
                    "  color: white;\n" +
                    "  padding: 12px;\n" +
                    "  margin: 10px 0;\n" +
                    "  border: none;\n" +
                    "  width: 100%;\n" +
                    "  border-radius: 3px;\n" +
                    "  cursor: pointer;\n" +
                    "  font-size: 17px;\n" +
                    "}\n" +
                    "\n" +
                    ".btn:hover {\n" +
                    "  background-color: #45a049;\n" +
                    "}\n" +
                    "\n" +
                    "a {\n" +
                    "  color: #2196F3;\n" +
                    "}\n" +
                    "\n" +
                    "hr {\n" +
                    "  border: 1px solid lightgrey;\n" +
                    "}\n" +
                    "\n" +
                    "span.price {\n" +
                    "  float: right;\n" +
                    "  color: grey;\n" +
                    "}\n" +
                    "\n" +
                    "@media (max-width: 800px) {\n" +
                    "  .row {\n" +
                    "    flex-direction: column-reverse;\n" +
                    "  }\n" +
                    "  .col-25 {\n" +
                    "    margin-bottom: 20px;\n" +
                    "  }\n" +
                    "}\n" +
                    "\n" +
                    "body \n" +
                    "{\n" +
                    "    margin: 0;\n" +
                    "    font-family: Arial, Helvetica, sans-serif;\n" +
                    "}\n" +
                    "    \n" +
                    ".topnav {\n" +
                    "    overflow: hidden;\n" +
                    "    background-color: #333;\n" +
                    "}\n" +
                    "    \n" +
                    ".topnav a {\n" +
                    "    float: left;\n" +
                    "    color: #f2f2f2;\n" +
                    "    text-align: center;\n" +
                    "    padding: 14px 16px;\n" +
                    "    text-decoration: none;\n" +
                    "    font-size: 17px;\n" +
                    "}\n" +
                    "    \n" +
                    ".topnav a:hover {\n" +
                    "    background-color: #ddd;\n" +
                    "    color: black;\n" +
                    "}\n" +
                    "    \n" +
                    ".topnav a.active {\n" +
                    "    background-color: #fcba03;\n" +
                    "    color: white;\n" +
                    "}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<div class=\"topnav\">\n" +
                    "    <a href=\"Main.jsp\">Home</a>\n" +
                    "    <a href=\"ShowTMM\">Data</a>\n" +
                    "    <a class=\"active\" href=\"InsertTMM\">Form</a>\n" +
                    "    <a href=\"Predict\">Predict</a>\n" +
                    "    <a href=\"About.jsp\">About</a>\n" +
                    "</div>\n" +
                    "\n" +
                    "<h2>Insert Data TMM</h2>\n" +
                    "<p>Silahkan Masukkan Data Sesuai.</p>\n" +
                    "<div class=\"row\">\n" +
                    "  <div class=\"col-75\">\n" +
                    "    <div class=\"container\">\n" +
                    "      <form action=\"InsertTMM\"method=\"post\">\n" +
                    "      \n" +
                    "        <div class=\"row\">\n" +
                    "          <div class=\"col-50\">\n" +
                    "            <br>\n" +
                    "            <label for=\"Time\"> Time </label>\n" +
                    "            <input type=\"text\" id=\"time\" name=\"time\" placeholder=\"11:10\">\n" +
                    "\n" +
                    "            <label for=\"Email\"> Set</label>\n" +
                    "            <input type=\"text\" id=\"set1\" name=\"set1\" placeholder=\"625\">\n" +
                    "\n" +
                    "            <label for=\"Ture\"> Ture</label>\n" +
                    "            <input type=\"text\" id=\"ture\" name=\"ture\" placeholder=\"506\">\n" +
                    "\n" +
                    "            <label for=\"Lamp\"> Lamp</label>\n" +
                    "            <input type=\"text\" id=\"lamp\" name=\"lamp\" placeholder=\"G\">\n" +
                    "\n" +
                    "            <label for=\"KF\"> Kiln Frequency</label>\n" +
                    "            <input type=\"text\" id=\"Kiln_Freq\" name=\"Kiln_Freq\" placeholder=\"12.6\">\n" +
                    "\n" +
                    "            <label for=\"FF\"> Feeding Frequency</label>\n" +
                    "            <input type=\"text\" id=\"Feeding_Freq\" name=\"Feeding_Freq\" placeholder=\"10.05\">\n" +
                    "\n" +
                    "            <label for=\"Fan\"> Fan</label>\n" +
                    "            <input type=\"text\" id=\"Fan\" name=\"Fan\" placeholder=\"1\">\n" +
                    "\n" +
                    "            <div class=\"row\">\n" +
                    "              <div class=\"col-50\">\n" +
                    "                <label for=\"PC\">Pump Circulation</label>\n" +
                    "                <input type=\"text\" id=\"Pump_Circulation\" name=\"Pump_Circulation\" placeholder=\"1\">\n" +
                    "              </div>\n" +
                    "              <div class=\"col-50\">\n" +
                    "                <label for=\"TC\">Temp Circulation</label>\n" +
                    "                <input type=\"text\" id=\"Temp_Circulation\" name=\"Temp_Circulation\" placeholder=\"47\">\n" +
                    "              </div>\n" +
                    "            </div>\n" +
                    "            \n" +
                    "          </div>\n" +
                    "\n" +
                    "          <div class=\"col-50\">\n" +
                    "            <br>\n" +
                    "            <label for=\"PF\">Pump Filterpress</label>\n" +
                    "            <input type=\"text\" id=\"Pump_Filterpress\" name=\"Pump_Filterpress\" placeholder=\"1\">\n" +
                    "\n" +
                    "            <label for=\"PH\">PH Filterpress</label>\n" +
                    "            <input type=\"text\" id=\"PH_Filterpress\" name=\"PH_Filterpress\" placeholder=\"7\">\n" +
                    "\n" +
                    "            <label for=\"AD\">Air Door</label>\n" +
                    "            <input type=\"text\" id=\"Air_Door\" name=\"Air_Door\" placeholder=\"1\">\n" +
                    "\n" +
                    "            <label for=\"S\">Smog</label>\n" +
                    "            <input type=\"text\" id=\"Smog\" name=\"Smog\" placeholder=\"1\">\n" +
                    "\n" +
                    "            <label for=\"CE\"> Cooling Elevator</label>\n" +
                    "            <input type=\"text\" id=\"Cooling_Elevator\" name=\"Cooling_Elevator\" placeholder=\"1\">\n" +
                    "\n" +
                    "            <label for=\"TS1\"> TS1</label>\n" +
                    "            <input type=\"text\" id=\"TS1\" name=\"TS1\" placeholder=\"300\">\n" +
                    "\n" +
                    "            <label for=\"TS2\"> TS2</label>\n" +
                    "            <input type=\"text\" id=\"TS2\" name=\"TS2\" placeholder=\"300\">\n" +
                    "\n" +
                    "            <label for=\"TS3\"> TS3</label>\n" +
                    "            <input type=\"text\" id=\"TS3\" name=\"TS3\" placeholder=\"300\">\n" +
                    "\n" +
                    "          </div>\n" +
                    "        </div>\n" +
                    "        <input type=\"submit\" value=\"Simpan\" class=\"btn\">\n" +
                    "      </form>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "</div>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n");
            writer.flush();
        } else {
            LoginAuth.unauthorizedAccess(resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sTime = req.getParameter("time");
        String stringSet = req.getParameter("set1");
        int Set = Integer.parseInt(stringSet);
        String sTure = req.getParameter("ture");
        int Ture = Integer.parseInt(sTure);
        String sLamp = req.getParameter("lamp");
        String stringKF = req.getParameter("Kiln_Freq");
        float KF = Float.parseFloat(stringKF);
        String stringFF = req.getParameter("Feeding_Freq");
        float FF =  Float.parseFloat(stringFF);
        String stringFan = req.getParameter("Fan");
        int Fan = Integer.parseInt(stringFan);
        String stringPC = req.getParameter("Pump_Circulation");
        int PC = Integer.parseInt(stringPC);
        String stringTC = req.getParameter("Temp_Circulation");
        int TC = Integer.parseInt(stringTC);
        String stringPF = req.getParameter("Pump_Filterpress");
        int PF = Integer.parseInt(stringPF);
        String stringPH = req.getParameter("PH_Filterpress");
        int PH = Integer.parseInt(stringPH);
        String stringAD = req.getParameter("Air_Door");
        int AD = Integer.parseInt(stringAD);
        String stringS = req.getParameter("Smog");
        int S = Integer.parseInt(stringS);
        String stringCE = req.getParameter("Cooling_Elevator");
        int CE = Integer.parseInt(stringCE);
        String stringTS1 = req.getParameter("TS1");
        float TS1 =  Float.parseFloat(stringTS1);
        String stringTS2 = req.getParameter("TS2");
        float TS2 =  Float.parseFloat(stringTS2);
        String stringTS3 = req.getParameter("TS3");
        float TS3 =  Float.parseFloat(stringTS3);
        PrintWriter writer = resp.getWriter();
        if (DBUtils.insert("data", sTime,Set,Ture,sLamp,KF,FF,Fan,PC,TC,PF,PH,AD,S,CE,TS1,TS2,TS3)){
            resp.sendRedirect("InsertTMM");
        } else {
            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
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
                    ".button {\n" +
                    "  background-color: #fcba03;\n" +
                    "  border: none;\n" +
                    "  color: white;\n" +
                    "  padding: 15px 32px;\n" +
                    "  text-align: center;\n" +
                    "  text-decoration: none;\n" +
                    "  display: inline-block;\n" +
                    "  font-size: 16px;\n" +
                    "  margin: 4px 2px;\n" +
                    "  cursor: pointer;\n" +
                    "}\n" +
                    ".confirmation\n" +
                    "{\n" +
                    "    padding: 16px;\n" +
                    "    text-align: center;\n" +
                    "    border-radius: 4px;\n" +
                    "}\n" +
                    "\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<div class=\"topnav\">\n" +
                    "  <a class=\"active\" href=\"Main.jsp\">Home</a>\n" +
                    "  <a href=\"ShowTMM\">Data</a>\n" +
                    "  <a href=\"InsertTMM\">Form</a>\n" +
                    "  <a href=\"About.jsp\">About</a>\n" +
                    "</div>\n" +
                    "\n" +
                    "<div class=\"confirmation\">\n" +
                    "    <h2>Data "+sTime+"Tidak Berhasil di Masukkan</h2>\n" +
                    "    <p>Silahkan Balik Ke Form</p>\n" +
                    "    <a href=\"InsertTMM\" class=\"button\">Kembali Ke Tabel</a>\n" +
                    "  </div>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
        }
        writer.flush();
    }
}
