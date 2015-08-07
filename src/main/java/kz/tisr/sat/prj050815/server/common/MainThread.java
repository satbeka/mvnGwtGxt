package kz.tisr.sat.prj050815.server.common;

/**
 * Created by SAbdikalikov on 06.08.2015.
 */
public class MainThread implements Runnable {
    @Override
    public void run() {
        System.out.println("    run=");

        System.out.println(" run Thr="+Thread.currentThread().getName());
        System.out.println( " thr start doing somethin need to user ");


    }
}
