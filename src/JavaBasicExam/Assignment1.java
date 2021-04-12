package JavaBasicExam;

public class Assignment1 {
    public static void main(String[] args) {
        boolean a=true,b=true,c=false;
        if(a&&b||b&&c||c&&a) {
            System.out.println("two out of three Boolean's are true");
        }
        else {
            System.out.println("two out of three Boolean's are not true");
        }
    }
}
