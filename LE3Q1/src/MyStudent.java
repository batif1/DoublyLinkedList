public class MyStudent {
    private String firstName = "";
    private double score;

    public MyStudent(String name, double score) {
        this.score= score;
        firstName = name;
    }

    public MyStudent() {
        firstName = "Bashshar";
        score = 100;
    }




    public String toString(){
        // Want Quazi:89.50
        return  String.format("%s: %.2f", firstName,score);
    }
}


