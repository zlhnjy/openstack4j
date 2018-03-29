package org.openstack4j.model.bareMetal.builder;

/**
 * The Bare Metal Builders
 *
 * @author zhangliang
 */
public interface BareMetalBuilders {

    /**
     * The Builder to create a ChassisBuilder
     * @return the chassis builder
     */
    ChassisBuilder chassis();

    ChassisUpdateBuilder chassisUpdate();

    /**
     * The Builder to create a DriverBuilder
     * @return the driver builder
     */
    DriverBuilder driver();

    /**
     * The Builder to create a NodeBuilder
     * @return the node builder
     */
    NodeBuilder node();

    NodeUpdateBuilder nodeUpdate();

    NodeManagementBuilder nodeManagement();

    /**
     * The Builder to create a PortBuilder
     * @return the port builder
     */
    PortBuilder port();

    PortUpdateBuilder portUpdate();

}
