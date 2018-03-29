package org.openstack4j.api.bareMetal;

import org.openstack4j.model.bareMetal.Driver;

import java.util.List;
import java.util.Map;

/**
 * bare metal drivers service
 *
 * @author zhangliang
 */
public interface DriverService {

    List<? extends Driver> list();

    Map<String, String> getProperties(String driverName);

}
