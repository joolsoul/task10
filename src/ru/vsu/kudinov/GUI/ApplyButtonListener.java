package ru.vsu.kudinov.GUI;

import ru.vsu.kudinov.common.CoordinateGrid;
import ru.vsu.kudinov.common.Triangle;
import ru.vsu.kudinov.utils.FileUtils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ApplyButtonListener implements ActionListener
{

    private JTextField inputFileNameField;
    private JTextField firstQuarterField;
    private JTextField secondQuarterField;
    private JTextField thirdQuarterField;
    private JTextField fourthQuarterField;
    private JTextField severalQuartersField;

    public ApplyButtonListener(JTextField inputFileNameField, JTextField firstQuarterField, JTextField secondQuarterField, JTextField thirdQuarterField, JTextField fourthQuarterField, JTextField severalQuartersFields)
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
        String inputFileName = inputFileNameField.getText();
        List<Triangle> triangles = FileUtils.readFromFile("files//" + inputFileName);
        CoordinateGrid coordinateGrid = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid.countTrianglesInEqualQuarters();
        firstQuarterField.setText(String.valueOf(quartersArray[0]));
        secondQuarterField.setText(String.valueOf(quartersArray[1]));
        thirdQuarterField.setText(String.valueOf(quartersArray[2]));
        fourthQuarterField.setText(String.valueOf(quartersArray[3]));
        severalQuartersField.setText(String.valueOf(quartersArray[4]));
    }
}
