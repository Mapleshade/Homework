package ru.kpfu.itis.group11506.queueExample;

import java.util.Comparator;

public class SortedByRating  implements Comparator<Client>{
public int compare(Client client1, Client client2) {
	int rating1 = client1.getRating();
	int rating2 = client2.getRating();
	
	if(rating1 < rating2) {
		return 1;
	}
	else if (rating1 > rating2) {
		return -1;
	} else {
		return 0;
	}
}

}
