
public class Bins {
    static int min;
    int max;
    static int [] bins;
    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        bins  = new int [max + 1 - min];
    }
    public static int getBin(int bin) {
        return bins [bin - min];
    }
    public void incrementBin (int bin) {
        bins [bin - min] += 1;
    }
}
