public class ConsecNumbers {

    public static String checkConsecNumbers(String string){
        int i;
        String[] split = string.split(",");
        //reading the numbers into int array;
        int length = split.length;
        int[] numbers = new int[length];
        for(i=0;i<length;i++){
            numbers[i] = Integer.parseInt(split[i]);
        }

        int check =  0;

        for(i=0;i<length-1;i++){

            int temp = numbers[i]-numbers[i+1];
            if(temp==1 || temp == -1){
                check = 1;
            }
            else
            {
                check=0;
                break;
            }
        }

        if(check==0)
        {
            return "numbers given are not consecutive";
        }
        else
        {
            return "numbers are consecutive";
        }



    }
}
