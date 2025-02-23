import java.util.ArrayList;

public class Point {
    private ArrayList<Integer> points ;
    private int zero = 0;
    private int one = 0;
    private int two = 0;
    private int three = 0;
    private int four = 0;
    private int five = 0;
    public Point(){
        this.points = new ArrayList<>();
    }

    public void addPoints(int point){
        if(point<101 && point>-1){
            this.points.add(point);
        }
    }

    public int sizePoints(){
        return this.points.size();
    }
    public double averagePoints(){
        int avg = 0;
        for(int point: this.points){
            avg = avg + point;
        }
        return 1.0*avg/this.points.size();
    }

    public void gradeDistribution(){
        for (int i=0; i<this.points.size();i++){
            if(this.points.get(i)<50){
                zero++;
            }else if(this.points.get(i)<60){
                one++;
            }else if(this.points.get(i)<70){
                two++;
            }else if(this.points.get(i)<80){
                three++;
            }else if(this.points.get(i)<90){
                four++;
            }  else{
                five++;
            }
        }
    }

    public String stars(int number){
        String star="";
        while(number>0){
            star = star+"*";
            number--;
        }
        return star;
    }

    public void printGrade(){
        System.out.println("Grade distribution:");
        System.out.println("5: "+this.stars(five));
        System.out.println("4: "+this.stars(four));
        System.out.println("3: "+this.stars(three));
        System.out.println("2: "+this.stars(two));
        System.out.println("1: "+this.stars(one));
        System.out.println("0: "+this.stars(zero));

    }

}
