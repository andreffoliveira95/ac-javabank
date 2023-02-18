package org.academiadecodigo.javabank.helloworld;

public class HelloPojo {

    private String message;
    private String favCoolor;
    private int numbers;

    public HelloPojo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getFavCoolor() {
        return favCoolor;
    }

    public void setFavCoolor(String favCoolor) {
        this.favCoolor = favCoolor;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}
