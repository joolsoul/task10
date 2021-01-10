package ru.vsu.kudinov.console;

import ru.vsu.kudinov.common.CoordinateGrid;
import ru.vsu.kudinov.common.Triangle;
import ru.vsu.kudinov.utils.FileUtils;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleMain
{
    public static void main(String[] args) throws IOException
    {
        String inputFileName = readFileName("input");
        List<Triangle> triangles = FileUtils.readFromFile(inputFileName);

        CoordinateGrid coordinateGrid = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid.countTrianglesInEqualQuarters();

        String outputFileName = readFileName("output");
        FileUtils.writeToFile(quartersArray, outputFileName);
    }

    private static String readFileName(String typeOfTheFile)
    {
        String fileName;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the name of the %s file: ", typeOfTheFile);
        fileName = scanner.next();

        return "files\\" + fileName;
    }
}
