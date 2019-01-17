Executors 工厂类来产生连接池
    newFixedThreadPoll(int nThrads):创建一个可重用的，固定容量的线程池

ExcutorService:
    Future<?> submit(Runable task)
    <T> Future<T> submit(Runable task,T result):result 显示的指定线程的返回值
    <T> Future<T> submit(Callable<T> task):

使用线程池的步骤如下：
    调用Executors类的 静态方法，返回 ExecutorService 对象，该对象表示一个线程池
    创建 Runable 或者 Callable 的实例
    调用 ExecutorService 方法的submit 方法，提交Runable 或者Callable的实例
    当不想提交 任何任务，调用ExecutorService 方法 的shutdown 方法来关闭线程