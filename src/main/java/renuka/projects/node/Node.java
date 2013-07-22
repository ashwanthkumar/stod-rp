package renuka.projects.node;

import com.google.common.collect.Maps;
import renuka.projects.protocol.request.Request;
import renuka.projects.protocol.request.RootRequest;

import java.util.Map;

public class Node {
    // Initially all nodes assume they are the root node by default
    /**
     * Maintains the SpectrumBand (Integer) specific Root Node
     */
    private Map<Integer, Node> spectrumBandRootNodeMap = Maps.newHashMap();
    private CRID crid;

    private Request processRootRequest(RootRequest rootRequest) {
        // TODO: Implement
        return null;
    }
}
