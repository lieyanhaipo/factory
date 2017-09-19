/**
 * Created by Administrator on 2017/9/9.
 */
public class OperationDiv extends Operation {
    public double getResult() throws Exception{
        double result = 0;
        if(0 == numberB){
            throw new Exception("除数不能为0");
        }
        result = numberA / numberB;
        return result;
    }
}
