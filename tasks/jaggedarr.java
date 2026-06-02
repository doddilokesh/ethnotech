public class jaggedarr {
    public static void main(String[] args) {
        int[][] marks = new int[3][5];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = (i + 1) + (j + 1);
            }
        }
        System.out.println("Marks of 3 Students in 5 Subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
        }
    }
}
