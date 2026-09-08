package demo;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class SafeServlet {
    public void render(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("Hello, ScanOps!");
    }
}
