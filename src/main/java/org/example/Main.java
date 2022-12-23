package org.example;

public class Main {
    public static void main(String[] args) {
        DBRepo postgres = new PostgresRepo();
        DBRepo proxy = new Proxy(postgres);

        proxy.read();
    }
}