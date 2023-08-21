package Menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Predict"})
public class Predict extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
//        writer.println("<html>");
//        writer.println("<body>");
//        writer.println("<h2>Prediksi Suhu</h2>");
//        writer.println("<pre>\n" +
//                "\n" +
//                "<form action=\"Predict\" method=\"post\">\n" +
//                "Ture               :    <input type=\"text\" size=\"5\" name=\"Set\"/>\n" +
//                "\n" +
//                "Set                :    <input type=\"text\" size=\"5\" name=\"Ture\"/>\n" +
//                "\n" +
//                "Kiln Frequency     :    <input type=\"text\" size=\"5\" name=\"Kiln\"/>\n" +
//                "\n" +
//                "Feeding Frequency  :    <input type=\"text\" size=\"5\" name=\"Feeding\"/>\n" +
//                "\n" +
//                "<input type=\"submit\" value=\"Predict Suhu\"/>\n" +
//                "</form>\n" +
//                "</pre>\n");
//        writer.println("</body>");
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
                "  background-color:#fcba03;\n" +
                "  color: white;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  font-family: Arial, Helvetica, sans-serif;\n" +
                "  background-color: white;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "/* Add padding to containers */\n" +
                ".container {\n" +
                "  padding: 16px;\n" +
                "  background-color: white;\n" +
                "}\n" +
                "\n" +
                "/* Full-width input fields */\n" +
                "input[type=text], input[type=password] {\n" +
                "  width: 100%;\n" +
                "  padding: 15px;\n" +
                "  margin: 5px 0 22px 0;\n" +
                "  display: inline-block;\n" +
                "  border: none;\n" +
                "  background: #f1f1f1;\n" +
                "}\n" +
                "\n" +
                "input[type=text]:focus, input[type=password]:focus {\n" +
                "  background-color: #ddd;\n" +
                "  outline: none;\n" +
                "}\n" +
                "\n" +
                "/* Overwrite default styles of hr */\n" +
                "hr {\n" +
                "  border: 1px solid #f1f1f1;\n" +
                "  margin-bottom: 25px;\n" +
                "}\n" +
                "\n" +
                "/* Set a style for the submit button */\n" +
                ".submitbtn {\n" +
                "  background-color:#fcba03;\n" +
                "  color: white;\n" +
                "  padding: 16px 20px;\n" +
                "  margin: 8px 0;\n" +
                "  border: none;\n" +
                "  cursor: pointer;\n" +
                "  width: 100%;\n" +
                "  opacity: 0.9;\n" +
                "}\n" +
                "\n" +
                ".submitbtn:hover {\n" +
                "  opacity: 1;\n" +
                "}\n" +
                "\n" +
                "/* Add a blue text color to links */\n" +
                "a {\n" +
                "  color: dodgerblue;\n" +
                "}\n" +
                "\n" +
                "/* Set a grey background color and center the text of the \"sign in\" section */\n" +
                ".signin {\n" +
                "  background-color: #f1f1f1;\n" +
                "  text-align: center;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form action=\"Predict\" method=\"post\">\n" +
                "    <div class=\"topnav\">\n" +
                "        <a href=\"Main.jsp\">Home</a>\n" +
                "        <a href=\"ShowTMM\">Data</a>\n" +
                "        <a href=\"InsertTMM\">Form</a>\n" +
                "        <a class=\"active\" href=\"Predict\">Predict</a>\n" +
                "        <a href=\"About.jsp\">About</a>\n" +
                "      </div>\n" +
                "    <div class=\"container\">\n" +
                "    <h1>Predict</h1>\n" +
                "    <p>Using Machine Learning To Predict The Temperature Output</p>\n" +
                "    <hr>\n" +
                "\n" +
                "    <label for=\"email\"><b>Set</b></label>\n" +
                "    <input type=\"text\" placeholder=\"506\" name=\"Set\" id=\"Set\" required>\n" +
                "\n" +
                "    <label for=\"psw\"><b>Ture</b></label>\n" +
                "    <input type=\"text\" placeholder=\"625\" name=\"Ture\" id=\"Ture\" required>\n" +
                "\n" +
                "    <label for=\"psw-repeat\"><b>Kiln Frequency</b></label>\n" +
                "    <input type=\"text\" placeholder=\"12.5\" name=\"Kiln\" id=\"Kiln\" required>\n" +
                "\n" +
                "    <label for=\"psw-repeat\"><b>Feeding Frequency</b></label>\n" +
                "    <input type=\"text\" placeholder=\"10.10\" name=\"Feeding\" id=\"Feeding\" required>\n" +
                "    <hr>\n" +
                "\n" +
                "    <button type=\"submit\" class=\"submitbtn\">Predict</button>\n" +
                "  </div>\n" +
                "\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String stringSet = req.getParameter("Set");
        int Set = Integer.parseInt(stringSet);
        String stringTure = req.getParameter("Ture");
        int Ture = Integer.parseInt(stringTure);
        String stringKiln = req.getParameter("Kiln");
        float Kiln = Float.parseFloat(stringKiln);
        String stringFeeding = req.getParameter("Feeding");
        float Feeding = Float.parseFloat(stringFeeding);
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
                "  background-color:#fcba03;\n" +
                "  color: white;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  font-family: Arial, Helvetica, sans-serif;\n" +
                "  background-color: white;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "/* Add padding to containers */\n" +
                ".container {\n" +
                "  padding: 16px;\n" +
                "  background-color: white;\n" +
                "}\n" +
                "\n" +
                "/* Full-width input fields */\n" +
                "input[type=text], input[type=password] {\n" +
                "  width: 100%;\n" +
                "  padding: 15px;\n" +
                "  margin: 5px 0 22px 0;\n" +
                "  display: inline-block;\n" +
                "  border: none;\n" +
                "  background: #f1f1f1;\n" +
                "}\n" +
                "\n" +
                "input[type=text]:focus, input[type=password]:focus {\n" +
                "  background-color: #ddd;\n" +
                "  outline: none;\n" +
                "}\n" +
                "\n" +
                "/* Overwrite default styles of hr */\n" +
                "hr {\n" +
                "  border: 1px solid #f1f1f1;\n" +
                "  margin-bottom: 25px;\n" +
                "}\n" +
                "\n" +
                "/* Set a style for the submit button */\n" +
                ".submitbtn {\n" +
                "  background-color:#fcba03;\n" +
                "  color: white;\n" +
                "  padding: 16px 20px;\n" +
                "  margin: 8px 0;\n" +
                "  border: none;\n" +
                "  cursor: pointer;\n" +
                "  width: 100%;\n" +
                "  opacity: 0.9;\n" +
                "}\n" +
                "\n" +
                ".submitbtn:hover {\n" +
                "  opacity: 1;\n" +
                "}\n" +
                "\n" +
                "/* Add a blue text color to links */\n" +
                "a {\n" +
                "  color: dodgerblue;\n" +
                "}\n" +
                "\n" +
                "/* Set a grey background color and center the text of the \"sign in\" section */\n" +
                ".signin {\n" +
                "  background-color: #f1f1f1;\n" +
                "  text-align: center;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form action=\"Predict\" method=\"get\">\n" +
                "    <div class=\"topnav\">\n" +
                "        <a href=\"Main.jsp\">Home</a>\n" +
                "        <a href=\"ShowTMM\">Data</a>\n" +
                "        <a href=\"InsertTMM\">Form</a>\n" +
                "        <a class=\"active\" href=\"Predict\">Predict</a>\n" +
                "        <a href=\"About.jsp\">About</a>\n" +
                "      </div>\n" +
                "    <div class=\"container\">\n" +
                "    <h1>Prediction Result</h1>\n" +
                "    <p>The Result Of The Prediction (Temperature)</p>\n" +
                "    <hr>\n" +
                "\n" +
                "    <label for=\"set\"><b>Set</b></label>\n" +
                "    <input type=\"text\" name=\"Set\" id=\"Set\" value="+Set+" readonly>\n" +
                "\n" +
                "    <label for=\"ture\"><b>Ture</b></label>\n" +
                "    <input type=\"text\" name=\"Ture\" id=\"Ture\" value="+Ture+" readonly>\n" +
                "\n" +
                "    <label for=\"kf\"><b>Kiln Frequency</b></label>\n" +
                "    <input type=\"text\" name=\"Kiln\" id=\"Kiln\" value="+Kiln+" readonly>\n" +
                "\n" +
                "    <label for=\"ff\"><b>Feeding Frequency</b></label>\n" +
                "    <input type=\"text\" name=\"Feeding\" id=\"Feeding\" value="+Feeding+" readonly>\n" +
                "\n" +
                "    <label for=\"Result\"><b>Result</b></label>");
        ProcessBuilder processBuilder = new ProcessBuilder(
                "python",
                "D:\\ngoding\\TIA\\Final\\target/ii.py",
                "D:\\ngoding\\TIA\\Final\\target/Data_TMM1.csv",
                stringSet,stringTure,stringKiln,stringFeeding);

        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.println("<p>"+line+"</p>");
            System.out.println(line);
        }
        writer.println("    <hr>\n" +
                "\n" +
                "  </div>\n" +
                "\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        writer.flush();
    }
}

