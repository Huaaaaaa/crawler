package com.bug.crawler.thread;

/**
 * @author: cyhua
 * @createTime: 2019/11/25
 * @description: 测试线程上下文切换
 */
public class ContentSwitch {

    public static void main(String[] args) throws Exception {
        Long count = 1000000000L;
        concurrencyExecute(count);
        serialExecute(count);
    }

    /**
     * @return
     * @description 多线程执行
     * @params 执行次数
     * @author cyhua
     * @createdTime
     */
    public static void concurrencyExecute(Long count) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 1;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long j = 0; j < count; j++) {
            b += 1;
        }
        thread.join();
        Long end = System.currentTimeMillis();
        System.out.println("并发执行的时间是：" + (end - start) + "毫秒");
    }

    /**
     * @return
     * @description 串行执行
     * @params 执行次数
     * @author cyhua
     * @createdTime
     */
    public static void serialExecute(Long count) throws InterruptedException {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 1;
        }
        int b = 0;
        for (long j = 0; j < count; j++) {
            b += 1;
        }
        Long end = System.currentTimeMillis();
        System.out.println("串行执行的时间是：" + (end - start) + "毫秒");
    }
}
