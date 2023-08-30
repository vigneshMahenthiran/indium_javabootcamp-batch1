package com.labs.java.core;

public class CmdLineArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length ==0) {
			System.out.println("no command line arguments passed");
//			return;
			System.exit(0);
		}
//		for(String arg: args) {
//			System.out.println(arg);
//		}
		for(int i=0; i< args.length;i++) {
//			System.out.println(args[i]);
			if(i==0) {
				System.out.println(args[i].length());
			}
			if(i==1) {
				System.out.println(args[i].toLowerCase());
			}
			if(i==2) {

				StringBuilder strBuilder = new StringBuilder(args[i]);
				System.out.println(strBuilder.reverse());
			}
			
			if(i==4) {
				System.out.println(args[i].substring(4, 12));
			}
			if(i==5) {
				String [] splitted = args[i].split(",");
				for(String split : splitted) {
					System.out.println(split);
				}
			}
		}
		
	}

}
