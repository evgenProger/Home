

        import java.lang.String;

public class Abrivate {
    public String initials(String name) {
        String initials = name.charAt(0) + ".";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                initials += name.charAt(i + 1);

            }



        }
        name = initials.toUpperCase();



        return name;
    }
}
