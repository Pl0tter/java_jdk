package org.hw02.repo;

public interface IRepo {
    void saveInLog(String text);
    String readLog();
}
