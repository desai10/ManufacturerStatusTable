public class Range {

    int start;
    int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int isContainsRange(Range input) {
        /*0 - no over lap
        1 - left overlap
        2 - right overlap
        3 - full overlap
        4 - completely inside*/
        if ((input.start >= this.start) && (input.end <= this.end))
            return 4;
        else if((input.start <= this.start) && (input.end >= this.end))
            return 3;
        else if((input.start >= this.start) && (input.end >= this.end))
            return 2;
        else if((input.start <= this.start) && ((input.end <= this.end)))
            return 1;
        return 0;
    }


}
