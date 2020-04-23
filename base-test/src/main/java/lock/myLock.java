package lock;

import org.aspectj.weaver.tools.ISupportsMessageContext;

import java.util.concurrent.locks.*;

public class myLock {
    //可重入锁
    private Lock lock1=new ReentrantLock();
    //LockSupport lockSupport = new LockSupport(); //can't instance
    //读写锁
    private final ReadWriteLock readWriteLock= new ReentrantReadWriteLock();
    //读写锁
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();
}
