 package com.sltc.soa.client;
import com.sltc.soa.client.stub.DemoWS;
import com.sltc.soa.client.stub.DemoWSService;

import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
//         URL url = new URL("http://demowebservice.com:8080/currencyservice?wsdl");
//        DemoWSService = new DemoWSService(url);

        boolean menu=true;

        while (menu)
        {
            System.out.println( " 1) Currency conversion\n 2) Exit" );
            float result= readAmountInput();

            if(result==1){

                converter();

            }
            else if (result==2){

                menu=false;


            }
            else
            {
                System.out.println( "Invalid input" );
            }

            System.out.println( "" );

        }

    }

    private static int converter()
    {
        DemoWSService demoWSService = new DemoWSService();
        DemoWS demoWSPort = demoWSService.getDemoWSPort();


        System.out.println( "Enter code of source Currency" );
        String currencyFrom = readString();

        System.out.println( "Enter code of target Currency" );
        String currencyTo = readString();

        System.out.println( "Enter amount to convert" );
        float amount = readAmountInput();

        float result = demoWSPort.currencyConverter( amount, currencyFrom , currencyTo);

        if(result==-1){
            System.out.println( "Invalid input");
        }
        else {
            System.out.println( currencyTo+" " + result );
        }

        return 0;
    }

    private static String readString()
    {
        Scanner scan = new Scanner( System.in );
        String strInput = scan.next();
        return strInput;
    }

    private static float readAmountInput()
    { boolean isNum = false;
        float intNum = 0;

        Scanner scan = new Scanner( System.in );
      while( !isNum )
        {
            System.out.println( "Enter amount" );
            String inputStr = scan.next();
            try
            {
                intNum = Float.valueOf( inputStr );
                isNum = true;
            }
            catch( Exception e )
            {
                System.out.println( "Invalid input " + inputStr + ". Please input a number." );
            }

        }
        return intNum;
    }




}