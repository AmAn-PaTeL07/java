public class arraymaxmarks {
    public static void main(String[] args) {
        int[] a = { 85, 92, 78, 90, 88 };
        String[] b = {"Ram", "Shyam", "Mohan", "Sita", "Gita"};
        int maxMarks = a[0];
        int name = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxMarks) {
                maxMarks = a[i];
                name = i;
            }
        }
        System.out.println("Maximum marks: " + maxMarks + " scored by " + b[name]);
    }
    
}
