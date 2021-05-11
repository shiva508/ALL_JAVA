package com.dasari.thread.synchronization;

import java.util.ArrayList;
import java.util.List;

public class CrawledSites {
	private List<String> crawledSites = new ArrayList<>();
	private List<String> linkedSites = new ArrayList<>();

	public void add(String site) {
		synchronized (this) {
			if (!crawledSites.contains(site)) {
				linkedSites.add(site);
			}
		}
	}
	public String next() {
		
		if(linkedSites.size()==0) {
			return null;
		}
		synchronized (this) {
			if(linkedSites.size()>0) {
				String s=linkedSites.get(0);
				linkedSites.remove(0);
				linkedSites.add(s);
				return s;
			}
			return null;
		}
	}
}
