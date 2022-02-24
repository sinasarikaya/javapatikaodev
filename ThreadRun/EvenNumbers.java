package ThreadRun;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers extends Thread {

    public ArrayList<Integer> tempList;

    ArrayList<Integer> EvenList = new ArrayList<>();

    public EvenNumbers(ArrayList<Integer> tempList) {
        this.tempList = tempList;
    }

    @Override
    public void run() {
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) % 2 == 0) {
                //System.out.println(tempList.get(i));
                EvenList.add(tempList.get(i));
            }
        }
        print();
    }

    public void print() {
        System.out.println(EvenList.toString());
    }
}
