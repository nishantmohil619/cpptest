import java.io.Console;

class waterdrink
{ 
		public static void main(String args[]) 
	{ 
		String str; 
          
        //Obtaining a reference to the console. 
        Console con = System.console(); 
          
        // Checking If there is no console available, then exit. 
        if(con == null)  
        { 
            System.out.print("No console available"); 
            return; 
        } 
          
        // Read a string and then display it. 
        str = con.readLine("Enter your name: "); 
        con.printf("Here is your name: %s\n", str);
  
        //to read password and then display it 
        System.out.println("Enter the password: "); 
        char[] ch=con.readPassword(); 
  
        //converting char array into string 
        String pass = String.valueOf(ch); 
		System.out.println("Password is: " + pass); 
		//add quntity of water
		String qtOfWater = con.readLine("Enter your amount of water in take  ");
		int qw = Integer.parseInt(qtOfWater);
		System.out.printf("%s  is add into your acount \n", qw);
		//addingit int o the totle 
		int toWa = 0;
		if(qw == 0){
			System.out.printf("AAA add the a valid input like a number");
		
		}else{
		toWa = toWa + qw;
		System.out.printf("[ %s ] is the total amount \n", toWa);
	}
	} 
	
} 
