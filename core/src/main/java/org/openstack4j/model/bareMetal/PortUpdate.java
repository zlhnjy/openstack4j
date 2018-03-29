package org.openstack4j.model.bareMetal;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.bareMetal.builder.PortUpdateBuilder;
import org.openstack4j.openstack.image.v2.domain.PatchOperation;

import java.util.List;

public interface PortUpdate extends ModelEntity, Buildable<PortUpdateBuilder> {

    List<PatchOperation> getOps();

}
