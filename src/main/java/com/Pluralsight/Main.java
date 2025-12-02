package com.Pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    if (!ensureArgs(args)) {
        return;
    }

    try {
        BasicDataSource ds = getDataSource(args);

        DataManager dm = new DataManager(ds);

        SakilaConsoleApp app = new SakilaConsoleApp(dm);

        app.start();

    } catch (Exception e) {
        System.out.println("There was a SQL exception: " + e.getMessage());
    }
}