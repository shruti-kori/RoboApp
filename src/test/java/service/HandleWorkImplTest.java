package service;

import core.ServiceFactory;
import core.Services;
import exceptions.WeightException;
import models.PowerResponse;
import org.junit.Before;
import org.junit.Test;
import power.PowerOperations;
import work.HandleWork;

public class HandleWorkImplTest {

    PowerOperations powerOperations;

    HandleWork handleWork;

    @Before
    public void setUp() {
        final Services services = ServiceFactory.createServices();
        powerOperations = services.getPowerService();
        handleWork = services.getHandleWorkService();
    }

    @Test
    public void testHandleWorkWalk() {
        PowerResponse canWalk = handleWork.walk(3.5,0);
        System.out.println(canWalk.isCanWalk());
        System.out.println(canWalk.getBatteryPower());
    }

    @Test
    public void testHandleWorkWalkWithWeight() {
        PowerResponse canWalk = handleWork.walk(3.5,2);
        System.out.println(canWalk.isCanWalk());
        System.out.println(canWalk.getBatteryPower());
    }

    @Test(expected = WeightException.class)
    public void testHandleWorkWalkWithWeightException() {
        PowerResponse canWalk = handleWork.walk(0,12);
        System.out.println(canWalk.isCanWalk());
        System.out.println(canWalk.getBatteryPower());
    }
}
