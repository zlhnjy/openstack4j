package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.PortUpdate;
import org.openstack4j.openstack.image.v2.domain.PatchOperation;

import java.util.List;

public interface PortUpdateBuilder extends Buildable.Builder<PortUpdateBuilder, PortUpdate> {

    PortUpdateBuilder ops(List<PatchOperation> ops);

    PortUpdateBuilder ops(PatchOperation op);

}
