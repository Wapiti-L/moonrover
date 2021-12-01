import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        moonRover moonRover = new moonRover();
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入平台的右上角坐标，左下角坐标被假定为（0,0）：");
        moonRover.setMaxx(sc.nextInt());
        moonRover.setMaxy(sc.nextInt());

        System.out.println("请输入当前位置信息：");
        moonRover.setX(sc.nextInt());
        moonRover.setY(sc.nextInt());
        moonRover.setDirection(sc.nextLine().charAt(1));

        System.out.println("请给出指令：");
        StringBuilder sb = new StringBuilder(10);
        sb.append(sc.nextLine());

        //根据指令移动
        for (int i = 0; i < sb.length(); i ++){

//            System.out.println(sb.charAt(i));
            switch (sb.charAt(i)){

                case 'L': moonRover.L();
                    break;
                case 'R': moonRover.R();
                    break;
                case 'M': moonRover.M();
                    break;
            }
//            System.out.println(moonRover.getX() + " " + moonRover.getY() + " " + moonRover.getDirection());
        }


        System.out.printf("最终坐标与位置为：x=%d,y=%d,方向为:%s",moonRover.getX(),moonRover.getY(),moonRover.getDirection());
    }
}
