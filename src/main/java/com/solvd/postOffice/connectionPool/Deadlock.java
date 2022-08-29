package com.solvd.postOffice.connectionPool;

public class Deadlock {
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend thread1 =
                new Friend("1");
        final Friend thread2 =
                new Friend("2");
        new Thread(new Runnable() {
            @Override
            public void run() {
                 System.out.println("Thread 1");
                thread1.bow(thread2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
                thread2.bow(thread1);
            }
        }).start();
    }
}
