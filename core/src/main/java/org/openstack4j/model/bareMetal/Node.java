package org.openstack4j.model.bareMetal;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.builder.NodeBuilder;
import org.openstack4j.model.common.Resource;

import java.util.Map;

/**
 * Bare Metal Node
 *
 * @author zhangliang
 */
public interface Node extends Resource, Buildable<NodeBuilder> {

    String getDriver();

    String getUuid();

    String getChassisUuid();

    String getInstanceUuid();

    String getPowerState();

    String getProvisionState();

    Boolean getMaintenance();

    Map<String, String> getExtra();

    Map<String, Object> getProperties();

    Map<String, Object> getDriverInfo();



}
