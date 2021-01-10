package ru.vsu.kudinov.common;

public class Triangle
{
    private Point p1;
    private Point p2;
    private Point p3;


    public Triangle (Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public QuartersOfTheCoordinateGrid getQuarter(Triangle triangle)
    {
        if(p1.getX() >= 0 && p1.getY() >= 0 && p2.getX() >= 0 && p2.getY() >= 0 && p3.getX() >= 0 && p3.getY() >= 0)
        {
            return QuartersOfTheCoordinateGrid.Quarter1;
        }

        if(p1.getX() <= 0 && p1.getY() >= 0 && p2.getX() <= 0 && p2.getY() >= 0 && p3.getX() <= 0 && p3.getY() >= 0)
        {
            return QuartersOfTheCoordinateGrid.Quarter2;
        }

        if(p1.getX() <= 0 && p1.getY() <= 0 && p2.getX() <= 0 && p2.getY() <= 0 && p3.getX() <= 0 && p3.getY() <= 0)
        {
            return QuartersOfTheCoordinateGrid.Quarter3;
        }

        if(p1.getX() >= 0 && p1.getY() <= 0 && p2.getX() >= 0 && p2.getY() <= 0 && p3.getX() >= 0 && p3.getY() <= 0)
        {
            return QuartersOfTheCoordinateGrid.Quarter4;
        }

        return QuartersOfTheCoordinateGrid.Notquarter;
    }
}
