package ru.vsu.kudinov;

import ru.vsu.kudinov.utils.FileUtils;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {
        String inputFileName = readFileName("input");

        List<Triangle> list = FileUtils.readFromFile(inputFileName);
        CoordinateGrid PUTIN = new CoordinateGrid(list);
        int[] array = PUTIN.countTriangles();
        String outputFileName = readFileName("output");
        FileUtils.writeFile(array, outputFileName);

    }

    private static String readFileName(String typeOfTheFile) {
        String fileName;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the name of the %s file: ", typeOfTheFile);
        fileName = in.next();

        return fileName;
    }
}
