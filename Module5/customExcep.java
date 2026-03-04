class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}

public class customExcep{
    static void age(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Minorrrrrr... Age should be above 18");
        }
        else{
            System.out.println("You can Vote");
        }
    }
    public static void main(String[] args){
        try{
            age(17);
        }catch(CustomException e){
            System.out.println("Custom exception caught: "+e.getMessage());
        }
    }
}