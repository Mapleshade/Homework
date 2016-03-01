package ru.kpfu.itis.group11506.shop;

public class Sorting {

	public  void priceSort(Product[] arr){	
		
	    for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	            if( arr[j].getPrise() > arr[j+1].getPrise() ){
	                Product tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
	    
	    System.out.println("this sort our products by price:");
	    for(int i = 0; i < arr.length; i ++) {
	    	System.out.println(arr[i].getName() + " that price " + arr[i].getPrise()
					+ " have rating " + arr[i].getRating());
	    }
	    System.out.println("for more information ask our consultant");
	}
	public void ratingSort(Product[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j].getRating() > arr[j + 1].getRating()) {
					Product tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println("this sort our products by rating:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(
					arr[i].getName() + " that price " + arr[i].getPrise() + " have rating " + arr[i].getRating());
		}
		System.out.println("for more information ask our consultant");
	}
}
