public  class Task1 {
    // 1.Найдите значение функции z = ((a-3)*b/2)+c.
    public int tf (int a , int b , int c) {
         int z = ((a-3)*b/2)+c;
         return z;
    }
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        System.out.println("Значение функции равно : "+t1.tf(10,20,30));
    }
}