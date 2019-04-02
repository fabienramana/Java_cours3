
class main{

    public static void main(String[] args){
        
        int a = 0, b = 0, numberPGCD = 0;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            
            numberPGCD = calculatePGCD(a, b);

            System.out.println(numberPGCD);
        }
        catch(NumberFormatException e){
            System.out.println("L'argument donné n'est pas une nombre !");
        }
    }

    public static int calculatePGCD(int a, int b){
        int reste = 0;
        reste = a % b;
        if(reste != 0){
        return calculatePGCD(b,reste);
        }
        else{
            return java.lang.Math.abs(b);
        }
    }

}