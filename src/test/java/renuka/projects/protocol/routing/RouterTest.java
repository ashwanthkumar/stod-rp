package renuka.projects.protocol.routing;

import org.junit.Test;
import renuka.projects.node.CRID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RouterTest {
    @Test
    public void shouldReturnIntraSpectrumRouter() {
        CRID source = new CRID().setRootId(1)
                .addHop("1")
                .addHop("2");

        CRID destination = new CRID().setRootId(1)
                .addHop("1")
                .addHop("3");

        Router routingType = Router.getRoutingType(source, destination);
        assertThat(routingType.getClass().getCanonicalName(), is(IntraSpectrumRouter.class.getCanonicalName()));
    }

    @Test
    public void shouldReturnInterSpectrumRouter() {
        CRID source = new CRID().setRootId(1)
                .addHop("1")
                .addHop("2");

        CRID destination = new CRID().setRootId(3)
                .addHop("1")
                .addHop("3");

        Router routingType = Router.getRoutingType(source, destination);
        assertThat(routingType.getClass().getCanonicalName(), is(InterSpectrumRouter.class.getCanonicalName()));
    }

}
