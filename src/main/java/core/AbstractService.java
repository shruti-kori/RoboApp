package core;

/**
 *
 */
public abstract class AbstractService {
    protected final Services services;

    protected AbstractService(Services services) {
        this.services = services;
    }
}