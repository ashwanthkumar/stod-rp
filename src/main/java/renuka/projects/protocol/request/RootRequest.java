package renuka.projects.protocol.request;

import com.google.common.collect.Maps;
import renuka.projects.node.CRID;

import java.util.Map;

public class RootRequest extends Request {
    public static final int ROOT_REQUEST_TYPE = 0;

    /**
     * Address of the current (self) node that sends this Root Request
     */
    private CRID nodeCrid;
    /**
     * Number of Spectrum bands the node sending this request is part of
     */
    private int numberOfAvailableSpectrumBands = 0;
    /**
     * Map of SpectrumBand -> Time available in each of them (this value is statistically
     * obtained by monitoring the spectrum for the primary user)
     */
    private Map<Integer, Double> timeAvailableInSpectrumBand = Maps.newHashMap(); // BandId -> Time Available in seconds

    public RootRequest addSpectrum(double timeToLiveInSpectrum) {
        timeAvailableInSpectrumBand.put(numberOfAvailableSpectrumBands++, timeToLiveInSpectrum);
        return this;
    }

    public CRID getNodeCrid() {
        return nodeCrid;
    }

    public Map<Integer, Double> getTimeAvailableInSpectrumBand() {
        return timeAvailableInSpectrumBand;
    }

    public int getNumberOfAvailableSpectrumBands() {
        return numberOfAvailableSpectrumBands;
    }

    @Override
    public int requestType() {
        return ROOT_REQUEST_TYPE;
    }
}
