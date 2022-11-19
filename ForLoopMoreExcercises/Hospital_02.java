    package FirstStepsInCoding.ForLoopMoreExcercises;

    import java.util.Scanner;

    public class Hospital_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int days = Integer.parseInt(scanner.nextLine());
            int treatedPatients = 0;
            int untreatedPatient = 0;
            int doctor = 7;
            for (int i = 1; i <= days; i++) {
                int patientsPerDay = Integer.parseInt(scanner.nextLine());
                if (i % 3 == 0 && treatedPatients < untreatedPatient) {
                    doctor += 1;
                }
                if (patientsPerDay <= doctor) {
                    treatedPatients += patientsPerDay;
                } else {
                    treatedPatients += doctor;
                    untreatedPatient += patientsPerDay - doctor;


                    // }if (patientsPerDay <= doctor) {
                    //   treatedPatients += patientsPerDay;
                }
            }
            System.out.printf("Treated patients: %d.%n", treatedPatients);
            System.out.printf("Untreated patients: %d.", untreatedPatient);
        }
    }