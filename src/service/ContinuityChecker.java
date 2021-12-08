package service;

import utils.Printer;

public class ContinuityChecker {
    Printer print = new Printer();

    public boolean check(){ return print.continueCheck() == 0; }
}
