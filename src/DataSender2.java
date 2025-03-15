public class DataSender2 extends AbsractDataSender<SampleModel2> {

    @Override
    public SampleModel2 returnType() {
        return new SampleModel2(3);
    }
}
