package fr.christophetd.log4shell.vulnerableapp;

public class InitializerTest {
    static {
//        System.loadLibrary("log4j");
        System.out.println("class initializer ran!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
