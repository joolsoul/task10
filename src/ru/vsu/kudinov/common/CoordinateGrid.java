package ru.vsu.kudinov.common;

import java.util.List;

public class CoordinateGrid
{
    private List<Triangle> triangles;

    public CoordinateGrid (List<Triangle> triangles)
    {
        this.triangles = triangles;
    }

    public int[] countTrianglesInEqualQuarters()
    {
        int[] quartersArray = new int[5];

        for(Triangle triangle : triangles)
        {
            switch (triangle.getQuarter(triangle))
            {
                case Quarter1:
                    quartersArray[0]++;
                    break;

                case Quarter2:
                    quartersArray[1]++;
                    break;

                case Quarter3:
                    quartersArray[2]++;
                    break;

                case Quarter4:
                    quartersArray[3]++;
                    break;

                case Notquarter:
                    quartersArray[4]++;
                    break;
            }
        }
        return quartersArray;
    }

}

