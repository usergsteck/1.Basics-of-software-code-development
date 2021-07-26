public class Task2 {
    /*
    Вычислить значения выражения по формуле ( все переменные принимают действительные значения ):
     (b+√(b^2+4a*c))/2*a-a^3*c+b^(-2)
     */
public void result (double a , double b , double c) {
    System.out.println("Значение выражения равно : "+((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2)));
    }
    public static void main (String[] args){
    Task2 t = new Task2();
    t.result(10,20,30);
    }
}
