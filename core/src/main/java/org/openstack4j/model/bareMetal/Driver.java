package org.openstack4j.model.bareMetal;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.builder.DriverBuilder;
import org.openstack4j.model.common.Resource;

import java.util.List;

/**
 * Bare Metal Driver
 *
 * @author zhangliang
 */
public interface Driver extends Resource, Buildable<DriverBuilder> {

    String getType();

    List<String> getHosts();

}
