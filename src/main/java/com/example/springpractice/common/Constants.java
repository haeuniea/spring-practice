package com.example.springpractice.common;

public class Constants {

    public enum ExceptionClass {

        PRODUCT("Product"), ORDER("Order"), PROVIDER("Provider");

        private String exceptionClass;

        ExceptionClass(String exceptionClas) {
            this.exceptionClass = exceptionClass;
        }

        public String getExceptionClass() {
            return exceptionClass;
        }

        @Override
        public String toString() {
            return getExceptionClass() + " Exception. ";
        }
    }
}
