// SymetricMatrix


// 10 20 30
// 20 40 50
// 30 50 60

// 00 01 02
// 10 11 12
// 20 21 22

// count = 0

// ij != ji 
//     ++count 


import java.util.Scanner;
public class SymetricMatrix
{
    public static void main(String[] args)
    {
        int matrix[][] = new int[3][3];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print("enter value of matrix["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if(matrix[i][j] != matrix[j][i])
                {
                    ++count;
                }
            }
        }

        if(count==0)
        {
            System.out.println("yes");
        }
        else 
        {
            System.out.println("no");
        }
        scanner.close();
    }
}

// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33

