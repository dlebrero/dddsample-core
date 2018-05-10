package se.citerus.dddsample.domain.model.voyage;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.fail;
import static se.citerus.dddsample.domain.model.location.SampleLocations.HAMBURG;
import static se.citerus.dddsample.domain.model.location.SampleLocations.STOCKHOLM;

public class CarrierMovementTest {

    @Test
    public void testConstructor() {
        try {
            new CarrierMovement(null, null, new Date(), new Date());
            fail("Should not accept null constructor arguments");
        } catch (IllegalArgumentException expected) {
        }

        try {
            new CarrierMovement(STOCKHOLM, null, new Date(), new Date());
            fail("Should not accept null constructor arguments");
        } catch (IllegalArgumentException expected) {
        }

        // Legal
        new CarrierMovement(STOCKHOLM, HAMBURG, new Date(), new Date());
    }


}
