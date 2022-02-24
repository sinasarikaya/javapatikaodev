package ThreadRun;

import java.util.ArrayList;

public class OddNumbers extends Thread {
    public ArrayList<Integer> tempList;
    ArrayList<Integer> oddList=new ArrayList<>();

    public OddNumbers(ArrayList<Integer> tempList){
        this.tempList=tempList;
    }

    @Override
    public void run() {
        for(int i=0;i< tempList.size();i++){
            if(tempList.get(i)%2==1){
                oddList.add(tempList.get(i));
            }
        }
        print();
    }
    public void print(){
        System.out.println(oddList.toString());
    }
}
