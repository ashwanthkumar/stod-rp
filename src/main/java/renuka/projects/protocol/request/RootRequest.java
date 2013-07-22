package renuka.projects.protocol.request;

import com.google.common.collect.Maps;

import java.util.Map;

public class RootRequest extends Request {
    private int numberOfAvailableSpectrumBands = 0;
    private Map<Integer, Double> timeAvailableInSpectrumBand = Maps.newHashMap(); // BandId -> Time Available in seconds

    public RootRequest addSpectrum(double timeToLiveInSpectrum) {
        timeAvailableInSpectrumBand.put(numberOfAvailableSpectrumBands++, timeToLiveInSpectrum);
        return this;
    }

    public Map<Integer, Double> getTimeAvailableInSpectrumBand() {
        return timeAvailableInSpectrumBand;
    }

    public int getNumberOfAvailableSpectrumBands() {
        return numberOfAvailableSpectrumBands;
    }
}
