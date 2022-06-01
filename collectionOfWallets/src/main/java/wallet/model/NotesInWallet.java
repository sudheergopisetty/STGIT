package wallet.model;

public class NotesInWallet {
	private int tenRupeesNote;
	private int twentyRupeesNote;
	private int fiftyRupeesNote;
	private int oneHundredRupeesNote;
	private int twoHundredRupeesNote;
	private int fiveHundredRupeesNote;
	private int twoThousandRupeesNote;
	public NotesInWallet() {
		super();
		
	}
	public NotesInWallet(int tenRupeesNote, int twentyRupeesNote, int fiftyRupeesNote, int oneHundredRupeesNote,
			int twoHundredRupeesNote, int fiveHundredRupeesNote, int twoThousandRupeesNote) {
		super();
		this.tenRupeesNote = tenRupeesNote;
		this.twentyRupeesNote = twentyRupeesNote;
		this.fiftyRupeesNote = fiftyRupeesNote;
		this.oneHundredRupeesNote = oneHundredRupeesNote;
		this.twoHundredRupeesNote = twoHundredRupeesNote;
		this.fiveHundredRupeesNote = fiveHundredRupeesNote;
		this.twoThousandRupeesNote = twoThousandRupeesNote;
		
		
	}
	public int getTenRupeesNote() {
		return tenRupeesNote;
	}
	public void setTenRupeesNote(int tenRupeesNote) {
		this.tenRupeesNote = tenRupeesNote;
	}
	public int getTwentyRupeesNote() {
		return twentyRupeesNote;
	}
	public void setTwentyRupeesNote(int twentyRupeesNote) {
		this.twentyRupeesNote = twentyRupeesNote;
	}
	public int getFiftyRupeesNote() {
		return fiftyRupeesNote;
	}
	public void setFiftyRupeesNote(int fiftyRupeesNote) {
		this.fiftyRupeesNote = fiftyRupeesNote;
	}
	public int getOneHundredRupeesNote() {
		return oneHundredRupeesNote;
	}
	public void setOneHundredRupeesNote(int oneHundredRupeesNote) {
		this.oneHundredRupeesNote = oneHundredRupeesNote;
	}
	public int getTwoHundredRupeesNote() {
		return twoHundredRupeesNote;
	}
	public void setTwoHundredRupeesNote(int twoHundredRupeesNote) {
		this.twoHundredRupeesNote = twoHundredRupeesNote;
	}
	public int getFiveHundredRupeesNote() {
		return fiveHundredRupeesNote;
	}
	public void setFiveHundredRupeesNote(int fiveHundredRupeesNote) {
		this.fiveHundredRupeesNote = fiveHundredRupeesNote;
	}
	public int getTwoThousandRupeesNote() {
		return twoThousandRupeesNote;
	}
	public void setTwoThousandRupeesNote(int twoThousandRupeesNote) {
		this.twoThousandRupeesNote = twoThousandRupeesNote;
	}
	
}
