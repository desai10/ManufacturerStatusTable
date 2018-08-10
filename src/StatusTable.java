import java.util.ArrayList;
import java.util.List;

public class StatusTable {
    List<FolioRangeRecord> statusTableList = new ArrayList<>();

    public void addInputRecord(FolioRangeRecord record){
        return;
    }

    public void printTable(){
        for(int i=0;i<statusTableList.size();i++)
            System.out.println(statusTableList.get(i).convertRecord2String());
        }

    public void refineStatusTable(){
        //sort it and check all the test cases
    }

}
