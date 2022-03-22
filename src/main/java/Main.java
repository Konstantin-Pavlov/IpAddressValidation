import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        System.out.println(new Main().checkIP(ip));
        scanner.close();
    }

    String checkIP(String ipAddress) {
        String result = "NO";
        int count = 0;
        if (ipAddress.length() < 7 || ipAddress.length() > 15) {
            return result;
        }
        String[] ipArray = ipAddress.split("\\.");
        try {
            count = (int) Arrays.stream(ipArray)
                    .filter(x -> Integer.parseInt(x) > -1 && Integer.parseInt(x) < 256)
                    .count();
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return result;
        }

        if (count == 4) {
            result = "YES";
        }
        return result;
    }
}