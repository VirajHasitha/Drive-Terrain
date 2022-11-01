package com.example.test;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int terrainArray[] = getTerrainmeasurements();
        String terrainStatus = driveTerrain(terrainArray);
        System.out.println("The upcoming terrain is " + terrainStatus);
    }

    public static String driveTerrain(int[] t){
        String tStatus = "";
        if(t[0]==t[1] && t[1]==t[2]){
            tStatus = "flat";
        } else if(t[0]<=t[1] && t[1]<=t[2]){
            if (t[0]==t[1]){
                tStatus = "uphill approach";
            }else if(t[1]==t[2]) {
                tStatus = "plateau";
            } else {
                tStatus = "uphill";
            }
        } else if(t[0]>=t[1] && t[1]>=t[2]){
            if (t[0]==t[1]){
                tStatus = "downhill approach";
            }else if(t[1]==t[2]) {
                tStatus = "bogland";
            } else {
                tStatus = "downhill";
            }
        } else if (t[0]>t[1] && t[1]<t[2]){
            tStatus = "valley";
        } else {
            tStatus = "hill";
        }
        return tStatus;
    }

    public static int[] getTerrainmeasurements(){
        int [] measurements = new int[3];
        Scanner inputScanner = new Scanner( System.in );
        System.out.println("Please input the measurements of the terrain \n");
        int j=1;
        for(int i=0;i<3;i++){
            System.out.println("Enter measurement " + j + "\n");
            measurements[i] = inputScanner.nextInt();
            j++;
        }
        return measurements;
    }
}
