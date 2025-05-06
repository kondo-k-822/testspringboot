package co.jp.TestSpringBoot.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomSessionTimeoutEntryPoint implements AuthenticationEntryPoint {

    private static final String TIMEOUT_URL = "/timeout";

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        // セッションタイムアウト時にリダイレクト
        response.sendRedirect(TIMEOUT_URL);
    }
}