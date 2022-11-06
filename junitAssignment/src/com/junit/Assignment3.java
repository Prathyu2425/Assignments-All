package com.junit;

public class Assignment3 {
        public int withdraw(int amount)
        {
            int balance = 5000;
            if (amount > balance)
            {
                throw new NotSufficientFundException(String.format("current balance is less than required"));
            }
            return balance;
        }
    }
    class NotSufficientFundException extends RuntimeException{
        String message;
        public NotSufficientFundException(String message)
        {
            this.message=message;
        }
        public String getMessage()
        {
            return message;
        }
    }

