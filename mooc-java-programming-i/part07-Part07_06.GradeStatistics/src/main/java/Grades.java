import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> allGrades, passingGrades;

    public Grades(ArrayList<Integer> grades) {
        this.allGrades = grades;
        this.passingGrades = new ArrayList<>();
    }

    public double getAverage(ArrayList<Integer> grades) {
        return (double) getSum(grades) / grades.size();
    }

    public double getPassPercentage() {
        return (double) 100 * passingGrades.size() / allGrades.size();
    }

    public int getSum(ArrayList<Integer> grades) {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum;
    }

    private ArrayList<Integer> getPassing(ArrayList<Integer> grades) {
        for (int grade : grades) {
            if (grade >= 50) {
                passingGrades.add(grade);
            }
        }
        return passingGrades;
    }

    public String getGradeDistribution(ArrayList<Integer> grades) {
        String distro0 = "0: ";
        String distro1 = "1: ";
        String distro2 = "2: ";
        String distro3 = "3: ";
        String distro4 = "4: ";
        String distro5 = "5: ";
        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) < 50) {
                distro0 += "*";
            } else if (grades.get(i) < 60) {
                distro1 += "*";
            } else if (grades.get(i) < 70) {
                distro2 += "*";
            } else if (grades.get(i) < 80) {
                distro3 += "*";
            } else if (grades.get(i) < 90) {
                distro4 += "*";
            } else {
                distro5 += "*";
            }

        }
        return "Grade distribution: \n" +
                distro5 + "\n" +
                distro4 + "\n" +
                distro3 + "\n" +
                distro2 + "\n" +
                distro1 + "\n" +
                distro0 + "\n";
    }

    @Override
    public String toString() {
        passingGrades = getPassing(allGrades);
        String avg = "Point average (all): " + getAverage(allGrades);
        String passing = "Point average (passing): " + getAverage(passingGrades);
        if (passingGrades.size() == 0) {
            passing = "Point average (passing): -";
        }
        String passPercentage = "Pass percentage: " + getPassPercentage();
        return avg + "\n" + passing + "\n" + passPercentage + "\n" + getGradeDistribution(allGrades);
    }
}