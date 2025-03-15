public class DataSender1 extends AbsractDataSender<SampleModel1> {

    @Override
    public SampleModel1 returnType(){
        return new SampleModel1(1);
    }
}
