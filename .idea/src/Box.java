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
   * @return WHATS IN THE BOX
   */
  public T getContents(){
    return contents;
  }

  public void setContents(T c) {contents = c;};

  /**
   * Tell whether the box is full or not
   * @return whether the box is full
   */
  public boolean isFull(){
    return isFull;
  }

  /**
   * Empty out the box, and give back hatever was in it
   * @return WHATS IN THE BOX
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
    Box<Integer> intBox = new Box<Integer>(new Integer(100));

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box
    stringBox.setContents("Thing in a box");


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method
    stringBox.setContents(stringBox.getContents() + " that has been edited");

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes
    String str = stringBox.empty();



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
