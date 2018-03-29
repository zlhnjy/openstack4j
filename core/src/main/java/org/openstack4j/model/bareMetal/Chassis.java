package org.openstack4j.model.bareMetal;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.builder.ChassisBuilder;
import org.openstack4j.model.common.Resource;

import java.util.Map;

/**
 * Bare Metal Chassis
 *
 * @author zhangliang
 */
public interface Chassis extends Resource, Buildable<ChassisBuilder> {

    String getUuid();

    String getDescription();

    Map<String, String> getExtra();

}
