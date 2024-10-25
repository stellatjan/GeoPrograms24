public class B0_BasicLoop extends World {

    public void go() {

        plane.trailWidth = 1;
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.setColor(24, 184, 77);


        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                System.out.println("x: " + x);
                System.out.print("y:" + y);
                plane.setColor(x / 5, y / 5, 150);
                plane.square(1);


            }




        }
        croc();
    }


    public void rowofsquares(int y) {

//            for (int y = 0; y < 17; y = y + 2) {
//                plane.teleport(x * 105, 500);
//                plane.setColor(x * 9, 156, x * 9);
//                plane.square(100);
//
//
//            }


        }




    public void croc(){
        plane.trailWidth=20;
        plane.pausetime = 1;
        plane.teleport(50,52);
        plane.startingAngle(0);
        plane.trailWidth=2;
        plane.setColor(24,184,77);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(-90);
        plane.move(5);
        plane.turn(90);
        plane.move(50);
        plane.turn(-90);
        plane.move(20);
        plane.turn(-90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(15);
        plane.turn(-45);
        plane.move(20);
        plane.turn(-42);
        plane.move(20);
        plane.turn(-45);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-150);
        plane.move(35);
        plane.turn(80);
        plane.move(20);
        plane.turn(98);
        plane.move(5);

        plane.isTrail=false;
        plane.move(30);
        plane.turn(10);
        plane.move(60);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth = 3;
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.isTrail=false;
        plane.move(60);
        plane.turn(180);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth=2;
        plane.move(20);
        plane.isTrail=false;
        plane.move(300);


        plane.teleport(770,47);
        plane.trailWidth=2;
        plane.setColor(24,184,77);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(-90);
        plane.move(5);
        plane.turn(90);
        plane.move(50);
        plane.turn(-90);
        plane.move(20);
        plane.turn(-90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(15);
        plane.turn(-45);
        plane.move(20);
        plane.turn(-42);
        plane.move(20);
        plane.turn(-45);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-150);
        plane.move(35);
        plane.turn(80);
        plane.move(20);
        plane.turn(98);
        plane.move(5);

        plane.isTrail=false;
        plane.move(30);
        plane.turn(10);
        plane.move(60);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth = 3;
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.isTrail=false;
        plane.move(60);
        plane.turn(180);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth=2;
        plane.move(20);
        plane.isTrail=false;
        plane.move(300);


        plane.teleport(738,650);
        plane.trailWidth=2;
        plane.setColor(24,184,77);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(-90);
        plane.move(5);
        plane.turn(90);
        plane.move(50);
        plane.turn(-90);
        plane.move(20);
        plane.turn(-90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(70);
        plane.turn(90);
        plane.move(10);
        plane.turn(-90);
        plane.move(5);
        plane.turn(-90);
        plane.move(10);
        plane.turn(90);
        plane.move(15);
        plane.turn(-45);
        plane.move(20);
        plane.turn(-42);
        plane.move(20);
        plane.turn(-45);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-150);
        plane.move(35);
        plane.turn(80);
        plane.move(20);
        plane.turn(98);
        plane.move(5);

        plane.isTrail=false;
        plane.move(30);
        plane.turn(10);
        plane.move(60);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth = 3;
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(90);
        plane.isTrail=false;
        plane.move(60);
        plane.turn(180);
        plane.isTrail=true;
        plane.setColor(3,28,11);
        plane.trailWidth=2;
        plane.move(20);
        plane.isTrail=false;
        plane.move(300);

        //create spikes loop

    }
    }















