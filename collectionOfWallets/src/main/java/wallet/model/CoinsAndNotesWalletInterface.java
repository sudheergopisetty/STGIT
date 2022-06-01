package wallet.model;



public interface CoinsAndNotesWalletInterface {
	
	public abstract CoinsInWallet getallCoins(int oneRupeeCoins, int twoRupeeCoins, int fiveRupeeCoins, int tenRupeeCoins);
	public abstract NotesInWallet getallNotes(int tenRupeesNote, int twentyRupeesNote, int fiftyRupeesNote, int oneHundredRupeesNote,
			int twoHundredRupeesNote, int fiveHundredRupeesNote, int twoThousandRupeesNote);
}
