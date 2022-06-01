package wallet.model;

public class CoinsInWallet  {

	/*
	 * @Override public CoinsInWallet getallCoins(int oneRupeeCoins, int
	 * twoRupeeCoins, int fiveRupeeCoins, int tenRupeeCoins) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public NotesInWallet getallNotes(int tenRupeesNote, int
	 * twentyRupeesNote, int fiftyRupeesNote, int oneHundredRupeesNote, int
	 * twoHundredRupeesNote, int fiveHundredRupeesNote, int twoThousandRupeesNote) {
	 * // TODO Auto-generated method stub return null; }
	 */

	
	 private int oneRupeeCoins; 
	 private int twoRupeeCoins; 
	 private int
	fiveRupeeCoins; 
	 private int tenRupeeCoins; 
	 public CoinsInWallet() { 
		 super();
	 
	 } 
	 public CoinsInWallet(int oneRupeeCoins, int twoRupeeCoins, int fiveRupeeCoins, int tenRupeeCoins) { 
		 super(); 
		 this.oneRupeeCoins = oneRupeeCoins; 
		 this.twoRupeeCoins = twoRupeeCoins; 
		 this.fiveRupeeCoins = fiveRupeeCoins; 
		 this.tenRupeeCoins = tenRupeeCoins; 
		 } 
	 public int getOneRupeeCoins() { 
		 return oneRupeeCoins; 
		 } 
	 public void setOneRupeeCoins(int oneRupeeCoins) { 
		 this.oneRupeeCoins = oneRupeeCoins; 
		 } 
	 public int getTwoRupeeCoins() { 
		 return twoRupeeCoins;
		 } 
	 public void setTwoRupeeCoins(int twoRupeeCoins) { 
		 this.twoRupeeCoins = twoRupeeCoins; 
		 } 
	 public int getFiveRupeeCoins() { 
		 return fiveRupeeCoins;
		 } 
	 public void setFiveRupeeCoins(int fiveRupeeCoins) { 
		 this.fiveRupeeCoins = fiveRupeeCoins;
	  } 
	 public int getTenRupeeCoins() {
		 return tenRupeeCoins; 
		 } 
	 public void setTenRupeeCoins(int tenRupeeCoins) { 
		 this.tenRupeeCoins = tenRupeeCoins; 
		 }
	  
	 
}
