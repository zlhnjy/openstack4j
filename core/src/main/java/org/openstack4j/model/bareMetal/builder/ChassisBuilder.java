package org.openstack4j.model.bareMetal.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.bareMetal.Chassis;

import java.util.Map;

/**
 * A Builder which creates a Chassis
 *
 * @author zhangliang
 */
public interface ChassisBuilder extends Builder<ChassisBuilder, Chassis> {

    ChassisBuilder description(String description);

    ChassisBuilder extra(Map<String, String> extra);

    ChassisBuilder addExtraItem(String key, String value);

}
