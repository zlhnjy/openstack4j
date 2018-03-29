package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.NodeManagement;

public interface NodeManagementBuilder extends Buildable.Builder<NodeManagementBuilder, NodeManagement>  {

    NodeManagementBuilder target(String target);

}
