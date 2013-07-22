package renuka.projects.protocol;

public class Message {
    private double channelAccessOverhead = 1; // In Bytes
    private double protocolOverhead = 1; // In Bytes
    private long packetSize;
    private double linkRateInMbps = 1; // Mbps
    private double packetErrorRate = 0.2; // Drop like 2 packets every 100 packets
    private double timeDurationOfSpectrumBand = 60; // seconds

    public Message(long packetSize) {
        this.packetSize = packetSize;
    }

    public double getChannelAccessOverhead() {
        return channelAccessOverhead;
    }

    public Message setChannelAccessOverhead(double channelAccessOverhead) {
        this.channelAccessOverhead = channelAccessOverhead;
        return this;
    }

    public double getProtocolOverhead() {
        return protocolOverhead;
    }

    public Message setProtocolOverhead(double protocolOverhead) {
        this.protocolOverhead = protocolOverhead;
        return this;
    }

    public long getPacketSize() {
        return packetSize;
    }

    public Message setPacketSize(long packetSize) {
        this.packetSize = packetSize;
        return this;
    }

    public double getLinkRateInMbps() {
        return linkRateInMbps;
    }

    public Message setLinkRateInMbps(double linkRateInMbps) {
        this.linkRateInMbps = linkRateInMbps;
        return this;
    }

    public double getPacketErrorRate() {
        return packetErrorRate;
    }

    public Message setPacketErrorRate(double packetErrorRate) {
        this.packetErrorRate = packetErrorRate;
        return this;
    }

    public double getTimeDurationOfSpectrumBand() {
        return timeDurationOfSpectrumBand;
    }

    public Message setTimeDurationOfSpectrumBand(double timeDurationOfSpectrumBand) {
        this.timeDurationOfSpectrumBand = timeDurationOfSpectrumBand;
        return this;
    }

    public double computeAirtimeCost() {
        return (channelAccessOverhead + protocolOverhead + (packetSize / linkRateInMbps)) * (1 / ((1 - packetErrorRate) * timeDurationOfSpectrumBand));
    }

}
