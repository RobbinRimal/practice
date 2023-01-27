package org.example.practice;
//**
// Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors.
// A tower block is represented with "*" character.
// **//
public class BuildTower {
    public static String[] towerBuilder(int nFloors)

    {
        System.out.println(nFloors);

        String[] stringArray2 = new String[nFloors];
        for(int i=1;i<nFloors;i++){
        for(int j=1;j<=2*i-1;j++){
            if(stringArray2[i-1]==null){
                stringArray2[i-1]="*";
            }else
            stringArray2[i-1]+="*";

        }
            }
        return stringArray2;
    }

}
