package ru.kpfu.itis.group11506.queueExample;


public class Waiter {
	
	private Cashier cashier;
	private int count = 0;
	
	public void handleOrder(Client client) {
		//TODO: выбрать наугад кассу и дать ей заказ. затем проверить 
		//длину очереди и передать ее в обработку.
		
		if(count != 10) {
		cashier.setClient(client);
		count++;
		} else {
			System.out.println("Слишком много заказов, необходимо обработать поступившие");
			Object[] clients = cashier.getClients();
			Kitchen kitchen = new Kitchen((Client[]) clients);
			kitchen.sort();
			kitchen.show();
		}
		
		
	}
}
