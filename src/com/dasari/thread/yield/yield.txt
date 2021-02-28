yield() provides a mechanism to inform the “scheduler” that the current 
thread is willing to relinquish its current use of processor but it'd like to be 
scheduled back soon as possible.

The “scheduler” is free to adhere or ignore this information and in fact, 
has varying behavior depending upon the operating system.

yield() is non-deterministic and platform dependent as well.

3. Comparing with Other Idioms
There are other constructs for affecting the relative progression of threads. 
They include wait(), notify() and notifyAll() as part of Object class, join() 
as part of Thread class, and sleep() as part of Thread class.

Let's see how do they compare to yield().

3.1. yield() vs wait()
a).While yield() is invoked in the context of the current thread, 
	wait() can only be invoked on an explicitly acquired 
	lock inside a synchronized block or method
b).Unlike yield(), it is possible for wait() to specify a minimum time period to 
	wait before any attempt to schedule the thread again
c).With wait() it is also possible to wake the thread anytime through an invocation 
	of notify() or notifyAll() on the concerned lock object


3.2. yield() vs sleep()
While yield() can only make a heuristic attempt to suspend the execution of the current 
	thread with no guarantee of when will it be scheduled back, sleep() can force the 
	scheduler to suspend the execution of the current thread for at least the mentioned 
	time period as its parameter.
	
3.3. yield() vs join()
a).The current thread can invoke join() on any other thread which makes the current 
	thread wait for the other thread to die before proceeding
b).Optionally it can mention a time period as its parameter which indicates the 
	maximum time for which the current thread should wait before resuming
	
	
	
	
	