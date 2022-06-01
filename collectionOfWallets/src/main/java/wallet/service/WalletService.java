package wallet.service;

import java.util.Iterator;
import java.util.List;

import wallet.model.CoinsInWallet;
import wallet.model.NotesInWallet;

public class WalletService {
	
	public int getallCoins(List coin) {
		
		int sum = 0;
		for (Iterator iterator = coin.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof CoinsInWallet) {
				CoinsInWallet new_name = (CoinsInWallet) object;
				sum+=new_name.getOneRupeeCoins();
				sum+=new_name.getTenRupeeCoins();
				sum+=new_name.getOneRupeeCoins();
				sum+=new_name.getOneRupeeCoins();
			}
			
		}
		
		return sum;
	}
	
public int getallNotes(List note) {
		
		int sum = 0;
		for (Iterator iterator = note.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof NotesInWallet) {
				NotesInWallet new_name = (NotesInWallet) object;
				sum+=new_name.getOneHundredRupeesNote();
				sum+=new_name.getTwoHundredRupeesNote();
				sum+=new_name.getFiveHundredRupeesNote();
				sum+=new_name.getTwoThousandRupeesNote();
			}
			
		}
		
		return sum;
	}
	
}
