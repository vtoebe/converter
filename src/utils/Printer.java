package utils;

import javax.swing.*;

public class Printer {
    final String CONTINUE_LINE = "Would you like to continue?";
    final String USD_REQUEST = "What's today's dollar quotation? ";
    final String BRL_REQUEST = "Type the value in BRL that you'd like to convert to USD:";

    public String inputUSD(){ return JOptionPane.showInputDialog(null, USD_REQUEST, "Dollar Quotation", JOptionPane.INFORMATION_MESSAGE); }
    public String inputBRL(){ return JOptionPane.showInputDialog(null, BRL_REQUEST, "BRL to Convert", JOptionPane.INFORMATION_MESSAGE); }
    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
    public void result(String conversionResult){
        JOptionPane.showMessageDialog(null, conversionResult, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    final String INCHES_REQUEST = "Type a value in inches to be converted to centimeters:";
    public String inputInches(){ return JOptionPane.showInputDialog(null, INCHES_REQUEST, "Enter Inches", JOptionPane.INFORMATION_MESSAGE); }
    public void resultInches(String conversion){ JOptionPane.showMessageDialog(null, conversion, "Result", JOptionPane.INFORMATION_MESSAGE);}
}
