package com.dasari.thread.deadlock;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	TreeNode parent = null;
	List<TreeNode> childeren = new ArrayList<>();

	public synchronized void addChild(TreeNode child) {
		if (!this.childeren.contains(child)) {
			this.childeren.add(child);
		}
	}
}
