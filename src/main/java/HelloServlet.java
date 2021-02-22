
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


    private final static String index = "index.jsp";

    private List<Product> products;


    @Override
    public void init(){

        products = new ArrayList<>();
        products.add(new Product(1L,"Egg",40));
        products.add(new Product(2L,"Milk",70));
        products.add(new Product(3L,"Apple",50));
        products.add(new Product(4L,"Potato",100));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("Products",products);
        req.getRequestDispatcher(index).forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF8");

        if(!requestIsValid(req)) {doGet(req,resp);}

        final String id = req.getParameter("ID");
        final String name = req.getParameter("Name");
        final String cost = req.getParameter("Cost");

        final Product product = new Product(Long.valueOf(id),name,Integer.valueOf(cost));

        products.add(product);

        doGet(req,resp);
    }

    private boolean requestIsValid(final HttpServletRequest req) {
        final String id = req.getParameter("ID");
        final String name = req.getParameter("Name");
        final String cost = req.getParameter("Cost");

        return id != null && id.length() > 0 && name !=null && name.length() > 0 && cost != null && cost.length() > 0;

    }
}