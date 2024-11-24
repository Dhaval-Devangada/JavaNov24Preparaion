package com.qa.leetcode;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        maximumWealth(accounts);
        maximumWealthAlternateSol(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                // currentWealth =  accounts[i][j]+ accounts[i][j+1]; //out of bound error
                currentWealth = currentWealth + accounts[i][j];
                System.out.println(currentWealth);
            }

            // Update maxWealth if the current customer's wealth is greater
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        System.out.println("Max wealth is: " + maxWealth);
        return maxWealth;
    }

    public static int maximumWealthAlternateSol(int[][] accounts) {
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        System.out.println("maximumWealthAlternateSol: " + maxWealthSoFar);
        return maxWealthSoFar;
    }
}
