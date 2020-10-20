package robot;

public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String msg) {
        super(msg);
    }

    public RobotConnectionException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
