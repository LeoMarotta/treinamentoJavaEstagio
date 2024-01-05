package controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leomarotta
 */
@WebServlet(name = "HtmlDoc", urlPatterns = {"/htmldoc"})
public class HtmlDoc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String filePath = request.getParameter("filePath");
        String fileName = request.getParameter("fileName");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath + fileName))) {

            String colorLine = reader.readLine();
            String[] colors = colorLine.split(";");

            String backgroundColor = colors[0].trim().split(":")[1].trim();
            String textColor = colors[1].trim().split(":")[1].trim();

            String timeZone = reader.readLine().trim();
            TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String currentDateTime = dateFormat.format(new Date());

            String htmlResponse = String.format(
                "<html><head><style>body {background-color: %s; color: %s;}</style></head><body>" +
                "<h1>%s</h1><div>%s</div></body></html>",
                backgroundColor, textColor, currentDateTime, readRemainingLines(reader)
            );

            try (PrintWriter out = response.getWriter()) {
                out.println(htmlResponse);
            }
        } catch (IOException e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Arquivo não encontrado.");
        }
    }

    
    private String readRemainingLines(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("<br>");
        }
        return content.toString();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
