package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener
{
    private JTextField inputFileNameField;
    private JTextField firstQuarterField;
    private JTextField secondQuarterField;
    private JTextField thirdQuarterField;
    private JTextField fourthQuarterField;
    private JTextField severalQuartersField;

    public ClearButtonListener(JTextField inputFileNameField, JTextField firstQuarterField, JTextField secondQuarterField, JTextField thirdQuarterField, JTextField fourthQuarterField, JTextField severalQuartersFields)
    {
        this.inputFileNameField = inputFileNameField;
        this.firstQuarterField = firstQuarterField;
        this.secondQuarterField = secondQuarterField;
        this.thirdQuarterField = thirdQuarterField;
        this.fourthQuarterField = fourthQuarterField;
        this.severalQuartersField = severalQuartersFields;

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        inputFileNameField.setText(null);
        firstQuarterField.setText(null);
        secondQuarterField.setText(null);
        thirdQuarterField.setText(null);
        fourthQuarterField.setText(null);
        severalQuartersField.setText(null);
    }
}
