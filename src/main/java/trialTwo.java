public class trialTwo {
    public static void main(String[] args) {
        System.out.println(run_4(-11));
    }


    public static int run_4(int i){
        if(i<-10){
            i=10;
        }
        for ( i+=1;  i>=0; i--) {
            i+=2;

        }
        return i;
    }
}
