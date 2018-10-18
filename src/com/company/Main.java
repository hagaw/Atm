package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 3;
        Scanner sc = new Scanner(System.in);


        //===================================================================================================================

        //pin and account number for each customers

        ArrayList<Accounts> myCastomerAccount = new ArrayList<>();
        myCastomerAccount.add(new Accounts("melisa", "pnm123", "anm123", 200));
        myCastomerAccount.add(new Accounts("Jesmy", "pnj123", "anj123", 300));
        myCastomerAccount.add(new Accounts("hailu", "pnh123", "anh123", 0));

      //========================================================================================================================




        boolean matchFound = false;

            do {

                counter--;

                System.out.println(counter);

                System.out.println("enter your pin number");
                String userInputPinNumber = sc.next();
                System.out.println("enter your account number");
                String userInputAccountNumber = sc.next();


                for (Accounts newAccount : myCastomerAccount) {

                    if (userInputPinNumber.equalsIgnoreCase(newAccount.getPinNumber()) && userInputAccountNumber.equalsIgnoreCase(newAccount.getAccountNumber())) {

                        System.out.println("YOU LOGED IN");

                        System.out.println("do you want to do deposit or Withrawal ? ");


                        String userInputAnswr=sc.next();

                        double totalBalnce=0;

                        if (userInputAnswr.equalsIgnoreCase("d")){



                            System.out.println("enter your Deposit today");
                            double userInputDeposit=sc.nextDouble();

                            totalBalnce=newAccount.getAccountBalance()+userInputDeposit ;


                            System.out.println("==============================================");
                            System.out.println("Begining balance" + newAccount.getAccountBalance());
                            System.out.println("Account Number "+ userInputAccountNumber);
                            System.out.println("Your deposit today is "+ userInputDeposit);
                            //System.out.println("Your today withdrawa is " + userInputWithdowal);
                            System.out.println("your balance is " + totalBalnce);


                        }else if (userInputAnswr.equalsIgnoreCase("w")){

                            System.out.println("enter your today withdrawl");
                            double userInputWithdowal=sc.nextDouble();
                            totalBalnce=newAccount.getAccountBalance()-userInputWithdowal;

                            System.out.println("==============================================");
                            System.out.println("Begining balance" + newAccount.getAccountBalance());
                            System.out.println("Account Number "+ userInputAccountNumber);
                           // System.out.println("Your deposit today is "+ userInputDeposit);
                            System.out.println("Your today withdrawa is " + userInputWithdowal);
                            System.out.println("your balance is " + totalBalnce);


                        }



           //=======================================================================
                        matchFound = true;
                        }
                }

                if(matchFound){
                    break;
                }
            //============================================================================

                System.out.println("you entered wrong pin ps try again");

            }

            while (counter>0);
            if (counter==0){
                System.out.println("your setion expired try later");


            }




        }

        }




