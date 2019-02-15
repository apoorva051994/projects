package concAssignment;

import concAssignment.Departmentsys;

public class Main implements Runnable {
    private Departmentsys d1;
    private int fromAcc1;
 
    public Main(Departmentsys d1, int fromAcc1) {
        this.d1 = d1;
        this.fromAcc1 = fromAcc1;
    }
 
    public void run() {
 
        while (true) {
            int toAcc2 = (int) (Math.random() * Departmentsys.ACCOUNTS);
 
            if (toAcc2 == fromAcc1) continue;
 
            int sum = (int) (Math.random() * Departmentsys.AMOUNT);
 
            if (sum == 0) continue;
 
            d1.transfer(fromAcc1, toAcc2, sum);
 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


