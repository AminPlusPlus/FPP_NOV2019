package prog_12_2.prog12_2_lowbalance;

public class Main {

	public static void main(String[] args)  {
		Account a = new Account(null);

			try {
				a.setStartBalance(15);
			} catch (LowBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	
	}

}
