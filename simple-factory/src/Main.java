public class Main {

    public static void main(String[] args){
        System.out.println("this is a simple factory mode");
        Operation oper;
        oper = OperationFactory.createOperation("+");
        oper.numberA = 1;
        oper.numberB = 2;
        double result = 0;
        try{
            result = oper.getResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("result:"+result);
    }
}
