package org.openstack4j.api.types;

public enum ServiceType {

	IDENTITY("keystone", "identity"),
	APP_CATALOG("murano", "application-catalog"),
	COMPUTE("nova", "compute"),
	IMAGE("glance", "image"),
	BLOCK_STORAGE("cinder", "volume"),
	BLOCK_STORAGEV3("cinderv3", "volumev3"),
	OBJECT_STORAGE("object-store", "object-store"),
	NETWORK("neutron", "network"),
	EC2("ec2", "ec2"),
	TELEMETRY("ceilometer", "metering"),
	TELEMETRY_AODH("aodh", "alarming"),
	ORCHESTRATION("heat", "orchestration"),
	CLUSTERING("senlin", "clustering"),
	SAHARA("sahara", "data_processing"),
	SHARE("manila", "share"),
	DATABASE("trove","database"),
	BARBICAN("barbican", "key-manager"),
	TACKER("tacker", "nfv-orchestration"),
	UNKNOWN("NA", "NA"),
	BAREMETAL("ironic", "baremetal"),
    GNOCCHI("gnocchi", "metric")
	;

	private final String serviceName;
	private final String type;

	ServiceType(String serviceName, String type) {
		this.serviceName = serviceName;
		this.type = type;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public String getType() {
		return this.type;
	}

	public static ServiceType forName(String name) {
		for (ServiceType s : ServiceType.values())
		{
			if (s.getServiceName().equalsIgnoreCase(name))
			    return s;
			if (s.name().equalsIgnoreCase(name))
				return s;
			if (s.type.equalsIgnoreCase(name))
				return s;
		}
		return ServiceType.UNKNOWN;
	}
}
