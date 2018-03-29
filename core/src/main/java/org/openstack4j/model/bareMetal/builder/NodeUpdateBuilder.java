package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.NodeUpdate;
import org.openstack4j.openstack.image.v2.domain.PatchOperation;

import java.util.List;

public interface NodeUpdateBuilder extends Buildable.Builder<NodeUpdateBuilder, NodeUpdate> {

    NodeUpdateBuilder ops(List<PatchOperation> ops);

    NodeUpdateBuilder ops(PatchOperation op);

}
