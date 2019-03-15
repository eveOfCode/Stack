public class stack
{
  private int[] array;
  private int[] tempArray;
  private int counter;
  private final int size = 5;

  public stack()
  {
    array = new int[size];
    counter = 0;
  }

  // Here we push the item onto the end of the stack
  public int[] push(int x)
  {
    if(array.length <= counter)
      {
       tempArray = new int[array.length*2];
       for(int y = 0; y < array.length; y++)
       {
         tempArray[y] = array[y];
        }
      array = tempArray;
      array[counter] = x;
    }

    else // else the array doesn't have to make a bigger array
    {
      array[counter] = x;
    }

    for(int l = 0; l < counter+1; l++)
      System.out.print(array[l] + " ");

    System.out.println();
    counter++;
    return array;
  }

  // Here we pop the end item off of the stack
  public int pop()
  {
    int x = array[counter-1];
    counter = counter - 1;
    System.out.println("Just popped out: " + x);
    return x;
  }

}
