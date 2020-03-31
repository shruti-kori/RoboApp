package core;

import power.PowerOperationImpl;
import power.PowerOperations;
import scan.ScanOperationImpl;
import scan.ScanOperations;
import work.HandleWork;
import work.HandleWorkImpl;

/**
 * Factory for building a new service for all robo related operations.
 */
public class ServiceFactory implements Services {
    private final PowerOperations powerOperations;
    private final ScanOperations scanOperations;
    private final HandleWork handleWork;

    public static Services createServices() {
        return new ServiceFactory();
    }

    private ServiceFactory() {
        powerOperations = new PowerOperationImpl(this);
        scanOperations = new ScanOperationImpl(this);
        handleWork = new HandleWorkImpl(this);
    }

    @Override
    public PowerOperations getPowerService() {
        return powerOperations;
    }

    @Override
    public ScanOperations getScanService() {
        return scanOperations;
    }

    @Override
    public HandleWork getHandleWorkService() {
        return handleWork;
    }
}
