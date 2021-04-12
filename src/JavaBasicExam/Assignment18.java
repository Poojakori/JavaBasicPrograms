package JavaBasicExam;

public class Assignment18 {
    public int lengthOfLastWord(final String a)
    {
        int len = 0;

        String x = a.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    public static void main(String[] args)
    {
        String input = "The length of first letter ";
        Assignment18 a = new Assignment18();
        System.out.println("The length of last word is " + a.lengthOfLastWord(input));
    }
}
