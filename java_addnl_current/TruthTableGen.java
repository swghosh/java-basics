import java.util.Scanner;
    public class TruthTableGen {
        boolean arr[][];
        boolean b=false;
        boolean[][] gettt(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<(Math.pow(2,n));j++){

                        if(j<Math.pow(2,n-1)){
                            arr[j][i]=b;
                        }
                        else{
                            arr[j][i]=!b;
                        }
                }
                }
                return(arr);
            }


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Input values count");
            TruthTableGen tt=new TruthTableGen();
            int num=sc.nextInt();int pownum=(int)Math.pow(2,num);
            boolean array[][]=new boolean[pownum][num];
            array=tt.gettt(num);
            for(int i=0;i<num;i++){
            for(int j=0;j<(Math.pow(2,num));j++){

                    System.out.println(array[j][i]);
                }
        }
    }
    }
