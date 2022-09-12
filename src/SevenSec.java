public class SevenSec implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count<100) {
            try {
                Thread.sleep(7000L);
                System.out.println((count + 7) + " secons left");
                count =count+7;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
