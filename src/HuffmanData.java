/**
 * Created by leealvis on 24/6/2017.
 */
public class HuffmanData implements Comparable<HuffmanData> {

    private int frequency;
    private char letter;

    public HuffmanData(char letter) {
        this.letter = letter;
        this.frequency = 0;
    }

    public int getFrequency() {
        return frequency;
    }

    public char getLetter() {
        return letter;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanData o) {
        return frequency - o.getFrequency();
    }
}
