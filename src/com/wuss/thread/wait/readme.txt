Object 类提供了 wait ，notify  和 notifyAll 方法，用来协调线程之间的运行

    调用者： 同步监视器 调用

    wait():当前线程等待，直道其他线程调用 该同步监视器的notify 或者 notifyAll方法 ，来唤醒该线程
        调用wait 会释放 同步监视器
    notify():唤醒 在该同步监视器上 等待的 单个线程，如果所有线程都在 此同步监视器上等待，会随机
        唤醒 一条，只有 在该同步同步监视器 释放了锁定之后(也就是调用了wait方法) 才尅执行被唤醒线程
    notifyAll():唤醒在此同步监视器上 等待的所有线程