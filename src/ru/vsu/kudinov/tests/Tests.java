package ru.vsu.kudinov.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.kudinov.common.CoordinateGrid;
import ru.vsu.kudinov.common.Triangle;
import ru.vsu.kudinov.utils.FileUtils;
import java.util.List;

public class Tests
{
    @Test
    public void test1()
    {
        List<Triangle> triangles = FileUtils.readFromFile("tests\\test1.txt");
        CoordinateGrid coordinateGrid1 = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid1.countTrianglesInEqualQuarters();
        int[] expectedQuartersArray = {2, 2, 2, 2, 2};
        Assert.assertArrayEquals(expectedQuartersArray, quartersArray);
    }

    @Test
    public void test2()
    {
        List<Triangle> triangles = FileUtils.readFromFile("tests\\test2.txt");
        CoordinateGrid coordinateGrid2 = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid2.countTrianglesInEqualQuarters();
        int[] expectedQuartersArray = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expectedQuartersArray, quartersArray);
    }

    @Test
    public void test3()
    {
        List<Triangle> triangles = FileUtils.readFromFile("tests\\test3.txt");
        CoordinateGrid coordinateGrid3 = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid3.countTrianglesInEqualQuarters();
        int[] expectedQuartersArray = {2, 0, 3, 0, 1};
        Assert.assertArrayEquals(expectedQuartersArray, quartersArray);
    }

    @Test
    public void test4()
    {
        List<Triangle> triangles = FileUtils.readFromFile("tests\\test4.txt");
        CoordinateGrid coordinateGrid4 = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid4.countTrianglesInEqualQuarters();
        int[] expectedQuartersArray = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expectedQuartersArray, quartersArray);
    }

    @Test
    public void test5()
    {
        List<Triangle> triangles = FileUtils.readFromFile("tests\\test5.txt");
        CoordinateGrid coordinateGrid5 = new CoordinateGrid(triangles);
        int[] quartersArray = coordinateGrid5.countTrianglesInEqualQuarters();
        int[] expectedQuartersArray = {1, 2, 1, 1, 0};
        Assert.assertArrayEquals(expectedQuartersArray, quartersArray);
    }
}
