public class loops {
    public static void main(String[] args) {
        // int i = 1;
        // while(i<=4){
        //     System.out.println("Hi " + i);
        //     i++;
        // }

        // int i = 1;
        // do{
        //     System.out.println("Hi " + i);
        //     i++;
        // }
        // while(i<=4);
           
        for(int i=0;i<5;i++){
            System.out.println("Day "+ (i+1));

            for(int j=9;j<=18;j++){
                if(j>12){
                    System.out.println(j-12 + "pm");
                }
                else{
                    System.out.println(j + "am");
                }
            }
        }


        
    }
}

// if we the exact number of iterations we use for loop . db , files etc etc ke liye while loop use karte hein.