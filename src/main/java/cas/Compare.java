package cas;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicInteger;

public class Compare {
    private AtomicInteger ai = new AtomicInteger(0);
    private void incream(){
        for(;;){
            int i =getCount();
            boolean b=compareAndSet(i,++i);
            if(b){
                break;
            }
        }
    }
    public int getCount(){
        return ai.get();
    }
    public boolean compareAndSet(int oldValue,int newValue){
        return ai.compareAndSet(oldValue,newValue);
    }

    public static void main(String[] args) throws InterruptedException {
//        ThreadMXBean threadMXBean= ManagementFactory.getThreadMXBean();
//        int a = threadMXBean.getThreadCount();
//        System.out.println(a);
        Compare compare = new Compare();
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000;i++){
                        compare.incream();
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(compare.getCount());
    }
}
