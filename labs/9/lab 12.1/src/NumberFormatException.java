
public class NumberFormatException {
	public static void main(String[] args){
		try{
			//check number of strings passed
			if(args.length != 3){
				System.out.println("Usage: java Calculator operand1 operator"
						+ " operand2");
				System.exit(0);
			}
			int result = 0;
			//determine the operator
			switch(args[1].charAt(0)){
			case '+': 
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': 
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '.': 
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '/': 
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			
			}
			//Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] 
					+ " = " + result);
		}
		catch(Exception ex){
			System.out.println("Wrong operand type");
			System.exit(0);
		}
	}
}
