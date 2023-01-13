public class Student implements Comparable<Student> {
        private String firstName = "";
        private String lastName = "";
        private double score;

        public Student(String fname, String lname, double score) {
            this.score= score;
            firstName = fname;
            lastName = lname;
        }

        public Student() {
            firstName = "Bashshar";
            lastName ="Atif";
            score = 100;
        }

        public  String toString(){
            // Want Quazi:89.50
            return  String.format("%s: %.2f", firstName+" "+lastName,score);
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



    public static void main(String[] args) {
            Student ba = new Student();
            System.out.println(ba.toString());

    }

    @Override
    public int compareTo(Student sm){
            int comparison = 0;
            if((this.score)>(sm.score)){
                comparison = 1;
            }
            else if((this.score)<(sm.score)){
                comparison = -1;
            }else
                comparison = 0;

        return comparison;
    }
}




