package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame
{
    private JPanel mainPanel;
    private JTextField inputFileNameField;
    private JTextField firstQuarterField;
    private JTextField secondQuarterField;
    private JTextField thirdQuarterField;
    private JTextField fourthQuarterField;
    private JTextField severalQuartersField;
    private JButton applyButton;
    private JButton clearButton;

    public FrameMain()
    {
        super("task 10");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(650, 450, 280, 350);
        this.setMinimumSize(new Dimension(280, 350));
        this.setMaximumSize(new Dimension(300, 400));
        setVisible(true);

        applyButton.addActionListener(new ApplyButtonListener(inputFileNameField, firstQuarterField, secondQuarterField, thirdQuarterField, fourthQuarterField, severalQuartersField));
        clearButton.addActionListener(new ClearButtonListener(inputFileNameField, firstQuarterField, secondQuarterField, thirdQuarterField, fourthQuarterField, severalQuartersField));
    }
}

