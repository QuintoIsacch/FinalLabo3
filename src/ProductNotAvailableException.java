import java.io.IOException;

public class ProductNotAvailableException extends IOException {
    public ProductNotAvailableException() {
    }

    public ProductNotAvailableException(String message) {
        super(message);
    }

    public ProductNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotAvailableException(Throwable cause) {
        super(cause);
    }
}
