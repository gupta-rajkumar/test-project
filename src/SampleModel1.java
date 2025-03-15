public class SampleModel1 {
    private int a;

    public SampleModel1(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "SampleModel1{" +
                "a=" + a +
                '}';
    }
}
