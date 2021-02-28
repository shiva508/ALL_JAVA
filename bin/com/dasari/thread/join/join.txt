1. The Thread.join() Method
	a).The join method is defined in the Thread class:
	b).public final void join() throws InterruptedException
	Waits for this thread to die.
	c).When we invoke the join() method on a thread, the calling thread goes into a waiting state. 
	It remains in a waiting state until the referenced thread terminates.
	d).The join() method may also return if the referenced thread was interrupted.  In this case, 
	the method throws an InterruptedException.
	e).Finally, if the referenced thread was already terminated or hasn't been started, 
	the call to join() method returns immediately.
	
2. Thread.join() Methods with Timeout
	The join() method will keep waiting if the referenced thread is blocked or is taking too long 
	to process. This can become an issue as the calling thread will become non-responsive. To handle 
	these situations, we use overloaded versions of the join() method that allow us to specify a timeout 
	period.

	“public final void join(long millis) throws InterruptedException
	Waits at most millis milliseconds for this thread to die. A timeout of 0 means to wait forever.”
	“public final void join(long millis,int nanos) throws InterruptedException
	Waits at most millis milliseconds plus nanos nanoseconds for this thread to die.”
3. Thread.join() Methods and Synchronization
	“All actions in a thread happen-before any other thread successfully returns from a 
	join() on that thread.”
	This means that when a thread t1 calls t2.join(), then all changes done by t2 are visible in t1 on return. 
	However, if we do not invoke join() or use other synchronization mechanisms, we do not have any guarantee 
	that changes in the other thread will be visible to the current thread even if the other thread has 
	completed.

	