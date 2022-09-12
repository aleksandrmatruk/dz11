public class OneSec implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while (count<100) {
            try {
                Thread.sleep(1000L);
                count = count+1;
                System.out.println(count+ " seconds left");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
