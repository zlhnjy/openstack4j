package org.openstack4j.api.gnocchi;

import org.openstack4j.common.RestService;

/**
 * gnocchi service
 *
 * @author zhangliang
 */
public interface GnocchiService extends RestService {

    ResourceService resource();

}
