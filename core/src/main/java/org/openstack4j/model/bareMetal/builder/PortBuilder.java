package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.bareMetal.Port;

import java.util.Map;

/**
 * A Builder which creates a Bare Metal Port
 *
 * @author zhangliang
 */
public interface PortBuilder extends Builder<PortBuilder, Port> {

    PortBuilder nodeUuid(String nodeUuid);

    PortBuilder address(String address);

    PortBuilder portgroupUuid(String portgroupUuid);

    PortBuilder pxeEnable(Boolean pxeEnable);

    PortBuilder physicalNetwork(String networkName);

    PortBuilder extra(Map<String, String> extra);

    PortBuilder addExtraItem(String key, String value);

}
