package co.jp.TestSpringBoot.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;

@Component
public class ExcludeSessionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, jakarta.servlet.ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(false);

        if (session != null) {
            String requestURI = httpRequest.getRequestURI();
            if ("/login".equals(requestURI) || "/timeout".equals(requestURI)) {
                session.setAttribute("EXCLUDE_FROM_DESTRUCTION", true);
            }
        }

        chain.doFilter(request, response);
    }
}