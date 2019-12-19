package prob_final2.prob1;

//DO NOT MODIFY IN ANY WAY
class Account {
	
		private double balance;
		private String aid; // Account id
		private AccountType acctType;
		private Employee employee;
		private final String temp = "12345";
		private static int v1 = 25, v2=38;
		Account(Employee emp, AccountType acctType, double balance){
			employee = emp;
			this.acctType =acctType;
			this.balance = balance;
			this.aid = generateID();
		}
		
		public String getAid(){
			return aid;
		}
		public double getBalance() {
			return balance;
		}
		public String generateID(){
			v1++;
			v2++;
			return temp+v1+v2;
		}
		public AccountType getAcctType() {
			return acctType;
		}
		public String toString() {
			return employee + " Acc-Id =" + aid +" type = "+acctType+", balance = "+balance;
		}

		public void makeDeposit(double deposit) {
			balance += deposit;
		}
		public boolean makeWithdrawal(double amount) {
			if(amount <= balance) {
				balance -= amount;
				return true;
			}
			return false;
		}
	}

