package util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatteryUtil {
    private static double batteryPower = 0.0;

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        BatteryUtil.batteryPower = batteryPower;
    }

    private static final double batteryCapacity = 100.0;

    public double remainingBatteryPower() {
        batteryPower = batteryCapacity - batteryPower;
        return batteryPower;
    }

    public double calculatePowerToBeConsumed(double distance,
                      double weight) {
        return ((distance * 20) + ( weight * 2));
    }

    public double chargeBattery(double charge) {
        if(batteryPower + charge > batteryCapacity)
            batteryPower = 100.0;
        else
            batteryPower += charge;
        return batteryPower;
    }
}
