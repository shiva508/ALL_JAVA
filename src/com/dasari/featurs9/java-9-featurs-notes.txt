Java 9 Module System

-->Java added this feature to collect Java packages and code into a single unit called module.

1. Improved Javadoc
Java 9 update came with an updated Java documentation. 
We no longer need to use Google to find the right documentation. 
The new Javadoc came with search right in the API documentation itself. 
Moreover, the Javadoc output was HTML5 compliant. 
Every Javadoc page includes information on which JDK module the class or interface comes from.

2. Factory methods for collections(like List, Map, Set and Map.Entry):
Many a times, you want to create a collection (e.g., 
a List or Set) in your Java program and fill it with some elements. 
That leads to repetitive coding where you instantiate the collection, 
followed by several ‘add’ calls. With Java 9, 
several so-called collection factory methods have been added.
List and Set interfaces have “of()” methods to create an empty or no-empty 
Immutable List or Set objects as shown below:
List<String> immutableList=List.of("Name1","Name2");

3. JShell: the interactive Java REPL
Oracle Corp. has introduced a new tool called “jshell”. It stands for Java Shell and also known 
as REPL (Read Evaluate Print Loop). 
Many languages already feature an interactive Read-Eval-Print-Loop, 
and Java now joins this club. It is used to execute and test any Java Constructs like class, 
interface, enum, object, statements etc. very easily. You can launch jshell from the console and 
directly start typing and executing Java code. The immediate feedback of jshell 
makes it a great tool to explore APIs and try out language features.

4. Stream API Improvements:
In Java SE 9, Oracle Corp. has added four useful new methods 
to java.util.Stream interface. As Stream is an interface, all those new implemented methods 
are default methods. It allows you to create declarative pipelines of transformations on collections. 
There are four new methods added to the Stream interface: dropWhile, takeWhile, 
ofNullable. The iterate method gets a new overload, allowing you to provide 
a Predicate on when to stop iterating.

5.No Under scores

