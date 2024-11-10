class BreakAndContinue{
    public static void main(String[] args) {
//        System.out.println("Before Loop: ");
//        for(int i = 1;i < 1000;i++ ){
//            if(i == 101 ){
//                break;
//            }
//            System.out.print(i+" ");
//        }
//        System.out.println("\nOut of loop: ");
        System.out.println("Before Loop: ");
        for(int i = 1;i < 20;i++ ){
            if(i == 10 ){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("\nOut of loop: ");
    }
}