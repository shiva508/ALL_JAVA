package com.dasari.featurs8.interfacechanges;

public class InterfaceChanges8Impl implements InterfaceChanges8 {

	@Override
	public String logInfo(String info) {

		return info;
	}

	public static void main(String[] args) {
		InterfaceChanges8Impl changes8Impl = new InterfaceChanges8Impl();
		System.out.println(changes8Impl.logInfo(CASSANDRA_DB_NAME));
		System.out.println(changes8Impl.defaultLogInfo());
		InterfaceChanges8.isNull(CASSANDRA_DB_NAME);
	}
}
