interface Sports {
    void sportsDetails();
}

interface Academic {
    void academicDetails();
}

class CollegeStudent implements Sports, Academic {

    public void sportsDetails() {
        System.out.println("Sports: Cricket");
    }

    public void academicDetails() {
        System.out.println("Academic: Java Programming");
    }

    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();

        s.sportsDetails();
        s.academicDetails();
    }
}
