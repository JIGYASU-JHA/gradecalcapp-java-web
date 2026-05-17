import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GradeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int phy = Integer.parseInt(request.getParameter("phy"));
        int chem = Integer.parseInt(request.getParameter("chem"));
        int math = Integer.parseInt(request.getParameter("math"));

        int total = phy + chem +math;
        double avg = total/3;

        String status;
        if (avg > 40)
            status = "PASSED";
        else
            status = "FAILED";

        out.println("<html><body>");
        out.println("<h2>Student Result</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr>");
        out.println("<th>Total</th>");
        out.println("<th>Average</th>");
        out.println("<th>Status</th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>" + total + "</td>");
        out.println("<td>" + avg + "</td>");
        out.println("<td>" + status + "</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}
