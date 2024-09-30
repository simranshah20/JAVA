class IfElse{
    public static void main(String[] args) {
        System.out.println("\n.......If___Else........\n");

        boolean isFemale=true;
        String name="Sita";

        System.out.println("Before If");

        if(isFemale){   //here isFemale condition is true so,it will print Mrs. Sita
            System.out.println("Mrs. "+name);
       }

        System.out.println("After if");


        System.out.println("\nAnother Exmaple: ");

         boolean isMale=false;
         String myName="Ram";

        System.out.println("Before If");
        if(isMale){   //here condition is false so else part will be executed
            System.out.println("MR. "+myName);
        }else{
            System.out.println("MRS. "+myName);
        }
        System.out.println("After IF");


        System.out.println("\nAnother example");
        boolean isSeniorCitizen=false;
        boolean isAdultCitizen=true;
        if(isSeniorCitizen){ //here condition is false so it will jump in else part
            System.out.println("Hello Senior Citizen");
        }else if(isAdultCitizen) {   //here condition is true so if part will be executed
            System.out.println("Hello Adult Citizen");
        }else{
            System.out.println("Hello child");
        }
    }
}
