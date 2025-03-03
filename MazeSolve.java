import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class MazeSolve
{
    public static boolean success;
    public static void main(String[]args)
    {
        char[][] maze = new char[7][20];
        String filePath = "C:/Users/saa.talanki/Alg&Data/simpleMaze.txt";
        int ct = 0;
        try(Scanner scanner = new Scanner(new File(filePath)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                for(int y = 0; y < line.length(); y++)
                {
                    maze[ct][y] = line.charAt(y);
                }
                ct++;
            }
        }
        catch(FileNotFoundException fail)
        {
            fail.printStackTrace();
        }
        System.out.println(goNorth(6,12, maze));
        for(int w = 0; w < maze.length; w++)
        {
            for(int z = 0; z < maze[w].length;z++)
            {
                System.out.print(maze[w][z]);
            }
            System.out.println();
        }
    }
    
    
    
    public static boolean goWest (int x, int y, char[][] maze)
    {
        if(String.valueOf(maze[x][y-1]).equals( " " ) && y>=0)
            return true;
        else 
            return false;
    }
    public static boolean goEast (int x, int y, char[][] maze)
    {
        if (String.valueOf(maze[x][y+1]).equals( " " ) && y<=19)
            return true;
        else 
            return false;
    }
    public static boolean goSouth (int x, int y, char[][] maze)
    {
        if (String.valueOf(maze[x+1][y]).equals( " " ) && x<=6)
            return true;
        else 
        {
            return false;
        }
    }
    
    
    public static boolean goNorth (int x, int y, char[][] maze)
    {
        if(x == 0)
        {
            maze[x][y] = 'e';
            success = true;
        }
        else
        {
            if(String.valueOf(maze[x-1][y]).equals( " " ))
            {  
               maze[x][y] = 'p';
               x-=1;   
               goNorth(x,y,maze);
            }
            else
                if(goWest(x,y,maze))
                {
                    maze[x][y] = 'p';
                    y-=1;
                    goNorth(x,y,maze);
                }
                else
                    if(goEast(x,y,maze))
                    {
                        maze[x][y] = 'p';
                        y+=1;
                        goNorth(x,y,maze);
                    }
                    else
                        if(goSouth(x,y,maze))
                        {
                            maze[x][y] = 'p';
                            x+=1;
                            goNorth(x,y,maze);
                        }
                        else
                        {
                            success = false;
                        }
        }
        return success;
    }
}





