package renuka.projects.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class MessageTest {
    @Test
    public void shouldComputeAirtimeCostForSimpleTransfer() {
        Message message = new Message(1024);
        assertThat(message.computeAirtimeCost(), closeTo(21.5, 0.5));
    }

    @Test
    public void shouldReduceCostByHalfForDoubleTransmissionRate() {
        Message message = new Message(1024).setLinkRateInMbps(2);
        assertThat(message.computeAirtimeCost(), closeTo(10.7, 0.5));
    }

    @Test
    public void shouldHaveSimilarCostForDoublePacketSizeAndTransmission() {
        Message message = new Message(1024 * 2).setLinkRateInMbps(2);
        assertThat(message.computeAirtimeCost(), closeTo(21.5, 0.5));
    }

}
