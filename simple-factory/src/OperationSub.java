/**
 * Created by Administrator on 2017/9/9.
 */
public class OperationSub extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        result = numberA - numberB;
        return result;
    }
}
