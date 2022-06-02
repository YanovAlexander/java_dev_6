package got.java.dev6.module8.interfaces;

public enum UserType {
    DEFAULT_USER("default", "http"),
    ADMIN_USER("admin", "http"),
    GUEST_USER("guest", "http");

    private String name;
    private String url;

    UserType(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
