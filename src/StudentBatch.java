public class StudentBatch {

    //StudentBatch is a list of students registered in a StudentBatch
    //"list of students" is an array of Student

    //data
    private Student stud[] = new Student[10];
    private int currsz = 0; // current size

    //constructor
    public void StudentBatch() {

    }

    //operation
    public void add(Student s, int i) {

        stud[i] = s;
    }

    //method overloading
    public void add(Student s) {

        stud[currsz] = s;
        currsz++;
        //stud[n++] = s
    }

    // find a particular student
    /*boolean find(String name) {
        //loop thru the array students
        //for each student in students
        //check whether name is the same as that in student
        for (int i = 0; i < currsz; i++) {
            if (stud[i].name.equals(name))
                return true;
        }
        return false;
    }*/
}