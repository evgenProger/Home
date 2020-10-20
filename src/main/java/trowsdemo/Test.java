package trowsdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        String result = "";

        try {
            new Exception();
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
               result = stackTraceElement.getClassLoaderName() + stackTraceElement.getMethodName();
            }
        }

        return result;
    }

        // ...

}
