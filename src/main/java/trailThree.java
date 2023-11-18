public class trailThree {
    public static void main(String[] args) {
        System.out.println( run_3(0,0));
    }

    public static int run_3(int x,int y){

        if (x<=0){
            y=0;
        }
        if (y<=0){
            x=0;
            y=y*-1;
        }
        int count =0;
        while ((x+1)/(y+1) >=0){
            x=x/2;
            y=y/3;
            count++;
        }
        return count;
    }
}
