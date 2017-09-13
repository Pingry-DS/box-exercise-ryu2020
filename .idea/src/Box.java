public class Box <T> {

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box(){
    super();
    isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T t){
    super();
    isFull = true;
    contents = t;
  }

  /**
   * Check the contents of the box
   * @return WHATS IN THE FUCKING BOX
   */
  public T getContents(){
    return contents;
  }

  /**
   * Tell whether the box is full or not
   * @return whether the box is full
   */
  public boolean isFull(){
    return isFull;
  }

  /**
   * Empty out the box, and give back hatever was in it
   * @return WHATS IN THE MOTHERFUCKING BOX
   */
  public T empty(){
    T c =  contents;
    contents = null;
    isFull = false;
    return c;
  }

  public String toString(){
    return "{" + contents.toString() + "}";
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
