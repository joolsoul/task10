package ru.vsu.kudinov.utils;

import ru.vsu.kudinov.common.Point;
import ru.vsu.kudinov.common.Triangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FileUtils
{
    public static List<Triangle> readFromFile(String filename)
    {
        try
        {
            String[] lines = readLinesFromFile("src\\ru\\vsu\\kudinov\\" + filename);
            List<Triangle> triangleList = new ArrayList<>();
            for (String line : lines) {
                List<Integer> coordinates = stringToArrayList(line);
                List<Point> points = createPoints(coordinates);
                triangleList.add(createTriangle(points));
            }
            return triangleList;
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File not found");
            System.exit(1);
        }
        return null;
    }

    public static void writeFile(int[] quartersArray, String fileName) throws IOException
    {
        FileWriter outputFile = new FileWriter("src\\ru\\vsu\\kudinov\\" + fileName);
        for(int i = 0; i < 5; i++)
        {
            if(quartersArray[i] != 0 && i != 4)
            {
                outputFile.write("In the " + (i + 1) + " quarter there are " +quartersArray[i] + " triangles" + "\n");
            }
            if(i == 4 && quartersArray[4] != 0)
            {
                outputFile.write(quartersArray[i] + " triangles are in several quarters");
            }

        }
        outputFile.close();
    }

    private static List<Point> createPoints(List<Integer> coordinates)
    {
        List<Point> pointsList = new ArrayList<>();
        for (int i = 0; i < coordinates.size(); i++)
        {
            if (i % 2 == 0)
            {
                pointsList.add(new Point(coordinates.get(i), coordinates.get(i + 1)));
            }
        }
        return pointsList;
    }

    private static Triangle createTriangle(List<Point> pointsList)
    {
        return new Triangle(pointsList.get(0), pointsList.get(1), pointsList.get(2));
    }

    private static String[] readLinesFromFile(String fileName) throws FileNotFoundException
    {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8"))
        {
            lines = new ArrayList<>();
            while (scanner.hasNext())
            {
                lines.add(scanner.nextLine());
            }
        }
        return lines.toArray(new String[0]);
    }

    private static List<Integer> stringToArrayList(String line)
    {
        Scanner scanner = new Scanner(line);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.nextInt());
        }
        return list;
    }
}

