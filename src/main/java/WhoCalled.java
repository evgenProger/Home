public class WhoCalled {
    static void f() {
        // генерируем исключение для заполнения трассировки стека
        try {
            throw new Exception();
        }  catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getMethodName() + " " +  stackTraceElement.getClassName());
            }
        }

   }

   static void g() {
        f();
   }

   static void h() {
        g();
   }

    public static void main(String[] args) {
        f();  {
        };
        System.out.println("--------------------------");
        g();
        System.out.println("---------------------------");
        h();

    }

}
