public class SampleModel2 {
    private float a;

    public SampleModel2(float a) {
        this.a = a;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "SampleModel2{" +
                "a=" + a +
                '}';
    }
}
