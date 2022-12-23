package org.example;

public class Proxy implements DBRepo {

    private DBRepo repository;

    public Proxy(DBRepo repository) {
        this.repository = repository;
    }

    @Override
    public void read() {
        repository.beginTransaction();
        repository.read();
        repository.endTransaction();
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void endTransaction() {
        repository.endTransaction();
    }
}