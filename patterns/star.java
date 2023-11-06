
package patterns;
public class star{
    public static void main(String args[]){
        //Star(10);
        //InvertedStar(10);
        //HalfPyramid(10);
        characterPattern(4);
    }
    public static void Star(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedStar(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterPattern(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }
    }
}