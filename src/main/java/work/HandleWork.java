package work;

import exceptions.BatteryException;
import exceptions.WeightException;
import models.PowerResponse;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface HandleWork {
    /**
     * Handles the code wherein the robo can walk or not and makes
     * robo perform that functionality.
     * @param distance distance
     * @param weight weight
     * @return the expected response
     * @throws WeightException weightException
     * @throws BatteryException batteryException
     */
    PowerResponse walk(double distance, double weight) throws WeightException, BatteryException;
}
