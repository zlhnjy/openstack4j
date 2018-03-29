package org.openstack4j.api.bareMetal;

import org.openstack4j.model.bareMetal.Port;
import org.openstack4j.model.bareMetal.PortUpdate;
import org.openstack4j.model.common.ActionResponse;

import java.util.List;

/**
 * bare metal ports service
 *
 * @author zhangliang
 */
public interface PortService {

    List<? extends Port> list();

    Port create(Port port);

    ActionResponse delete(String portId);

    Port update(String portId, PortUpdate portUpdate);

}
