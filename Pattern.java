import java.util.*;

public class Pattern{
    public static void main(String[]args){
      //inverted_pyramid_withNum(47);
      //flyoed_triangle(5);
      //Triangle_01(5);
      //Buterfly_pattern(3);
      //Solid_rhombus(555);
      //hollow_rhombus(5);
      daimond(60);
    }

public static void HollowRetangle(int r, int c){
    for(int i=1; i<=r; i++){
        for(int j=1; j<=c; j++){
            if(i==1 || i==r || j==1 || j==c){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}

public static void inverted_and_rotated_Half_Pyramid(int n){
    //Outer loop
    for(int i=1; i<=n; i++){

        //printing spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        //printing stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }
}

public static void inverted_pyramid_withNum(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

public static void flyoed_triangle(int n){
    int counter=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(counter);
            counter++;
        }
        System.out.println();
    }
}

public static void Triangle_01(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2 == 0){
                System.out.print("1");
            } else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

public static void Buterfly_pattern(int n){

    //for the first half

    for(int i=1; i<=n; i++){

        //stars

        for(int j=1; j<=i;j++){
            System.out.print("*");
        }


        //space

        for(int j=1; j<=(2 * (n - i)); j++){
            System.out.print(" ");
        }


        //stars
         for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    

    //for the second half

    for(int i=n; i>=1; i--){

         //stars

        for(int j=1; j<=i;j++){
            System.out.print("*");
        }


        //space

        for(int j=1; j<=(2 * (n - i)); j++){
            System.out.print(" ");
        }


        //stars
         for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println();
        
    }

}

public static void Solid_rhombus(int n){
    //outer loop

    for(int i=1; i<=n; i++){
        
        //space

        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }


        //stars

        for(int j=1; j<=n; j++){
            System.out.print("*");
        }

        //space

        for(int j=1; j<=(i-1);j++){
            System.out.print(" ");
        }

        System.out.println();
    }
}

public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){

         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            }
            System.out.println();


    }
}

public static void daimond(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j= 1; j<=((2*i)-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n; i>=1; i--){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j= 1; j<=((2*i)-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

}