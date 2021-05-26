package com.dasari.thread.swing;

import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	private JLabel count = new JLabel("0");
	private JLabel statusLabel = new JLabel("Task not completed");
	private JButton startButton = new JButton("Start");

	public MainFrame(String title) throws HeadlessException {
		super(title);
		setLayout(new GridBagLayout());
		GridBagConstraints bbc = new GridBagConstraints();
		bbc.fill = GridBagConstraints.NONE;
		bbc.gridx = 0;
		bbc.gridy = 0;
		bbc.weightx = 1;
		bbc.weighty = 1;
		add(count, bbc);

		bbc.gridx = 0;
		bbc.gridy = 1;
		bbc.weightx = 1;
		bbc.weighty = 1;
		add(statusLabel, bbc);

		bbc.gridx = 0;
		bbc.gridy = 2;
		bbc.weightx = 1;
		bbc.weighty = 1;
		add(startButton, bbc);

		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				start();
			}
		});

		setSize(200, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void start() {
		System.out.println("Start");
	}

}
