import java.util.ArrayList;
import java.util.List;

public class MoonRover {
    private Axis axis;
    private int maxx;
    private int maxy;
    private Character direction;

    public Axis getAxis() {
        return axis;
    }

    public void setAxis(Axis axis) {
        this.axis = axis;
    }

    public int getMaxx() {
        return maxx;
    }

    public int getMaxy() {
        return maxy;
    }

    public void setMaxx(int maxx) {
        this.maxx = maxx;
    }

    public void setMaxy(int maxy) {
        this.maxy = maxy;
    }

    public void setDirection(Character direction) {
        this.direction = direction;
    }


    public List<Object> getLocation(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(axis.getX());
        list.add(axis.getY());
        list.add(direction);
        return list;
    }


    //向左旋转命令
    public void L(){
        switch (direction){
            case 'E':
                direction = 'N';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'N':
                direction = 'W';
                break;
        }
    }

    //向右旋转命令
    public void R(){
        switch (direction){
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'N':
                direction = 'E';
                break;
        }
    }

    //前进命令
    public void M(){
        switch (direction){
            case 'E':
                if ((axis.getX() + 1) > maxx)
                    System.out.println("error");
                else axis.setX(axis.getX() + 1);
                break;
            case 'S':
                if ((axis.getY() - 1) < 0)
                    System.out.println("error");
                else axis.setY(axis.getY() - 1);
                break;
            case 'W':
                if ((axis.getX() - 1) < 0)
                    System.out.println("error");
                else axis.setX(axis.getX() - 1);
                break;
            case 'N':
                if ((axis.getY() + 1) > maxy)
                    System.out.println("error");
                else axis.setY(axis.getY() + 1);
                break;
        }
    }

}
