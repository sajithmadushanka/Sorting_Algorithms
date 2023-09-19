public class Main{
    public static void main(String args[]){
        int[] array = {50, 10, 60, 30, 76, 90, 20, 5, 8, 65, 80};
                    // {10, 50, 30, 60,76, 20, 90}
                    // {10, 30, 50,60,20, 76, 90}
                    // 10, 30 , 50, 20 , 60 , 76, 90 
                    // 10 , 30 , 20 , 50 , 60, 76, 90
                    // 10, 20, 30, 50 , 60 , 76, 90    n-1
    

    for(int i = 0; i < array.length- 1; i ++){
       

                    for(int j = 0; j < array.length - 1; j++){
                            int firstNo = array[j]; //50 --// 50 //  60 //60 // 76 // 90
                            int scondNo = array[j + 1]; // 10 --// 60 // 30 // 76 // 90 // 20

                            if( firstNo > scondNo) // true -- false
                            {
                                array[j] = array[ j + 1];  // {10 , 10} // {30, 30} // {20, 20}
                                array[j + 1] = firstNo;   // {10, 50 } // {30, 60} // {20, 90}

                                // System.out.println(array[j] +" " + array[j + 1]);
                            }
                    }
    }
    for(int i: array){
        System.out.print(i +" ");
    }

    }
}