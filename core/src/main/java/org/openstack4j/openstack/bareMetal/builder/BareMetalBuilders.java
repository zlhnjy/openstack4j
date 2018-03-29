package org.openstack4j.openstack.bareMetal.builder;

import org.openstack4j.model.bareMetal.builder.*;
import org.openstack4j.openstack.bareMetal.domain.*;

/**
 * The BareMetal Builders v1
 */
public class BareMetalBuilders implements org.openstack4j.model.bareMetal.builder.BareMetalBuilders {
    @Override
    public ChassisBuilder chassis() {
        return BareMetalChassis.builder();
    }

    @Override
    public ChassisUpdateBuilder chassisUpdate() {
        return BareMetalChassisUpdate.builder();
    }

    @Override
    public DriverBuilder driver() {
        return BareMetalDriver.builder();
    }

    @Override
    public NodeBuilder node() {
        return BareMetalNode.builder();
    }

    @Override
    public NodeUpdateBuilder nodeUpdate() {
        return BareMetalNodeUpdate.builder();
    }

    @Override
    public NodeManagementBuilder nodeManagement() {
        return BareMetalNodeManagement.builder();
    }

    @Override
    public PortBuilder port() {
        return BareMetalPort.builder();
    }

    @Override
    public PortUpdateBuilder portUpdate() {
        return BareMetalPortUpdate.builder();
    }
}
