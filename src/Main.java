public class Main {
    public static void main(String[] args){
        int studentAge=42;
        double studentGpa=5;

        String  studentFirstName="Jai";
        String  studentSecondtName="GuruDev";
        char studentFirstInitial=studentFirstName.charAt(2);
        char studentLastInitial=studentSecondtName.charAt(4);

        boolean hasPerfectAttendance=true;

        System.out.println(studentAge);
        System.out.println(studentGpa);

        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentSecondtName);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentFirstName+ " " +studentSecondtName+ " GPA is " + studentGpa );

    }
}




