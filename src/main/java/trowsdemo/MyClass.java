package trowsdemo;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stacktrace = new StackTraceElement[5];




        try {
             throw  new Exception();
        } catch (Exception e) {

                stacktrace = e.getStackTrace();

            if (e.getStackTrace().length > 2) {
                StackTraceElement[] stack = e.getStackTrace();
                return stack[2].getClassName() + "#" + stack[2].getMethodName();

            }



        }

        return null;
    }


        //.... }
}
