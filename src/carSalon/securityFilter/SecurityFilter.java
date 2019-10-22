package carSalon.securityFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/authenticationFilter")
public class SecurityFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();

        HttpSession session = req.getSession();

        if ((session.getAttribute("userSecurityLevel") == null || (int) session.getAttribute("userSecurityLevel") < 0) && (uri.endsWith("inside") || uri.endsWith("carupload") || uri.endsWith("listcar") || uri.endsWith("modifylist"))) {
            System.out.println("Filter works juhéé!");
            res.sendRedirect("login");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
