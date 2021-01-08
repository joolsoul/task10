package ru.vsu.kudinov;
import java.util.List;

public class CoordinateGrid
{
    private List<Triangle> triangles;

    public CoordinateGrid (List<Triangle> triangles)
    {
        this.triangles = triangles;
    }

    public int[] countTriangles()
    {
        int[] array = new int[5];
        for(Triangle triangle : triangles)
        {

            switch (triangle.getQuarter(triangle))
            {
                case Quarter1:
                    array[0]++;
                    break;

                case Quarter2:
                    array[1]++;
                    break;

                case Quarter3:
                    array[2]++;
                    break;

                case Quarter4:
                    array[3]++;
                    break;

                case Notquarter:
                    array[4]++;
                    break;
            }

        }
        return array;
    }

}

