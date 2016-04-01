package ru.kpfu.itis.group11506.queueExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RealizePriortyQueue<Client> some = new RealizePriortyQueue<>();
		some.push(new Client("", 2));
		some.push(new Client("", 1));
		some.push(new Client("", 3));
		
		System.out.println(some.peek());
		some.poll();
		System.out.println(some.peek());
		
		/*Client[] c = new Client[4];
		c[0] = new Client("кофе",1);
		c[1] = new Client("чизкейк",3);
		c[2] = new Client("борщ",2);
		c[3] = new Client("омлет",3);
		
		Kitchen kitchen = new Kitchen(c);
		kitchen.sort();
		kitchen.show();
		
		Waiter waiter = new Waiter();
		waiter.handleOrder(new Client("1",1));
		waiter.handleOrder(new Client("11",2));
		waiter.handleOrder(new Client("10",4));
		waiter.handleOrder(new Client("9",3));
		waiter.handleOrder(new Client("8",5));
		waiter.handleOrder(new Client("7",6));
		waiter.handleOrder(new Client("6",8));
		waiter.handleOrder(new Client("5",7));
		waiter.handleOrder(new Client("4",9));
		waiter.handleOrder(new Client("3",10));
		waiter.handleOrder(new Client("2",11));*/
		
	}

}
