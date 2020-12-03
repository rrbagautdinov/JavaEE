package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet implements Servlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest,
                        ServletResponse servletResponse) throws IOException {
        logger.info("New Request");

        StringBuilder sb = new StringBuilder("<html><body>");
        for (int i = 0; i < 10; i++) {
            Product product = new Product(i + 1, "potato", 30 + i + 1);
            sb.append("<span>" + "id: ")
                    .append(product.getId())
                    .append(" title: ")
                    .append(product.getTitle() + (i + 1))
                    .append(" cost: ")
                    .append(product.getCost())
                    .append("</span><br>");
        }
        servletResponse.getWriter().printf(sb.toString());


    }

    @Override
    public String getServletInfo() {
        return "BasicServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}
