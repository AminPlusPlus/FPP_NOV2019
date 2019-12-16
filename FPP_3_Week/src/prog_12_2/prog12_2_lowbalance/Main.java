package prog_12_2.prog12_2_lowbalance;

public class Main {

	public static void main(String[] args)  {
		Account a = new Account(null);

			try {
				
				try {
					int b = 1/0;
				}catch (ArithmeticException e) {
					System.out.println(e.getLocalizedMessage());
				}
				finally {
					
					try {
						int b = 1/0;
					}
					catch (ArithmeticException e) {
						System.out.println("nested neted");
						System.out.println(e.getLocalizedMessage());
					}
					finally {
						System.out.println("nested neted");
						
						//System.exit(0);
					}
					
					System.out.println("Inside Finaly");
				}
			
				a.setStartBalance(15);
			
			
			} catch (LowBalanceException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("Exception Out Nest " + e.getMessage());
			}
			finally {
				System.out.println("Out Neste Finally");
			}
		
			
			
			
	
	
	}

}
