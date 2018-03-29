package org.openstack4j.api.bareMetal;

import org.openstack4j.model.bareMetal.Chassis;
import org.openstack4j.model.bareMetal.ChassisUpdate;
import org.openstack4j.model.common.ActionResponse;

import java.util.List;

/**
 * bare metal chassis service
 *
 * @author zhangliang
 */
public interface ChassisService {

    Chassis get(String chassisId);

    List<? extends Chassis> list();

    Chassis create(Chassis chassis);

    ActionResponse delete(String chassisId);

    Chassis update(String chassisId, ChassisUpdate chassisUpdate);

}
