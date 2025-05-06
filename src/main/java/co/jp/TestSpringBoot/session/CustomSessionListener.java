package co.jp.TestSpringBoot.session;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // Optional: Logic when a session is created
        System.out.println("Session created: " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Object excludeFromDestruction = se.getSession().getAttribute("EXCLUDE_FROM_DESTRUCTION");
        if (excludeFromDestruction != null && (boolean) excludeFromDestruction) {
            System.out.println("Session destruction logic skipped for: " + se.getSession().getId());
            return;
        }
        // Logic to execute after session expiration
        System.out.println("Session destroyed: " + se.getSession().getId());
        // Example: Clean up resources or log session data
    }
}