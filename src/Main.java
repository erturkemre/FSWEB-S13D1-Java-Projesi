
public class Main {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);

        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);


        area(5.0, 4.0);
        area(-1.0, 4.0);

        area(5.0);
        area(-1);

    }
    public static boolean shouldWakeUp(boolean barking, int hour){
        if(barking) {
            if(hour<0 || hour > 23){
                System.out.println("false");
                return false;
            } else if (hour<8 || hour>20) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static boolean hasTeen(int... years) {
        for(int i=0; i<years.length;i++){
            if(years[i]>=13 && years[i]<=19){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            if(temp>=25 && temp <= 45){
                System.out.println("true");
                return true;
            }
        } else if (temp>=25 && temp <= 35) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static double area(double longEdge, double shortEdge ) {
        if(longEdge<0 || shortEdge<0){
            System.out.println("-1");
            return -1;
        }else{
            double result = longEdge*shortEdge;
            System.out.println(result);
            return result;
        }

    }
    public static double area(double radius) {
        if(radius<0){
            System.out.println(-1);
            return -1;
        }else {
            double result = radius*radius*Math.PI;
            System.out.println(result);
            return result;
        }

    }
}