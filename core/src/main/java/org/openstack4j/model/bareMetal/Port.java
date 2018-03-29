package org.openstack4j.model.bareMetal;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.builder.PortBuilder;
import org.openstack4j.model.common.Resource;

import java.util.Map;

/**
 * Bare Metal Port
 *
 * @author zhangliang
 */
public interface Port extends Resource, Buildable<PortBuilder> {

    String getUuid();

    String getAddress();

    String getNodeUuid();

    String getPortgroupUuid();

    Boolean getPxeEnable();

    String getPhysicalNetwork();

    Map<String, String> getExtra();

}
