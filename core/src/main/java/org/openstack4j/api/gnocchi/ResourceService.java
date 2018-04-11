package org.openstack4j.api.gnocchi;

import org.openstack4j.model.gnocchi.Resource;

import java.util.Date;
import java.util.List;

/**
 * resource service
 *
 * @author zhangliang
 */
public interface ResourceService {

    Object[][] listMetric(String resourceType, String resourceId, String metricType, Date start);

    List<? extends Resource> listResource(String resourceType, String instanceId);

}
