package lab8;

import java.util.Scanner;

public abstract class TestQuestion {

    protected static final Scanner scanner = WriteTest.scanner;
    protected String question;


    protected abstract void readQuestion();
}
