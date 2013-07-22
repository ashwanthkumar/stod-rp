package renuka.projects.protocol.request;

import com.google.common.collect.Lists;
import renuka.projects.node.CRID;

import java.util.List;

public class RootAnnouncement extends Request {
    private CRID rootCrid;
    private List<CRID> nodeCrids = Lists.newArrayList();

    public RootAnnouncement addMyCRID(CRID myCrid) {
        nodeCrids.add(myCrid);
        return this;
    }
}
