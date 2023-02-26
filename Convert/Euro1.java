package Convert;

public class Euro1 {
    private float Euro1;
    private double result1;

    public Euro1(float euro1) {
        this.Euro1 = euro1;
        setEuro();
        System.out.println();
        printResult();

    }

    public void setEuro() {
        result1 = Euro1*1.06;
    }
    public void printResult(){
        System.out.println("To "+result1+" $");
    }
}
