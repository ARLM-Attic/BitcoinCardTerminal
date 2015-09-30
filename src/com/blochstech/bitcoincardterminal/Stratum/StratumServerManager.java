package com.blochstech.bitcoincardterminal.Stratum;

import java.util.LinkedList;

//Class for storing and finding valid Stratum server URLs automatically.
public class StratumServerManager {
	private static StratumServerManager instance;
	public static StratumServerManager Instance(){
		if(instance == null)
			instance = new StratumServerManager();
		return instance;
	}
	
	//Simple add/remove at failures/server gets etc..
	private LinkedList<String> serverUrls = new LinkedList<String>();
	
	//TODO: Persist server urls to disk later.
	
	public StratumServerManager(){
		serverUrls = new LinkedList<String>();
		serverUrls.add("tobias-neumann.eu");
		serverUrls.add("electrum.mindspot.org");
		serverUrls.add("wirerocks.infoha.us");
		serverUrls.add("electrum.bitfuzz.nl");
	}
	
	public String GetServer(){
		String tempRes = serverUrls.getFirst();
		return tempRes;
	}
	
	public void RemoveServer(){
		serverUrls.removeFirst();
	}
	
	public String StringRemoveAndGet(){
		RemoveServer();
		return GetServer();
	}
}
