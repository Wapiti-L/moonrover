public class moonRover {
    private int x;
    private int y;
    private int maxx;
    private int maxy;
    private Character direction;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Character getDirection() {
        return direction;
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
                if ((x + 1) > maxx)
                    System.out.println("error");
                else x += 1;
                break;
            case 'S':
                if ((y - 1) < 0)
                    System.out.println("error");
                else y -= 1;
                break;
            case 'W':
                if ((x - 1) < 0)
                    System.out.println("error");
                else x -= 1;
                break;
            case 'N':
                if ((y + 1) > maxy)
                    System.out.println("error");
                else y += 1;
                break;
        }
    }

}
