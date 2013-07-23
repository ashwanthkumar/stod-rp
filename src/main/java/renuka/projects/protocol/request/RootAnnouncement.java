package renuka.projects.protocol.request;

import com.google.common.collect.Lists;
import renuka.projects.node.CRID;

import java.util.List;

public class RootAnnouncement extends Request {
    public static final int ROOT_ANNOUNCEMENT_REQUEST_TYPE = 1;
    /**
     * CRID of the Root node in this spectrum
     */
    private CRID rootCrid;
    /**
     * List of nodes that have seen this Root Announcement so far
     */
    private List<CRID> nodeCrids = Lists.newArrayList();
    /**
     * Initial CRID assigned by the ROOT to its immediate nodes
     * (this will be reset by the nodes when they fwd the Root Announcement)
     */
    private CRID nodeCrid;

    public RootAnnouncement addMyCRID(CRID myCrid) {
        nodeCrids.add(myCrid);
        return this;
    }

    @Override
    public int requestType() {
        return ROOT_ANNOUNCEMENT_REQUEST_TYPE;
    }
}
