public class sourceCode {

    public static void run(int i,int y){

        while ( i < 10) {


            if (i == 0 || i == 1) {
                System.out.println(i);
            }

            if (i == 2) {
                System.out.println(i);}
            if (i == 3) {
                System.out.println(i);
            }i = i + 1;}
        if(y+1<0){
            y=y+1;
        }if(y/2!=0){
            return;
        }

       y=10;
        while (i<y){
            y--;
            if(y!=9){



                for (int j =11; j > 1; j--) {
                    if(j!=9){
                        System.out.println(j);}
                    j+=2;
                    break;

                }
            }else{
                System.out.println(y);
                break;
            }
        }


    }
}
