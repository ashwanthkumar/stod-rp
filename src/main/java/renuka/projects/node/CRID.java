package renuka.projects.node;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Represents the CRID of a node in a Spectrum
 */
public class CRID {
    /**
     * Represents the RootId (aka) Spectrum Band
     */
    private Integer rootId;
    /**
     * Number of hops to reach the current node
     */
    private List<String> hopsToReach = Lists.newArrayList();

    public Integer getRootId() {
        return rootId;
    }

    public CRID setRootId(Integer rootId) {
        this.rootId = rootId;
        return this;
    }

    public List<String> getHopsToReach() {
        return hopsToReach;
    }

    public CRID setHopsToReach(List<String> hopsToReach) {
        this.hopsToReach = hopsToReach;
        return this;
    }

    public CRID addHop(String hop) {
        this.hopsToReach.add(hop);
        return this;
    }
}
