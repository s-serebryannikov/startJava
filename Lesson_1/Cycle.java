public class Cycle{
    public static void main(String[] args){
        for(int i = 0; i <= 20; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int i = 6;
        while (i>=-6){
            System.out.print(i+" ");
            i--;
        }
        System.out.println();
        int j = 10;
        int sum = 0;
        do{
            if(j % 2!=0){
                sum+=j;
            }
            j++;
        }while (j<=20);
        System.out.println(sum);
    }
}