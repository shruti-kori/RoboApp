package power;

import exceptions.BatteryException;
import models.PowerResponse;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface PowerOperations {
    /**
     * Provides the detailed log of if the robo can walk and the power is to be consumed.
     * @param distance distance
     * @param weight weight
     * @return PowerResponse class
     * @throws BatteryException batteryException
     */
    PowerResponse canWalk(double distance, double weight) throws BatteryException;

    /**
     * Alerts robo in case of less charge.
     * @param power power
     * @throws BatteryException batteryException
     */
    void alertRobotCharge(double power) throws BatteryException;
}
