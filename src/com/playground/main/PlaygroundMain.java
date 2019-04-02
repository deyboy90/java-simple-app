package com.playground.main;

import com.beust.jcommander.JCommander;
import com.playground.config.ConfigParser;

public class PlaygroundMain{

	private void processParams(String[] args) {
		ConfigParser parser = new ConfigParser();

		JCommander.newBuilder()
		  .addObject(parser)
		  .build()
		  .parse(args);
		
		System.out.println(String.format("Participaing nodes: %s", parser.participatingNodes));
		System.out.println(String.format("Current node: %s", parser.currentNode));
		
		System.out.println("Starting operation");
		try {
			Thread.sleep(parser.timer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending operation");
		
		
	}
	
	public static void main(String[] args) {
		PlaygroundMain main = new PlaygroundMain();
		main.processParams(args);
	}
}
