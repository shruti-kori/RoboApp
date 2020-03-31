package power;

import core.AbstractService;
import core.Services;
import exceptions.BatteryException;
import models.PowerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.BatteryUtil;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class PowerOperationImpl extends AbstractService implements PowerOperations {

    private static final Logger LOG = LoggerFactory.getLogger(PowerOperationImpl.class);

    public PowerOperationImpl(Services services) {
        super(services);
    }

    BatteryUtil batteryUtil = new BatteryUtil();

    public PowerResponse canWalk(double distance, double weight) throws BatteryException {
        PowerResponse response = new PowerResponse();
        double powerRemaining = batteryUtil.remainingBatteryPower();
        double powerToBeConsumed = batteryUtil.
                calculatePowerToBeConsumed(distance, weight);
        powerRemaining -= powerToBeConsumed;
        if (powerRemaining > 0) {
            response.setCanWalk(true);
            response.setBatteryPower(powerRemaining);
        }
        return response;
    }

    public void alertRobotCharge(double power) throws
            BatteryException {
        if( power / 10 > 15 ) {
            throw new BatteryException("Alert Robo : Running low on Battery");
        }
    }
}
