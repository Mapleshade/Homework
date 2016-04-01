package ru.kpfu.itis.group11506.queueExample;

public class Cashier {
	
	RealizePriortyQueue<Client> queueClients = new RealizePriortyQueue<>();
	//private int countOrder = 0;
	
	public void setClient(Client client) {
		queueClients.push(client);
		//countOrder++;
		
	}
	
	//public int getCount() {
	//	return countOrder;
	//}
	public Object[] getClients() {
		return queueClients.getArray();
	}
}
