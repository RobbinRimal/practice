package org.example.practice;

public class Main1 {

        public static void main(String[] args) {
     //Order.order("1this 3is a4 world2");
          String[] x=  BuildTower.towerBuilder(5);
          for (String j:x){
              System.out.println(j);
          }
            System.out.println(SecureTest.alphanumeric("thisis7avalidstatementiguess87"));;

        }

    }
