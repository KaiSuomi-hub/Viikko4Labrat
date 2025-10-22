package viikko4.lab;

import java.util.LinkedList;

public class StudentRegister {
    // l7
    private final LinkedList<Student> students = new LinkedList<>();

    public void add(String n, Integer c) {
        if (n == null || n.isBlank() || c == null || c < 0) {
            throw new IllegalArgumentException("Ei kelpaa!");
        }
        students.add(new Student(n, c));
    }
    // L8
    public LinkedList<Student> searchByName(String q) {
        LinkedList<Student> result = new LinkedList<>();
                if (q == null || q.isBlank()) {
            return result;
        }
        String needle = q.toLowerCase();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(needle)) {
                result.add(s);            }
        }
        return result;
    }

        // L9
        public LinkedList<Student> searchCreditsLessThan(int x) {
            LinkedList<Student> result = new LinkedList<>();
            for (Student s : students) {
                if (s.getCredits() < x) {
                    result.add(s);
                }
            }
            return result;
        }

        public LinkedList<Student> searchCreditsGreaterOrEqual(int x) {
            LinkedList<Student> result = new LinkedList<>();
            for (Student s : students) {
                if (s.getCredits() >= x) {
                    result.add(s);
                }
            }
            return result;
        }

}
