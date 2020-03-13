import java.util.ArrayList;
import java.util.Scanner;

public class p40 {

    public static void main(String[] args) {

        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line("Jone", "Johnson", "Manager", "2016-12-31"));
        lines.add(new Line("Tou", "Xiong", "Software Engineer", "2016-10-15"));
        lines.add(new Line("Michaela", "Johnson", "Manager", "2015-12-19"));
        lines.add(new Line("Jake", "Johnson", "Manager", null));
        lines.add(new Line("Jacquelyn", "Johnson", "Manager", null));
        lines.add(new Line("Sally", "Weber", "Web Developer", "2015-12-18"));

//        lines.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        Scanner sc = new Scanner(System.in);
        String searchedName = Util.promptData("Enter a search string", sc);
        lines.stream().map(a -> (a.firstName + " " + a.lastName + " | " + a.position + " | " + a.separationDate)).filter(a -> a.contains(searchedName)).forEach(System.out::println);
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
