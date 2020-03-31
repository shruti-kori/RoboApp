package scan;

import exceptions.ScanException;
import models.BarCode;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface ScanOperations {
    /**
     * Displays the price of the commodity if the scan is successful.
     * @param barCode barCode
     * @return price of the commodity
     * @throws ScanException scanException
     */
    double displayPrice(BarCode barCode) throws ScanException;

    /**
     * Method to implement read the bar code on the commodity.
     * Throws Scan Exception in case of hazy bar code
     * @param barCode barCode
     * @return whether read was successful or not
     * @throws ScanException scanException
     */
    boolean readBarCode(BarCode barCode) throws ScanException;
}
