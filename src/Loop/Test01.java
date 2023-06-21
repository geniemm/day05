package Loop;

public class Test01 {
   public static void main(String[] args) {
      int size = 9;
      int high = 5;
      
      String[] inputNum = "P P P P P P P P P P P P B P P P P P P P P B B B B P P P B B B B B B P P P P P B B B B B P P P P B P B B B P P B P P P B P P P P B B P B P B P P P P P P P P P P P".split(" ");
      String[][] array = new String[size][size];
      int[][] arrayHigh = new int[size][size];

      int totalCount = 0;
      int result = 0;
      
      for(int i=0; i<size; i++){
         for(int j=0; j<size; j++){
            array[i][j] = inputNum[i*size+j];
           
         }
      }
      
      
      
      for(int i=0; i<size; i++){
         for(int j=0; j<size; j++){
            if(array[i][j].equals("B")){
               // high 1
               if(i-1>-1 && array[i-1][j].equals("P")) arrayHigh[i][j] = 1; //up
               if(i+1<size && array[i+1][j].equals("P")) arrayHigh[i][j] = 1; //down
               if(j-1>-1 && array[i][j-1].equals("P")) arrayHigh[i][j] = 1; //left
               if(j+1<size && array[i][j+1].equals("P")) arrayHigh[i][j] = 1; //right
               
               if(arrayHigh[i][j] == 0){
                  int count = -1;
                  for(int k=0; k<size; k++){
                     if(array[i][k].equals("B")) count++;
                     if(array[k][j].equals("B")) count++;
                  }
                  arrayHigh[i][j] = count;
               }
            }
            totalCount += arrayHigh[i][j];
            if(arrayHigh[i][j] >= high) result++;
         }
      }
      System.out.println(totalCount + " " + result);
   }
}