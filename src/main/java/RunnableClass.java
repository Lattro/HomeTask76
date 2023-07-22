import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnableClass implements Runnable
{
    public void  run()
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Введите число");
            double a  = Double.parseDouble(bufferedReader.readLine());
            for (int i = 0; i < 5; i++)
            {
                a /=2;
                System.out.println(a);
            }
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
