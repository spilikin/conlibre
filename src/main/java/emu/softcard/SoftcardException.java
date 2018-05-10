package emu.softcard;

public class SoftcardException extends Exception {
    public SoftcardException(String message) {
        super(message);
    }

    public SoftcardException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftcardException(Throwable cause) {
        super(cause);
    }
}
