package renuka.projects.protocol;

import com.google.common.collect.Lists;
import renuka.projects.node.Node;

import java.util.List;

public class SpectrumTree {
    private Node rootNode;
    private List<Node> nodes = Lists.newArrayList();

    public SpectrumTree addNode(Node node) {
        nodes.add(node);
        return this;
    }

    public void sendRootRequest() {
        // TODO: To Implement
    }

    public void sendRootAnnouncement() {
        // TODO: To Implement
    }
}
