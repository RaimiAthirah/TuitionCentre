/*   A client has a tuition centre for SPM Maths. There are 5 temporary teachers and 100 students.
    The centre hire teachers. The head of centre records their name, IC, address and background info
    (includes years of teaching & qualification).
    Every student needs to complete 5 trial tests. The marks for each tests is per 100.
    The centre records name, IC, address and school name for each student. The teachers split the students among
    themselves based on the average marks range.

    Each student sits through  a series of 5 trial test. Each test covers different set of topics.
    The center calculates the avg for each student.
    And each student will be assigned to the teachers based on the avg:
    < 30: Mr Hassan
    30-50: Mr Gopal
    50-70: Mr Li
    70-80: Cikgu Minah
    80-100: Mr Raju
    Each teacher must have at least 5 years experience.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float average = 0;
        //String assignedTeacher;

        //Adila
        Student adila = new Student();
        Name abi = new Name();
        abi.setFirstName("Adila ");
        abi.setMidName("binti ");
        abi.setLastName("Izzat");
        adila.setName(abi);
        adila.setIC("070424663545");
        adila.setAddr("Taman Permata, Ampang");
        adila.setSchoolName("SMK Taman Permata");

        //set marks for adila
        try {
            adila.setMarks(98, 0);
            adila.setMarks(40, 1);
            adila.setMarks(55, 2);
            adila.setMarks(68, 3);
            adila.setMarks(77, 4);
        } catch (Exception ex) {
            System.out.println("Error found !");
            ex.printStackTrace();
        }

        //Imran
        Student imran = new Student();
        Name sis = new Name("Syed ", "Imran ", "Syah");
        imran.setName(sis);
        imran.setIC("070630147658");
        imran.setAddr("Dataran Sungai Lipur, Selangor");
        imran.setSchoolName("SMK Sungai Lipur");

        //set marks for syed imran
        try {
            imran.setMarks(56, 0);
            imran.setMarks(40, 1);
            imran.setMarks(65, 2);
            imran.setMarks(23, 3);
            imran.setMarks(17, 4);
        } catch (Exception ex) {
            System.out.println("Error found !");
            ex.printStackTrace();
        }

        //Mike
        Student mike = new Student();
        Name michael = new Name();
        michael.setFirstName("Michael ");
        michael.setMidName("Learns To ");
        michael.setLastName("Rock");
        mike.setName(michael);
        mike.setIC("071230558888");
        mike.setAddr("Bukit Melati, Damansara");
        mike.setSchoolName("SMJK Cheong Hui");

        //set marks for michael
        try {
            mike.setMarks(97, 0);
            mike.setMarks(87, 1);
            mike.setMarks(85, 2);
            mike.setMarks(32, 3);
            mike.setMarks(69, 4);
        } catch (Exception ex) {
            System.out.println("Error found !");
            ex.printStackTrace();
        }

        //Mr Hasan
        Teacher hasan = new Teacher();
        Name hsn = new Name();
        hsn.setFirstName("Hasan ");
        hsn.setMidName("bin ");
        hsn.setLastName("Husain");
        hasan.setName(hsn);
        hasan.setIC("871226475634");
        hasan.setAddr("Taman Perdana, Selangor");
        hasan.setYearExp(9);

        //Mr Gopal
        Teacher gopal = new Teacher();
        Name gpl = new Name();
        gpl.setFirstName("Gopal ");
        gpl.setMidName("Ravindran ");
        gpl.setLastName("Raj");
        gopal.setName(gpl);
        gopal.setIC("830416348567");
        gopal.setAddr("Bukit Mewah, Bangi");
        gopal.setYearExp(10);

        //Mr Li
        Teacher li = new Teacher();
        Name lee = new Name("Li ", "Chong ", "Wei");
        li.setName(lee);
        li.setIC("850719234857");
        li.setAddr("Taman Seri Bunga, Puchong ");
        li.setYearExp(7);

        //Cikgu Minah
        Teacher minah = new Teacher();
        Name min = new Name("Aminah ", "binti ", "Amin");
        minah.setName(min);
        minah.setIC("800328439476");
        minah.setAddr("Taman Jaya, Kuala Lumpur");
        minah.setYearExp(11);

        //Mr Raju
        Teacher raju = new Teacher();
        Name raj = new Name("Raju ", "Devi ", "Shangkar");
        raju.setName(raj);
        raju.setIC("780924244958");
        raju.setAddr("Kampung Kijang, Gombak");
        raju.setYearExp(8);


        //tp print output (user input student by number)
        System.out.print("\n------  WELCOME TO PANDAI TUITION CENTRE  ------");
        System.out.println("\n\n\tName of students registered :\n\t1) Adila\n\t2) Syed\n\t3) Michael");
        System.out.println("\nBased on list above,enter the number of student name to check for their informations.");
        System.out.print("Please enter number only : ");
        int check = input.nextInt();
        input.nextLine();

        // switch case for students informations
        switch (check) {
            case 1:
                //1) Adila
                System.out.println("\n======= Student Informations =======");
                System.out.println("\tName: " + abi.getFName() + abi.getMName() + abi.getLName());
                System.out.println("\tIC Number: " + adila.getIC());
                System.out.println("\tAddress: " + adila.getAddr());
                System.out.println("\tSchool Name: " + adila.getSchoolName());

                //print the marks
                System.out.println("\n==== Marks for Trial Tests ====");
                for (int i = 0; i < adila.marks.length; i++) {
                    int j = 0;
                    j = j + i + 1;
                    System.out.println("\tMark #" + j + " : " + adila.getMark(i));
                }

                // calculate and print the average and min marks
                average = adila.calcAvg();
                System.out.println("\n\tAverage marks = " + average);
                System.out.println("\tMinimum marks = " + adila.findMin());
                break;

            case 2:
                //2) Syed Imran
                System.out.println("\n======= Student Informations =======");
                System.out.println("\tName: " + sis.getFName() + sis.getMName() + sis.getLName());
                System.out.println("\tIC Number: " + imran.getIC());
                System.out.println("\tAddress: " + imran.getAddr());
                System.out.println("\tSchool Name: " + imran.getSchoolName());

                //print the marks
                System.out.println("\n==== Marks for Trial Tests ====");
                for (int i = 0; i < imran.marks.length; i++) {
                    int j = 0;
                    j = i + 1;
                    System.out.println("\tMark #" + j + ": " + imran.getMark(i));
                }

                // calculate and print the average and min marks
                average = imran.calcAvg();
                System.out.println("\n\tAverage marks = " + average);
                System.out.println("\tMinimum marks = " + imran.findMin());
                break;

            case 3:
                //3) Michael
                System.out.println("\n======= Student Informations =======");
                System.out.println("\tName: " + michael.getFName() + michael.getMName() + michael.getLName());
                System.out.println("\tIC Number: " + mike.getIC());
                System.out.println("\tAddress: " + mike.getAddr());
                System.out.println("\tSchool Name: " + mike.getSchoolName());

                //print the marks
                System.out.println("\n==== Marks for Trial Tests ====");
                for (int i = 0; i < mike.marks.length; i++) {
                    int j = 0;
                    j = j + i + 1;
                    System.out.println("\tMark #" + j + ": " + mike.getMark(i));
                }

                // calculate and print the average and min marks
                average = mike.calcAvg();
                System.out.println("\n\tAverage marks = " + average);
                System.out.println("\tMinimum marks = " + mike.findMin());
                break;

            default:
                //if user input other numbers
                System.out.println("\nInvalid number ! Please enter the number listed only.");
                return;
        }

        if (average < 30) {
            //Mr Hassan
            System.out.println("\n=========== Assigned Teacher ===========");
            System.out.println("\tTeacher's name: " + hsn.getFName() + hsn.getMName() + hsn.getLName());
            System.out.println("\tIC Number: " + hasan.getIC());
            System.out.println("\tAddress: " + hasan.getAddr());
            System.out.println("\tYears of Experience: " + hasan.getYearExp());
            System.out.println("\tQualification: " + hasan.isQualified());
        }

        else if (average >= 30 && average < 50) {
            //Mr Gopal
            System.out.println("\n=========== Assigned Teacher ===========");
            System.out.println("\tTeacher's name: " + gpl.getFName() + gpl.getMName() + gpl.getLName());
            System.out.println("\tIC Number: " + gopal.getIC());
            System.out.println("\tAddress: " + gopal.getAddr());
            System.out.println("\tYears of Experience: " + gopal.getYearExp());
            System.out.println("\tQualification: " + gopal.isQualified());
        }

        else if (average >= 50 && average < 70) {
            //Mr Li
            System.out.println("\n=========== Assigned Teacher ===========");
            System.out.println("\tTeacher's name: " + lee.getFName() + lee.getMName() + lee.getLName());
            System.out.println("\tIC Number: " + li.getIC());
            System.out.println("\tAddress: " + li.getAddr());
            System.out.println("\tYears of Experience: " + li.getYearExp());
            System.out.println("\tQualification: " + li.isQualified());
        }

        else if (average >= 70 && average < 80) {
            //Cikgu Minah
            System.out.println("\n=========== Assigned Teacher ===========");
            System.out.println("\tTeacher's name: " + min.getFName() + min.getMName() + min.getLName());
            System.out.println("\tIC Number: " + minah.getIC());
            System.out.println("\tAddress: " + minah.getAddr());
            System.out.println("\tYears of Experience: " + minah.getYearExp());
            System.out.println("\tQualification: " + minah.isQualified());
        }

        else if (average >= 80 && average <= 100) {
            //Mr Raju
            System.out.println("\n=========== Assigned Teacher ===========");
            System.out.println("\tTeacher's name: " + raj.getFName() + raj.getMName() + raj.getLName());
            System.out.println("\tIC Number: " + raju.getIC());
            System.out.println("\tAddress: " + raju.getAddr());
            System.out.println("\tYears of Experience: " + raju.getYearExp());
            System.out.println("\tQualification: " + raju.isQualified());
        }
        Database db = new Database ("db4free.net" , "3306" , "nordin" , "nrdinutp");
        db.connect();
        db.runQuery("select * from Student");
    }

}