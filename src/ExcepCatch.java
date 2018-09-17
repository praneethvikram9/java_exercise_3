
class newException extends Exception{


    public newException(String string){

        System.out.println("exception from " + string);

    }
}

public class ExcepCatch {



    public static void main(String[] args){



        try{
            throw new newException(" main");
        }

        catch (newException e)
        {
            System.err.println("newException caught");
            e.getStackTrace();

        }
        finally {
            System.out.println("in the final");
        }

    }
}
