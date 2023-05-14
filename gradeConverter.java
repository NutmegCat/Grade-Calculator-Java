//Aaron Prince Anu

class gradeConverter{
    
    //initialize vars
    static char A = 'A';
    static char B = 'B';
    static char C = 'C';
    static char D = 'D';
    static char F = 'F';
    static char X = 'X';

    public static void main(String[] args) {
        
        //ask for current grade
        System.out.println("\nWhat is your current grade?");
        convertToGrade(In.getInt());
    }

    public static void convertToGrade(int usermark) {
        
        //grade range into character
        if (80 <= usermark && usermark <= 100) {
            System.out.println("\nYou have a: " + A + "\n");
        } else if (70 <= usermark && usermark <= 79){
            System.out.println("\nYou have a: " + B + "\n");
        } else if (60 <= usermark && usermark <= 69) {
            System.out.println("\nYou have a: " + C + "\n");
        } else if (50 <= usermark && usermark <= 59) {
            System.out.println("\nYou have a: " + D + "\n");
        } else if (0 <= usermark && usermark <= 49) {
            System.out.println("\nYou have a: " + F + "\n");
        } else {
            System.out.println("\nYou have an: " + X + "\n");
        }
    }
}