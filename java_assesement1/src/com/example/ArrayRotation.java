package com.example;

public class ArrayRotation {
	
	public static void main(String[] args) {
	

		int[] arr = new int[] {3,4,5,1,2};

		int n=1;

		System.out.println("The Array we given A is : =");

		for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i]+"");
		}

		for(int i=0;i<n;i++) {

		int j,first;

		first = arr[0];

		for(j=0;j<arr.length-1;j++) {

		arr[j]=arr[j+1];

		}

		arr[j]=first;
		}

		System.out.println();

		System.out.println("The Left Rotation of Array A");

		for(int i =0;i<arr.length;i++) {

		System.out.println(arr[i]+"");
		}


		int[] arr2= new int[] {1,2,3,4,5};

		int m=1;

		System.out.println("The Array we Given D is: =");

		for(int i=0;i<arr.length;i++) {

		System.out.println(arr[i]+"");
		}

		for(int i=0;i<n;i++) {

		int j,first;

		first = arr[0];

		for(j=0;j<arr.length-1;j++) {

		arr[j]=arr[j+1];

		}

		arr[j]=first;
		}

		System.out.println();

		System.out.println("The left rotation of Array D ");

		for(int i =0;i<arr.length;i++) {

		System.out.println(arr[i]+"");
		}



		}

		
}
