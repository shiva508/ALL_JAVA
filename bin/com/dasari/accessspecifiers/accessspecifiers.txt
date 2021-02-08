In Java, methods and data members of a class/interface can have one of the following four access specifiers. 
The access specifiers are listed according to their restrictiveness order.

a)private -->(access with in the class where it is defined)
b)default or package private (when no access specifier is specified)
c)protected
d)public (accessible from any class)
But, the classes and interfaces themselves can have only two access specifiers when declared outside any other class.
1) public
2) default (when no access specifier is specified)
We cannot declare class/interface with private or protected access specifiers. For example, following program fails in compilation.