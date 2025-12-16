package tests;

import javax.swing.*;

public class Timer {
    private  int milliSekund = 0;
    private int sekund = 0;
    private int minut = 0;
    private boolean timerStatus = false;
    private javax.swing.Timer timer;

    public Timer() { timer = new javax.swing.Timer(1, e-> UppdateraTid()); }

    public void start(){
        if (!timerStatus) {
            timerStatus = true;
            timer.start();
        }
    }
    public void stop(){
        if (timerStatus) {
            timerStatus = false;
            timer.stop();
        }
    }
    public void reset(){
        if (timerStatus) {
            timer.stop();
            milliSekund = 0;
            sekund = 0;
            minut = 0;

        }
    }
    private void UppdateraTid (){
        milliSekund++;
        if (milliSekund >= 1000) {
            milliSekund = 0;
            sekund++;
        }
        if (sekund >= 60) {
            sekund =  0;
            minut++;
        }
    }

    @Override
    public String toString() {
        return String.format("%1$d, %2$d, %3$d", minut, sekund, milliSekund);
    }

    public static void main(String[] args) {
        Timer a = new Timer();
        System.out.println(a);
        System.out.println("hej");
    }
}
