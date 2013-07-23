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
    private List<String> pathFromRoot = Lists.newArrayList();

    public Integer getRootId() {
        return rootId;
    }

    public CRID setRootId(Integer rootId) {
        this.rootId = rootId;
        return this;
    }

    public List<String> getPathFromRoot() {
        return pathFromRoot;
    }

    public CRID setPathFromRoot(List<String> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
        return this;
    }

    public CRID addHop(String hop) {
        this.pathFromRoot.add(hop);
        return this;
    }
}
