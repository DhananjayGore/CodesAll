enum
enum Color
{
    RED, GREEN, BLUE;
}
 
public class Test
{
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
///////////////////////////////////////////////////
widening

public class Test
{
    public static void main(String[] args)
    {
        System.out.print("Y" + "O");
        System.out.print('L' + 'O');
    }
}

//prints YO155
//if + is present it will convert 'char' to int