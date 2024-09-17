package main.java.com.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;


public class SessionManager {

    private ConcurrentHashMap<String, String> sessions = new ConcurrentHashMap<>();

    public String login(String userId) {
        if (sessions.containsKey(userId)) {
            return "User already logged in.";
        }
        sessions.put(userId, "SESSION_" + java.util.UUID.randomUUID().toString());
        return "Login successful. Session ID: " + sessions.get(userId);
    }

    public String logout(String userId) {
        if (!sessions.containsKey(userId)) {
            return "User not logged in.";
        }
        sessions.remove(userId);
        return "Logout successful.";
    }

    public String getSessionDetails(String userId) {
        if (!sessions.containsKey(userId)) {
            throw new RuntimeException("Session not found for user: " + userId);
        }
        return "Session for user: " + userId + " is " + sessions.get(userId);
    }
}
