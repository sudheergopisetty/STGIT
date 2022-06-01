package wallet.main;

import java.util.ArrayList;
import java.util.List;

import wallet.model.CoinsInWallet;
import wallet.model.NotesInWallet;
import wallet.model.Wallet;
import wallet.service.WalletService;

public class WalletDetails {

	public static void main(String[] args) {
		
		CoinsInWallet coinsInWallet1 = new CoinsInWallet(1, 2, 5, 10);
		CoinsInWallet coinsInWallet2 = new CoinsInWallet(1, 2, 5, 10);
		CoinsInWallet coinsInWallet3 = new CoinsInWallet(1, 2, 5, 10);
		
		List coinList = new ArrayList();
		coinList.add(coinsInWallet1);
		coinList.add(coinsInWallet2);
		coinList.add(coinsInWallet3);
		
		NotesInWallet notesInWallet = new NotesInWallet(10, 20, 50, 100, 200, 500, 2000);
		
		List notesList = new ArrayList();
		notesList.add(notesInWallet);
		
		Wallet wallet = new Wallet();
		wallet.setCoins(coinList);
		wallet.setNotes(notesList);
		
		List walletList =new  ArrayList();
		walletList.add(wallet);
		
		WalletService walletService = new WalletService();
		int c = walletService.getallCoins(coinList);
		int n = walletService.getallNotes(notesList);
		System.out.println("no of coins " + c);
		System.out.println("no of notes " + n);
		
	}

}
