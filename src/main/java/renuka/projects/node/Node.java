package renuka.projects.node;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import renuka.projects.protocol.request.Request;

import java.util.List;
import java.util.Map;

import static renuka.projects.protocol.request.Dismiss.DISMISS_ANNOUNCEMENT_REQUEST_TYPE;
import static renuka.projects.protocol.request.RootAnnouncement.ROOT_ANNOUNCEMENT_REQUEST_TYPE;
import static renuka.projects.protocol.request.RootRequest.ROOT_REQUEST_TYPE;

public class Node {
    /**
     * Maintains the SpectrumBand (Integer) specific Root Node
     */
    private Map<Integer, CRID> spectrumBandRootNodeMap = Maps.newHashMap();
    /**
     * Represents the CRID of the node across spectrumBands
     */
    private Map<Integer, CRID> spectrumBandCRIDMap;
    /**
     * Nodes which are connected to this node directly (in no particular order)
     */
    private List<CRID> neighbouringNodes = Lists.newArrayList();
    private String name;

    private int queueSize = 0;

    /**
     * Maintains the CRID of the overlapping nodes and their current queue size
     * (this state is used only by the root node)
     */
    private Map<CRID, Integer> overlappingNodesQueueSizeMap = Maps.newHashMap();

    private boolean isRoot = true;

    public Request receive(Request requestToProcess) {
        Request processedMessage = null;
        switch (requestToProcess.requestType()) {
            case ROOT_REQUEST_TYPE:
                break;
            case ROOT_ANNOUNCEMENT_REQUEST_TYPE:
                break;
            case DISMISS_ANNOUNCEMENT_REQUEST_TYPE:
                processDismissMessage();
                break;
        }

        return processedMessage;
    }

    /**
     * Is the node across multiple spectrum bands
     */
    public boolean isOverlapping() {
        return spectrumBandRootNodeMap.keySet().size() > 1;
    }

    @Override
    public String toString() {
        String spectrumBandsMember = Joiner.on(",").join(spectrumBandCRIDMap.keySet());
        return (isRoot) ? name + " root{" + spectrumBandsMember + "}" : name + "{" + spectrumBandsMember + "}";
    }

    private boolean processDismissMessage() {
        // Reset all known information about the Spectrum
        spectrumBandCRIDMap.clear();
        spectrumBandRootNodeMap.clear();
        overlappingNodesQueueSizeMap.clear();
        queueSize = 0;
        isRoot = true;
        return true;
    }
}
