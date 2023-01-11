package design_patterns.prototype_design_pattern.practice;


/**
 * TASK : Given the following class definitions, you are asked to implement Line.deepCopy()  to perform a deep copy of the current Line  object.
 */
class PointQ
{
    public int x, y;

    public PointQ(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class LineQ
{
    public PointQ start, end;

    public LineQ(PointQ start, PointQ end)
    {
        this.start = start;
        this.end = end;
    }

    public LineQ deepCopy()
    {
        // todo
        return null;
    }
}
