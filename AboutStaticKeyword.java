class Student {
    String name;
    static String school;
    /*
     * Ekhane bishoy ta hocche je
     * every student'r jonno school name to ar different hbe na.
     * joto bar e Student class'r jonno object banabo shob khane ei School
     * property'r value ta same thakbe
     * so er jonne ei property ta static
     */

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class AboutStaticKeyword {
    public static void main(String args[]) {
        Student.school = "DGBHS";
        /*
         * ebhabe amra directly class'r static property ke access korte parbo
         * 
         */

        Student student1 = new Student();
        student1.name =  "Tahmid";
        System.out.println(student1.school); // Output: DGBHS
    }
}
