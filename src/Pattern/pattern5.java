package Pattern;

public class pattern5 {

    static void pattern5(int n)
    {
        for(int row =1;row<=2*n-1;row++)
        {
            int totalcolinrow=row>n?2*n-row:row;
            for (int col = 1; col <=totalcolinrow; col++)
            {
                System.out.print("*  "  );
            }
            //when onee row is printed we need to add a new line
            System.out.println();
        }


    }
    public static void main(String[] args)
    {
        pattern5(5);


    }
}