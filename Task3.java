public class Task3 {
    /* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    (sinx+cosy)/(cosx-siny)*tgxy
     */
    public void result (double x , double y) {
        System.out.println("Значение выражения равно :"+((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y)));
    }
    public static void main(String[] args) {
        Task3 t = new Task3();
        t.result(10, 20);
    }
}
