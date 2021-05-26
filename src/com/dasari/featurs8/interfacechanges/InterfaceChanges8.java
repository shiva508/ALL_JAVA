package com.dasari.featurs8.interfacechanges;

public interface InterfaceChanges8 {
	String MONGO_DB_NAME = "ABC_Mongo_Datastore";
	String NEO4J_DB_NAME = "ABC_Neo4J_Datastore";
	String CASSANDRA_DB_NAME = "ABC_Cassandra_Datastore";

	String logInfo(String info);

	default String defaultLogInfo() {
		String data = "DEFAULT LOG INFO";
		return data;
	}

	// static method example
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}
