public class FolioRangeRecord {

    Range range;
    int transferCode;
    char statusCode;

    public FolioRangeRecord(int start, int end, int transferCode, char statusCode) {
        this.range = new Range(start, end);
        this.transferCode = transferCode;
        this.statusCode = statusCode;
    }

    public int isContainsRange(FolioRangeRecord record){
        return this.range.isContainsRange(record.range);
    }

    public String convertRecord2String(){
        return new String(Integer.toString(this.range.start) + " " + Integer.toString(this.range.end)
                + " " + this.statusCode + Integer.toString(this.transferCode));
        // format is "A B S T"
    }



}
