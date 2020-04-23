package clclicby;

import java.util.concurrent.CyclicBarrier;

public class FooBar {
    private int n;
    private CyclicBarrier cyclicBarrierfoo;
    private CyclicBarrier cyclicBarrierbar;
    public FooBar(int n){
        this.n = n;
        this.cyclicBarrierfoo = new CyclicBarrier(2);
        this.cyclicBarrierbar = new CyclicBarrier(2);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        try {
            for (int i = 0; i < n; i++) {
                cyclicBarrierfoo.await();
//                 printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                cyclicBarrierbar.await();
            }
        }catch (Exception e){
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        try {
            cyclicBarrierfoo.await();
            for (int i = 0; i < n; i++) {
                cyclicBarrierbar.await();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                cyclicBarrierfoo.await();
            }
        }catch (Exception e){
        }

    }
}
