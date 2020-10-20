#https://www.facebook.com/lakshay.gulati.5/posts/3439658002768650
#subscribed by Lakshay

public class switchcase {

    public static void main(String[] args) {

        System.out.println("Choose an option:-");
        System.out.println("1.To check if the no. is composite");
        System.out.println("2.To find the smallest digit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int store[];

        switch(choice){
            case 1:
            {
                System.out.println("Enter the number");
                int num = scan.nextInt();
                for (int i = 2;i<num;i++){
                    if((num%i)==0){
                        System.out.println("The number is Composite");
                        break;}
                    if(i==(num-1)){
                        System.out.println("The number is prime");
                    }
                    else{
                        continue;}
                }
            }break;
            case 2:
            {
                System.out.println("Enter the number");
                String num1 = scan.next();
                store= new int[num1.length()];
                int num = Integer.parseInt(num1);

                for (int j = 0;j>=0;j++){
                    if(num==0){
                        break;}
                    store[j]=(num%10);
                    num=num/10;

                }
                Arrays.sort(store);
                System.out.println(store[0]);
            }break;
            default:{
                System.out.println("Enter the Correct choice");}break;
        }




    }
}
