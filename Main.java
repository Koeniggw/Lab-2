class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalMMS;
    double blue;
    double brown; 
    double green;
    double orange;
    double red;
    double yellow;

    totalMMS = 55 * 11;
    blue = totalMMS * .24;
    brown = totalMMS * .13;
    green = totalMMS * .16;
    orange = totalMMS * .20;
    red = totalMMS * .13;
    yellow = totalMMS * .14;
    
    double sum;
    sum = blue + brown + green + orange + red + yellow;

    System.out.println("Blue: " +blue);
    System.out.println("Brown: "+ brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);
    System.out.println(sum);


    if (blue < brown && red > orange) {
      System.out.println("Blue under Brown and Red over Orange");
    }
    if (brown >= green) {
      System.out.println("Brown is greater than or equal to Green");
    }

    if (sum == totalMMS) {
      System.out.println("Numbers Match");
    }
    
  }
}