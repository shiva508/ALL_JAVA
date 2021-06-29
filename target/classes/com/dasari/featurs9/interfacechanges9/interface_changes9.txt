--->To provide a resolution to above scenarios, Oracle Corporation has introduced private methods 
	in interfaces in java 9 release.
--->From Java 9 onwards, we can write private methods in interfaces using private access modifier 
--->In Java 9 and later versions, an interface can have six kinds of things:

	a).Constant variables
	b).Abstract methods
	c).Default methods
	d).Static methods
	e).Private methods
	f).Private Static methods
	
--->Rules to define private methods in an Interface?
	While writing private methods in an Interface, we should follow these rules:

	1).We should use private modifier to define these methods.
	2).No private and abstract modifiers together, it will give compiler error.
	
--->Why do we need private methods in Interface?
	Java 9 private methods in interfaces have following benefits.

	1).No need to write duplicate code, hence more code reusability.
	2).We got the choice to expose only our intended methods implementations to clients.
	