
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrutasServlet", urlPatterns = {"/frutas.html"})
public class FrutasServlet extends HttpServlet {

    private List<String> frutas = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.frutas.add("Goiaba");
        this.frutas.add("Jabuticaba");
        this.frutas.add("Manga");
        this.frutas.add("Abacaxi");
        this.frutas.add("Maçã");
        this.frutas.add("Uva");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Frutas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Forma como foi inserida</p>");

            for (int i = 0; i < frutas.size(); i++) {
                out.println(frutas.get(i));

            }
            out.println("<br/>");
            out.println("<br/>");
            out.println("<p>Ordenação por tamanho da String</p>");

            frutas.sort(Comparator.comparing(String::length));

            for (int i = 0; i < frutas.size(); i++) {
                out.println(frutas.get(i));

            }
            out.println("<br/>");
            out.println("<br/>");

            out.println("<p>Ordenação Alfabética</p>");

            Collections.sort(frutas, String.CASE_INSENSITIVE_ORDER);

            for (int i = 0; i < frutas.size(); i++) {
                out.println(this.frutas.get(i));

            }
            out.println("<br/>");
            out.println("<br/>");

            out.println("<p>Ordenação Aleatoria</p>");

            Collections.shuffle(frutas);

            for (int i = 0; i < frutas.size(); i++) {
                out.println(this.frutas.get(i));

            }

            out.println("</body>");
            out.println("</html>");
        }

    }

}
