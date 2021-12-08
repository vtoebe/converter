package com.vtoebe.inches_converter;

import service.ContinuityChecker;
import service.Converter;
import utils.Printer;
import utils.Writer;

public class InchesToCentimeters {
    public static void main(String[] args){
        Printer print = new Printer();
        Writer write = new Writer();
        Converter convert = new Converter();
        ContinuityChecker continuity = new ContinuityChecker();

        do {
            print.resultInches(write.convertedInches(
                    convert.inchesToFloat(write.saveInches(
                            print.inputInches())
                    ))
            );
        } while(continuity.check());
    }
}
