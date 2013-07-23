package renuka.projects.protocol.request;

/**
 * Common class from where all requests extend
 * <p/>
 * TODO: May be we should extend from Message?
 */
public abstract class Request {
    abstract public int requestType();
}
