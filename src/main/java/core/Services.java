package core;

import power.PowerOperations;
import scan.ScanOperations;
import work.HandleWork;

/**
 * Creates centralised place for all the robo related functionality.
 */
public interface Services {
    PowerOperations getPowerService();

    ScanOperations getScanService();

    HandleWork getHandleWorkService();
}
