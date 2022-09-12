public class FiveSec implements Runnable{
    @Override
    public void run() {
        int count=0;
        while (count<100) {
            try {
                Thread.sleep(5000L);
                System.out.println((count + 5) + " secons left");
                count=count+5;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
