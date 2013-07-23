package renuka.projects.protocol.routing;

import renuka.projects.node.CRID;

/**
 * Base type for all Routing Implementation
 * <p/>
 * Router does 2 main functions
 * - Route Discovery
 * - Route Recovery
 */
abstract public class Router {

    /**
     * Utility method to determine which Routing type to use based on the source and destination CRID
     *
     * @param source      CRID of the source (aka) Sender
     * @param destination CRID of the destination (aka) receiver
     * @return Router Type, either Inter / Intra Spectrum Router
     */
    public static Router getRoutingType(CRID source, CRID destination) {
        return (source.getRootId() == destination.getRootId()) ? new IntraSpectrumRouter() : new InterSpectrumRouter();
    }
}
