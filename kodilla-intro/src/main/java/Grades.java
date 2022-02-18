public class Grades {
    private int grades[];
    private int size;

    public Grades() {
        this.grades = new int [10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade() {
        System.out.println(this.grades[this.grades.length-1]);
    }

    public void averageGrade() {
        int sum = 0;

        for (int i = 0; i < this.grades.length; i++) {
            sum = sum + this.grades[i];
        }

        System.out.println(sum / grades.length);
    }
}