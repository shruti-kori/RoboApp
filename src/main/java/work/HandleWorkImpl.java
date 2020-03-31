package work;

import core.AbstractService;
import core.Services;
import exceptions.BatteryException;
import exceptions.WeightException;
import models.PowerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.BatteryUtil;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class HandleWorkImpl extends AbstractService implements HandleWork {

    private static final Logger LOG = LoggerFactory.getLogger(HandleWorkImpl.class);

    public HandleWorkImpl(Services services) {
        super(services);
    }

    BatteryUtil batteryUtil = new BatteryUtil();

    public PowerResponse walk(double distance, double weight) throws
            BatteryException, WeightException {
        if(weight > 10) {
            LOG.debug("Over Weight!!");
            throw new WeightException("Weight exceeded, cannot carry this weight! Overweight!!!!");
        }
        PowerResponse response = services.getPowerService().canWalk(distance , weight);

        if (response.isCanWalk()) {
            LOG.debug("Can walk. Have enough power.");
        }
        LOG.debug("Not enough power to walk.");
        return response;
    }
}
