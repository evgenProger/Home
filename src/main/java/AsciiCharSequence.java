import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    byte[] str;

    public AsciiCharSequence(byte[] str) {
        this.str = str;
    }


    @Override
    public int length() {
        return str.length;
    }

    @Override
    public char charAt(int i) {
        return (char) str[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(str, i, i1));
    }

    @Override
    public String toString() {
        return new String(str);
    }

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }

}

