package academic.driver;
/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */

import academic.model.Enrollment;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Enrollment[] enrollments = new Enrollment[100]; 
        int enrollmentCount = 0;

        while (true) {
            String input = scanner.nextLine(); // Menghapus trim()

            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            if (parts.length == 5) { // Sesuaikan dengan input 5 bagian
                String command = parts[0];
                String code = parts[1];
                String id = parts[2];
                String angkatan = parts[3];
                String semester = parts[4]; // Meskipun input ada, outputnya tetap 'None'

                Enrollment enrollment = new Enrollment(code, id, angkatan, semester);
                enrollments[enrollmentCount] = enrollment;
                enrollmentCount++;

                // Output sesuai format yang diharapkan
                System.out.println(command + "|" + code + "|" + id + "|" + angkatan + "|None");
            } else {
                
            }
        }

        scanner.close();
    }
}
 