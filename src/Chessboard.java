public class Chessboard {
    public static void main(String[] args){

       String white = "WW|";
       String Black = "BB|";
       int prev = 0;
       String[][]Chess = new String[8][8];
       int i,j;
       for(i=0;i<8;i++)
       {
           for(j=0;j<8;j++)
           {
               if(prev==0){
                   Chess[i][j]=white;
                   prev=1;
               }
               else{
                   Chess[i][j]=Black;
                   prev=0;
               }
           }
           String temp="";
           temp=white;
           white=Black;
           Black=temp;
       }

    for(i=0;i<8;i++){
        String tem = "";
        for(j=0;j<8;j++){
            tem = tem + Chess[i][j];
        }
        System.out.println(tem);
    }
    }
}
