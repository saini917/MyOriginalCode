package com.coachingProgram;

public class IntersectionTwoArrays {
	static int[] x={2,5,3,7};
	static int[] y={5,2,9,0,1};

	public static void main(String[] args) {
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j]){
					System.out.println(x[i]);
				}
			}
		}

	}

}
