package wallet.model;

import java.util.List;

public class Wallet {
	private int walletId;
	private int walletName;
	private List coins;
	private List notes;
	public Wallet() {
		super();
		
	}
	public Wallet(int walletId, int walletName, List coins, List notes) {
		super();
		this.walletId = walletId;
		this.walletName = walletName;
		this.coins = coins;
		this.notes = notes;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public int getWalletName() {
		return walletName;
	}
	public void setWalletName(int walletName) {
		this.walletName = walletName;
	}
	public List getCoins() {
		return coins;
	}
	public void setCoins(List coins) {
		this.coins = coins;
	}
	public List getNotes() {
		return notes;
	}
	public void setNotes(List notes) {
		this.notes = notes;
	}
	
	
	
	
}
