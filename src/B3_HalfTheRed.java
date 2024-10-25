public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("regularshowimage.jpg");

        plane.showBackGround();


        for (int y =354; y < 700; y = y + 1) {
            for (int x = 499; x < 892; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

               // plane.setPixelColor(red , green/2, blue);

                if(237< red && red<250 && 202<green && green<220 && 0<blue && blue<2 ){
                    plane.setPixelColor(red/2 , green/2, blue);
                }


            }
        }
    }
}

