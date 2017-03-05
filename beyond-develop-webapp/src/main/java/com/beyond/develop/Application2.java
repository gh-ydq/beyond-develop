package com.beyond.develop;

import java.util.Arrays;

public class Application2 {
		
		public static void main(String[] args) {
			System.out.println("-----");
			testArray();
		}
		
		public static void testArray(){
			int[] a = {1,3,5,6};
			
			Arrays.sort(a);
			System.out.println(a);
		}
}
