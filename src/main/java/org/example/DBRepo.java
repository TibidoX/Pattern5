package org.example;

public interface DBRepo {
    void read();
    void beginTransaction();
    void endTransaction();
}
