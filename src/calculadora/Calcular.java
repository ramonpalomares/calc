package calculadora;

public class Calcular
{    
    private char operacion;
    private double num1, num2, total;
    
    public Calcular()
    {
        this.num1=0;
        this.num2=0;
        this.operacion=' ';
    }
    
    public Calcular(double num1, char oper, double num2)
    {
        this.num1=num1;
        this.num2=num2;
        this.operacion=oper;
    }

    public char getOperacion() { return operacion; }
    public void setOperacion(char operacion) { this.operacion = operacion; }

    public double getNum1() { return num1; }
    public void setNum1(double num1) { this.num1 = num1; }

    public double getNum2() { return num2; }
    public void setNum2(double num2) { this.num2 = num2; }
    
    public double suma()
    {
        total = getNum1()+getNum2();
        return (total);
    }
    
    public double resta()
    {
        total = getNum1()-getNum2();
        return (total);
    }
    
    public double mult()
    {
        total = getNum1()*getNum2();
        return (total);
    }
    
    public double div()
    {
        if (getNum2() != 0)
            total = getNum1()/getNum2();
        return (total);
    }
    
    public double sqrt(double num)
    {
        total=Math.sqrt(num);
        return (total);
    }
    
    public double exp(double num)
    {
        total = num*num;
        return (total);
    }
    
    public double divX(double num)
    {
        if (num != 0)
        {
            setNum2(num);
            setNum1(1);
            return (div());
        }
        else
            return 0;
    }
}