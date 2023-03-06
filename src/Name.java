public class Name {

    //data
    private String fname;
    private String mname;
    private String lname;

    //methods
    //constructor = no return, name same as the class
    public Name (String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public Name () {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getFName () {
        return fname;
    }

    public String getMName () {
        return mname;
    }
    public String getLName () {
        return lname;
    }

    public void setFirstName (String fname) {
        this.fname = fname;
    }

    public void setMidName (String mname) {
        this.mname = mname;
    }

    public void setLastName (String lname) {
        this.lname = lname;
    }
}
