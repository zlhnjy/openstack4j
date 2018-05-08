package org.openstack4j.api.bareMetal;

import org.openstack4j.model.bareMetal.Node;
import org.openstack4j.model.bareMetal.NodeManagement;
import org.openstack4j.model.bareMetal.NodeUpdate;
import org.openstack4j.model.bareMetal.NodeValidate;
import org.openstack4j.model.common.ActionResponse;

import java.util.List;
import java.util.Map;

/**
 * bare metal nodes service
 *
 * @author zhangliang
 */
public interface NodeService {

    List<? extends Node> list();

    Node create(Node node);

    Node findOne(String nodeIdent);

    ActionResponse delete(String nodeIdent);

    Node update(String nodeIdent, NodeUpdate nodeUpdate);

    ActionResponse changePowerState(String nodeIdent, NodeManagement nodeManagement);

    ActionResponse setMaintenance(String nodeIdent);

    ActionResponse clearMaintenance(String nodeIdent);

    ActionResponse setBootDevice(String nodeIdent, NodeManagement nodeManagement);

    ActionResponse setConsole(String nodeIdent, NodeManagement nodeManagement);

    ActionResponse setProvision(String nodeIdent, NodeManagement nodeManagement);

    ActionResponse setProvision(String nodeIdent, NodeManagement nodeManagement, Map<String, Object> headers);

    NodeValidate validate(String nodeIdent);

}
