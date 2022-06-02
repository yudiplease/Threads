package Threads;

import java.util.Scanner;

public class Threads {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            if (line.equals("")) {
                System.exit(1);
            }
        });
        thread.start();
        
        while (true) {
            System.out.println("ТЕСТ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
