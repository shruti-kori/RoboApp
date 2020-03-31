package scan;

import core.AbstractService;
import core.Services;
import exceptions.ScanException;
import models.BarCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ScanOperationImpl extends AbstractService implements ScanOperations {

    private static final Logger LOG = LoggerFactory.getLogger(ScanOperationImpl.class);

    public ScanOperationImpl(Services services) {
        super(services);
    }

    public double displayPrice(BarCode barCode) throws ScanException {
        return 0;
    }

    public boolean readBarCode(BarCode barCode) throws ScanException {
        return false;
    }
}
