import java.util.Scanner;
public class SNodeSinglyMain{
    public static void main(String[] args){
        SNodeSingly obj=new SNodeSingly();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int value=sc.nextInt();
            obj.insert(value);
        }
        
        obj.remove(0);
        obj.show();

    }

    
}