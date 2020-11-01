public class Reverse {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);
        puzzle.append("vaJ$").subSequence(0,4);

    }
}
