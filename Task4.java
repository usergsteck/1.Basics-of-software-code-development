public class Task4 {
    /* Дано действиетльное число R вида nnn.ddd (три цифровых раздряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */

    public double swap (double d) {
        double c = (d*1000)%1000+(int)d/1000.0;
     return c;
    }
    public static void main (String[] args) {
        double b = 375.468;
        Task4 t = new Task4();
        System.out.println("Исходное число : "+b);
        System.out.println("Измененное число: "+t.swap(b));
    }
}
