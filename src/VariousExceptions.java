public class VariousExceptions {

    public static void main(String[] args){
        int i=0;
        int[] array = null;
        int wrongsize = -1;
        int temp;
        int length = 3;
        for(i=0;i<length;i++){
            try{
                switch(i){
                    case 0:
                        temp=array[0]; // null point exception
                        break;
                    case 1:
                        array = new int[wrongsize]; // negative arraysize
                        break;
                    case 2:
                        array = new int[length];
                        int tem=array[length];//index outof bound
                        break;

                }
            }
            catch(NullPointerException e) {
                System.out.println("We have a nullpoint exception");
                e.printStackTrace();
            }
            catch (NegativeArraySizeException e){
                System.out.println("We have a negative array exception");
                e.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("We have index outof bound exception");
                e.printStackTrace();
            }
        }
    }
}
