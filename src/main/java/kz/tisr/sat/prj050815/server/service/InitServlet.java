package kz.tisr.sat.prj050815.server.service;



import kz.tisr.sat.prj050815.server.common.MainThread;

import javax.servlet.http.HttpServlet;


public class InitServlet extends HttpServlet {
    private static Boolean execute = false;

    public InitServlet() {

        System.out.println(" InitServlet new");
        if (!execute) {

                    Runnable r = new MainThread();
                    Thread thread = new Thread(r);
                    thread.setName("MainThread");
                    thread.start();
            System.out.println(" init Thr=" + Thread.currentThread().getName());

            Runnable r1 = new MainThread();
            Thread thread1 = new Thread(r1);
            thread1.setName("MainThread 1");
            thread1.start();
            System.out.println(" init Thr=" + Thread.currentThread().getName());

            Runnable r2 = new MainThread();
            Thread thread2 = new Thread(r2);
            thread2.setName("MainThread 2");
            thread2.start();
            System.out.println(" init Thr=" + Thread.currentThread().getName());

            Runnable r3 = new MainThread();
            Thread thread3 = new Thread(r3);
            thread3.setName("MainThread 3");
            thread3.start();
            System.out.println(" init Thr=" + Thread.currentThread().getName());

            Runnable r4 = new MainThread();
            Thread thread4 = new Thread(r4);
            thread4.setName("MainThread 4");
            thread4.start();
            System.out.println(" init Thr=" + Thread.currentThread().getName());

            try {
                thread2.sleep(1000 * 30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" thread2.sleep(30 sec) ");

            try {
                thread3.join(1000 * 180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread3.join(180 sec); ");



            execute = true;

        }

    }
}
