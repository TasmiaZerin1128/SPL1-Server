package First;

import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiScore {
    ArrayList<Integer> marksInd = new ArrayList<Integer>();
    static String N;
    static int TotalM;
    public void Score(int qMarks)
    {
        marksInd.add(qMarks);
    }
    public void setName(String name)
    {
        N = name;
        System.out.println("Name set: "+N);
    }
    public void setFinalMarks(int marks)
    {
        TotalM = marks;
    }
    public void sendP() throws IOException {
        wait W = Object.getWait();
        W.sendMarks(TotalM,N);
    }
    public ArrayList sendInd()
    {
        return marksInd;
    }
}
