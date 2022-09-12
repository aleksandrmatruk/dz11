public class Main {
    public static void main(String[] args) {
        OneSec oneSec = new OneSec();
        new Thread(oneSec).start();
        FiveSec fiveSec = new FiveSec();
        new Thread(fiveSec).start();
        SevenSec sevenSec = new SevenSec();
        new Thread(sevenSec).start();


    }
}
