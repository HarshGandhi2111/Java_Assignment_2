package Exam;

public class ResultPrinter
{
    private Result result;

    public ResultPrinter(Result result)
    {
        this.result = result;
    }
    public void show()
    {
        System.out.println("Percentage: " + result.calculatePercentage());
    }
}
