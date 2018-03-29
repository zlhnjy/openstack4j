package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.bareMetal.Node;

import java.util.Map;

/**
 * A Builder which creates a Bare Metal Node
 *
 * @author zhangliang
 */
public interface NodeBuilder extends Builder<NodeBuilder, Node> {

    NodeBuilder driver(String driver);

    NodeBuilder chassisUuid(String chassisUuid);

    NodeBuilder extra(Map<String, String> extra);

    NodeBuilder addExtraItem(String key, String value);

    NodeBuilder properties(Map<String, Object> properties);

    NodeBuilder addProperties(String key, Object value);

    NodeBuilder driverInfo(Map<String, Object> driverInfo);

    NodeBuilder addDriverInfo(String key, Object value);

}
