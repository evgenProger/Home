public class Volleyball {
    public int determineGroup(int age) {
        int result = -1;
        if(7 <= age && age <= 13) {
            result = 1;
        }
        else if (14 <= age && age <= 17) {
            result = 2;
        }
        else if (18 <= age && age <= 65) {
            result = 3;
        }
        return result;

        //Твой код здесь
    }

}
