package Week9;


public class EX1_Array {
    public static void main(String[] args) {

 //method 1:
      int[] array1 = {2,5,4,3,8};

      for(int i = 0; i < array1.length; i++)
      {
          System.out.println(array1[i]);

      }


      System.out.println("");


    //method 2:
        int[] array2 = new int[5];
            array2[0] = 1;
            array2[1] = 2;
            array2[2] = 3;
            array2[3] = 4;
            array2[4] = 5;


        for(int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);
        }
    }
}
