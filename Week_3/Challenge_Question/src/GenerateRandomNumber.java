 class GenerateRandomNumber {

    int roll(){
         double random = Math.random()*6;
         return  (int)Math.ceil(random);
    }

    public static void main(String[] args) {
         GenerateRandomNumber dice =new GenerateRandomNumber();
        System.out.println(dice.roll());
    }
}
