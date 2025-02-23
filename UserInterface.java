import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Point points;

    public UserInterface(Scanner scanner, Point points){
        this.scanner = scanner;
        this.points = points;
    }

    public void start(){
        int count = 0;
        Point pass = new Point();
        while(true){
            int input = Integer.valueOf(this.scanner.nextLine());
            if(input==-1){
                break;
            }
            this.points.addPoints(input);
            if(input>=50){
                pass.addPoints(input);
            }

        }
        this.points.gradeDistribution();
        System.out.println("Point average (all): "+this.points.averagePoints());
        System.out.println("Point average (passing): "+pass.averagePoints());
        System.out.println("Pass percentage: "+100.0*pass.sizePoints()/this.points.sizePoints());
        this.points.printGrade();
    }
}
