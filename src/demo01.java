public class demo01 {
    public static void main(String[] args) {
        demo01 demo01=new demo01();
        System.out.println(demo01.calculate(5));
        System.out.println(1111);
        System.out.println(22222);
    }
    public int calculate(int n){
        int temp=0;
        int total=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                total=total+i;
            }
            temp=total+calculate(n-1);
        }
        return temp;
    }
}
