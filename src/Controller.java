import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        MoonRover moonRover = new MoonRover();
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入平台的右上角坐标，左下角坐标被假定为（0,0）：");
        moonRover.setMaxx(sc.nextInt());
        moonRover.setMaxy(sc.nextInt());//设置地图边界

        System.out.println("请输入当前位置信息：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Axis axis = new Axis(x,y);
        moonRover.setAxis(axis);   //设置当前坐标
        moonRover.setDirection(sc.nextLine().charAt(1));    //设置当前方向

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
        }


        System.out.println("最终位置为：" + moonRover.getLocation());
    }
}
