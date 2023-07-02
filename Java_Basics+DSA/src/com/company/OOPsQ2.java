package com.company;
class CellPhone {
    public void ringing() {
        System.out.println("ringing...");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }

    public void call() {
        System.out.println("calling...");
    }
}

    public class OOPsQ2 {
        public static void main(String[] args) {
            CellPhone asus = new CellPhone();
            asus.call();
            asus.vibrate();
            asus.ringing();
        }
    }

