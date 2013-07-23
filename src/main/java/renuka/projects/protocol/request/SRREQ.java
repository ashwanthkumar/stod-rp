package renuka.projects.protocol.request;

import renuka.projects.node.CRID;

public class SRREQ extends Request {
    public static final int SRREQ_REQUEST_TYPE = 11;
    private CRID sourceCrid;
    private CRID desinationCrid;
    private double metric;
    private boolean isIntra;

    @Override
    public int requestType() {
        return SRREQ_REQUEST_TYPE;
    }
}
