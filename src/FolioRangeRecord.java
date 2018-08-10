public class FolioRangeRecord {
    int rangeStart,rangeEnd,transferCode;
    char statusCode;

    public FolioRangeRecord(int rangeStart,int rangeEnd,char statusCode,int transferCode) {
        this.rangeStart = rangeStart;
        this.rangeEnd=rangeEnd;
        this.statusCode=statusCode;
        this.transferCode=transferCode;
    }

    public int isContainsRange(FolioRangeRecord record){
        //paramet is new input
        return 0;
    }

    public String convertRecord2String(FolioRangeRecord record){
        return new String();
        // format is "A\tB\tS\tT"
    }



}
