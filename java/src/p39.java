import java.util.ArrayList;
import java.util.Comparator;

/**
 * 레코드 정렬
 *
 */
public class p39 {

    public static void main(String[] args) {

        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line("Jone", "Johnson", "Manager", "2016-12-31"));
        lines.add(new Line("Tou", "Xiong", "Software Engineer", "2016-10-15"));
        lines.add(new Line("Michaela", "Johnson", "Manager", "2015-12-19"));
        lines.add(new Line("Jake", "Johnson", "Manager", null));
        lines.add(new Line("Jacquelyn", "Johnson", "Manager", null));
        lines.add(new Line("Sally", "Weber", "Web Developer", "2015-12-18"));

//        lines.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        lines.sort(Comparator.comparing(o -> o.lastName));
        lines.forEach(a -> System.out.println(a.toString()));
    }

    static class Line {
        private String firstName;
        private String lastName;
        private String position;
        private String separationDate;

        public Line(String firstName, String lastName, String position, String separationDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
            this.separationDate = separationDate;
        }

        @Override
        public String toString() {
            return firstName + lastName + "|" + position + "|" + separationDate;
        }
    }
}
