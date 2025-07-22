package com.projectnull.practice0722;

public class Hoejeonmogma {

    private boolean isOn; //초기 값 :
    private int speed;

    public void start() {
        if (isOn) {
            System.out.println("회전목마가 이미 출발했습니다..");
        } else {
            this.isOn = true;
            System.out.println("회전목마 출발합니다!");
        }
    }

    public void up() {
        if (isOn) {
            System.out.println("손잡이를 위로 올려주세요");
            this.speed += 10;
            System.out.println("회전목마가 높이가 위로 " + this.speed + "만큼 올라갑니다.");
        } else {
            System.out.println("회전목마가 중단되었습니다.");
        }
    }

    public void down() {
        if (isOn) {
            if (speed >0 ) {
                this.speed = 0;
                System.out.println("손잡이를 아래로 내려주세요");
            } else {
                System.out.println("더이상 내려 갈 수 없습니다.");
            }
        }else {
            System.out.println("회전목마가 중단되어 손잡이를 사용 할수 없습니다.");
        }
    }
    public void end () {
        if (isOn) {
            if (speed >0) {
                System.out.println("운행이 멈춤 후 내릴 수 있습니다.");
            } else {
                this.isOn = false;
                System.out.println("운행을 종료합니다.");
            }
        }else {
            System.out.println("회전목마가 이미 중단되어 있습니다.");
        }
    }
}
