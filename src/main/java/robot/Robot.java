package robot;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean res = false;
        for (int i = 0; i < 3 && !res; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                res = true;

            } catch (RobotConnectionException e) {

            }

        }
        if (!res) {
            throw new RobotConnectionException("Неудачно");
        }

    }
}






