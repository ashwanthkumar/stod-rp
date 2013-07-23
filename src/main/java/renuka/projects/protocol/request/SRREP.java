package renuka.projects.protocol.request;

import renuka.projects.node.CRID;

public class SRREP extends Request {
    public static final int SRREP_REQUEST_TYPE = 10;
    private CRID sourceCrid;
    private CRID desinationCrid;
    private boolean isIntra;

    @Override
    public int requestType() {
        return SRREP_REQUEST_TYPE;
    }
}
