package dev.spilikin.conlibre;

public enum KonnektorError {
    E4000(4000, Type.Technical, Severity.Error, "Syntaxfehler"),
    E4085(4085, Type.Security, Severity.Error, "Zugriffsbedingungen nicht erfüllt");

    public enum Type {
        Technical, Security
    }

    public enum Severity {
        Fatal, Error, Warning, Info
    }

    private int code;
    private Type type;
    private Severity severity;
    private String text;

    KonnektorError(int code, Type type, Severity severity, String text) {
        this.code = code;
        this.type = type;
        this.severity = severity;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public Type getType() {
        return type;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getText() {
        return text;
    }
}
