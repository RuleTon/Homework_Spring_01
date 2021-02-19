import org.hibernate.annotations.common.util.impl.LoggerFactory;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");


        Product apple = new Product(1,"Apple",200);
        Product kiwi = new Product(2,"Kiwi",200);
        Product peach = new Product(3,"Peach",200);
        Product banana = new Product(4,"Banana",200);
        Product fig = new Product(5,"Fig",200);
        Product grapefruit = new Product(6,"Grapefruit",200);
        Product plum = new Product(7,"Plum",200);
        Product grapes = new Product(8,"Grapes",200);
        Product lime= new Product(9,"Lime",200);
        Product melon = new Product(10,"Melon",200);

        response.getWriter().println("<html><body><h1>" + apple + "</h1>");
        response.getWriter().println("<h1>" + kiwi + "</h1>");
        response.getWriter().printf("<h1>" + peach + "</h1>");
        response.getWriter().printf("<h1>" + banana + "</h1>");
        response.getWriter().printf("<h1>" + fig + "</h1>");
        response.getWriter().printf("<h1>" + grapefruit + "</h1>");
        response.getWriter().printf("<h1>" + plum + "</h1>");
        response.getWriter().printf("<h1>" + grapes + "</h1>");
        response.getWriter().printf("<h1>" + lime + "</h1>");
        response.getWriter().printf("<h1>" + melon + "</h1></body></html>");

    }
}