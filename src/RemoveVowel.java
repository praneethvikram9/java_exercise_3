public class RemoveVowel {

    public static String[] deleteVowel(String[] array){
        int length = array.length;
        int i;
        String[] result = new String[length];
        for(i=0;i<length;i++){
            String temp = "";
            temp=array[i].replace("a","");
            array[i]=temp;
            temp=array[i].replace("e","");
            array[i]=temp;
            temp=array[i].replace("i","");
            array[i]=temp;
            temp=array[i].replace("o","");
            array[i]=temp;
            temp=array[i].replace("u","");
            array[i]=temp;
            result[i]=array[i];
        }
        return result;
        




    }
}
