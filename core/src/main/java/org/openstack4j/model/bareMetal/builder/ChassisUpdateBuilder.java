package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.bareMetal.ChassisUpdate;
import org.openstack4j.openstack.image.v2.domain.PatchOperation;

import java.util.List;

public interface ChassisUpdateBuilder extends Buildable.Builder<ChassisUpdateBuilder, ChassisUpdate> {

    ChassisUpdateBuilder ops(List<PatchOperation> ops);

    ChassisUpdateBuilder ops(PatchOperation op);

}
