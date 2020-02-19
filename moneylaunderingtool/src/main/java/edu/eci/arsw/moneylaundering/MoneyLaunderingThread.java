package edu.eci.arsw.moneylaundering;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;




public class MoneyLaunderingThread extends Thread{
	
	private int amountOfSuspectTransactions;
    private String account;
	private boolean pause;
    
    public MoneyLaunderingThread(String account, int cantidad) {
        this.account = account;
        this.amountOfSuspectTransactions = cantidad;
    }
    public void run(){
        AccountReporter.report(account, amountOfSuspectTransactions);
    }

	
	public synchronized void pause() {
		 pause=true;
	}
	
	public synchronized void reanudar() {
		this.notifyAll();
	}
}
