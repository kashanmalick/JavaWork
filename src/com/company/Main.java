package com.company;

public class Main {

    protected static int i=0;

    public static void main(String[] args) {
	// write your code here

        // Print Statement
        System.out.println("Hello World");

        // Loop
        for (i=0;i<10;i++)
        {
            System.out.println(i +" Hello World ");
        }
        // Concatenation
        String name = "Kashan";
        int age = 10;
        System.out.println(name + age);
        //Conditional Statement
        i =0;
        if(i==0){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
//Getting Name through Getter Setter
        UserModel userModelAllData = new UserModel(0001,"Kashan","ZafarAlam",24,"Male",424015259);
        UserModel userModelCompsalry = new UserModel("Tariq","Abdul Bari",424015266);
        System.out.println("User Code is : "+userModelAllData.getCode());
        System.out.println("User Name is : "+userModelAllData.getName());
        System.out.println("User Father Name is : "+userModelAllData.getFname());
        System.out.println("User Age is : "+userModelAllData.getAge());
        System.out.println("User Gender is : "+userModelAllData.getGender());
        System.out.println("User CNIC # is : "+userModelAllData.getCnic());
        System.out.println("USER Complsary Information");
        System.out.println("User Name is : "+userModelCompsalry.getName());
        System.out.println("User Father Name is : "+userModelCompsalry.getFname());
        System.out.println("User CNIC NO is : "+userModelCompsalry.getCnic());

    }
}
