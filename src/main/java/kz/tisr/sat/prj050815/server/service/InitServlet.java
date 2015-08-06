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
                    execute = true;

        }

    }
}
