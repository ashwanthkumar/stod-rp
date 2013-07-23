package renuka.projects.protocol.request;

public class Dismiss extends Request {
    public static final int DISMISS_ANNOUNCEMENT_REQUEST_TYPE = 2;

    @Override
    public int requestType() {
        return DISMISS_ANNOUNCEMENT_REQUEST_TYPE;
    }
}
