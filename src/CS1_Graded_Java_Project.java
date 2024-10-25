public class CS1_Graded_Java_Project extends World{
    //Instructions: Your task is to create a picture using at least one of each of the tools above.
    //Variables (CHECK), Methods (CHECK), For loops (CHECK), Conditonal Statements (CHECK), Nested loops (CHECK)

    public void go(){
        boolean isCompleted = false;
        if(isCompleted){
            System.out.println("Yay! The crocodile!");
        }
        else {
            System.out.println("no crocodile");
        }
        //background
        plane.loadBackGround("iwantthisdesert.png");

        plane.showBackGround();

        plane.isTrail=true;
        plane.trailWidth=3;
        plane.pausetime=1;
        plane.setColor(9,150,26);
        plane.teleport(179,450);
        plane.turn(110);
        plane.move(300);
        plane.turn(10);
        plane.move(50);
        plane.turn(-15);
        plane.move(60);
        plane.turn(-50);
        croccurveA();
        croccurveA();
        croccurveA();
        plane.turn(25);
        plane.move(50);
        croccurveB();
        croccurveB();
        croccurveB();
        plane.move(35);
        plane.turn(-145);
        plane.move(100);
        plane.turn(165);
        plane.move(100);
        plane.turn(-145);
        plane.move(15);
        plane.turn(-25);
        plane.move(100);
        croccurveA();
        plane.move(15);
        plane.turn(115);
        plane.move(50);
        plane.turn(10);
        plane.move(50);
        plane.turn(-90);
        plane.move(2);
        plane.turn(90);
        plane.move(2);
        plane.turn(45);
        plane.move(2);
        plane.turn(-30);
        plane.move(30);
        plane.turn(-165);
        plane.move(55);
        plane.turn(-30);
        plane.move(80);
        plane.teleport(580,441);
        plane.turn(50);
        croccurveA();
        croccurveA();
        croccurveA();
        plane.turn(115);
        plane.move(50);
        plane.move(2);
        plane.turn(45);
        plane.move(2);
        plane.turn(-30);
        plane.move(30);
        plane.turn(-165);
        plane.move(55);
        plane.turn(-30);
        plane.move(85);
        croccurveA();
        plane.turn(45);
        plane.teleport(500,445);
        plane.move(150);
        plane.turn(30);
        plane.move(65);
        plane.turn(90);
        plane.move(2);
        plane.turn(45);
        plane.move(2);
        plane.turn(-30);
        plane.move(30);
        plane.turn(-165);
        plane.move(55);
        plane.turn(-90);
        plane.move(30);
        plane.turn(110);
        plane.move(50);
        plane.turn(150);
        croctail();
        plane.move(50);
        plane.turn(-50);
        plane.move(10);
        plane.turn(-10);
        plane.move(50);
        plane.turn(-35);
        plane.move(30);
        plane.turn(-12);
        plane.move(75);
        plane.teleport(567,321);
        plane.turn(45);

        plane.teleport(351,529);
        plane.trailWidth=3;
        plane.turn(-109);
        plane.setColor(54,173,68);
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        plane.move(111);
        plane.teleport(191,443);
        plane.setColor(19,97,28);
        crocspikes();

        //remove line

        plane.setColor(82,51,15);
        plane.teleport(175,445);
        plane.move(7);
        plane.teleport(200,200);
        //back to spike color
        plane.setColor(19,97,28);




        isCompleted = true;//credit goes to https://www.w3schools.com/java/java_booleans.asp - I searched up how to use a if statment when something is completed
       ;
        if(isCompleted){
        System.out.println("Yay! The crocodile!");
        }

        //sun (why did i make this sun so complicated? could have just made it a single shade circle lol

        for (int ray = 0; ray < 50; ray++) {
            for (int x = 0; x < 19; x = x + 1) {
                plane.pausetime=0;
                plane.trailWidth=10;
                plane.teleport(772, 106);
                int greenvalue = 210 - (x * 2); // decrease green value with x
                plane.setColor(255, greenvalue, 0); // adjust color from x

                plane.turn(ray * 30); // 30 degrees apart
                plane.move(86);
                plane.move(-30); // center
            }
        }

        for (int y =0; y < 2; y = y + 1){
            for (int x = 0; x < 35; x = x + 1) {
                plane.teleport(772,106);
                plane.trailWidth=7;
                // color
                int greenValue = 220 - (x * 2); // decrease green value with x
                plane.setColor(250, greenValue, 0); // adjust color based on x
               // plane.setColor(255,183,0);

                //plane.turn(-30);
                plane.move(32);
                //plane.turn(-30);

                //plane.teleport(757,81);
//                plane.setColor(255,167,0);
//                croccurveA();
                croccurveA();
                plane.setColor(255,162,0);





            }
                plane.teleport(212, 430);
                plane.pausetime=1;
                plane.setColor(19,97,28);
                crocspikes();
                crocspikes();
                crocspikes();
                crocspikes();
                crocspikes();
                crocspikes();
                crocspikes();
                crocspikes();
                plane.teleport(472,337);
                plane.turn(50);
                crocspikes();


                plane.teleport(500,323);
                crocspikes();
                crocspikes();


        }
        plane.teleport(206,438);
        plane.move(3);
        plane.teleport(225,429);
        plane.setColor(19,97,28);
        plane.move(290);
        plane.teleport(515,322);
        plane.move(15);
        plane.teleport(505,332);
        plane.trailWidth=2;
        plane.move(20);
        plane.teleport(546,309);
        plane.trailWidth=5;
        plane.move(15);
        plane.teleport(0,0);

        //teeth
        plane.teleport(630,358);
        crocteeth();
        plane.teleport(641,351);
        crocteeth();
        plane.teleport(653,348);
        crocteeth();
        plane.teleport(663,342);
        crocteeth();
        plane.teleport(675,336);
        crocteeth();
        plane.teleport(685,334);
        crocteeth();
        plane.teleport(695,327);
        crocteeth();
        plane.teleport(655,347);
        crocteeth();
        plane.teleport(665,339);
        crocteeth();;
        plane.teleport(685,337);
        crocteeth();




        //fixing green spot
        plane.teleport(529,325);
        plane.setColor(19,97,28);
        plane.move(20);

        plane.teleport(662,177);


        plane.teleport(624,361);
        plane.trailWidth=2;
        plane.turn(-115);
        plane.setColor(9,150,26);
        plane.trailWidth=6;
        plane.teleport(625,355);
        plane.move(75);
        plane.turn(-90);
        crocfillingin();
        plane.trailWidth=8;
        plane.move(100);
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        plane.teleport(367,525);
        plane.move(2);
        plane.turn(30);
        plane.move(100);
        plane.teleport(367,526);
        plane.move(120);
        plane.teleport(368,528);
        plane.move(115);
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        plane.teleport(370,526);
        plane.turn(170);
        croccurveA();
        croccurveA();
        plane.teleport(495,464);
        plane.turn(-25);
        plane.move(15);
        plane.teleport(355,517);
        plane.turn(37);
        plane.move(10);
        plane.teleport(570,325);

        //stripes
        plane.setColor(219, 172, 77);
        plane.trailWidth=3;
        for (int i = 0; i < 15; i++) { // Number of stripes
            plane.teleport(352 + (i * 10), 521 - (i*5));
            plane.turn(80);
            plane.move(11);
            plane.turn(-80); // Turn back
            plane.pausetime=0;


        }
        // cover stripes that go over body
        plane.turn(93);
        crocfillingin();


        plane.setColor(255,255,255);
        plane.trailWidth=13;
        plane.teleport(568,326);
        plane.move(10);
        plane.teleport(575,326);
        plane.setColor(0,0,0);
        plane.move(2);


        plane.teleport(0,0);




















































    }
    public void croccurveA(){
        plane.move(1);
        plane.turn(2);
        plane.move(1);
        plane.move(1);
        plane.turn(2);
        plane.move(1);
        plane.move(1);
        plane.turn(2);
        plane.move(1);

    }
    public void croccurveB(){
        plane.move(1);
        plane.turn(-2);
        plane.move(1);
        plane.turn(-2);
        plane.move(1);
        plane.turn(-2);

    }
    public void croctail(){
        plane.move(30);
        plane.turn(-90);
        plane.move(15);
        plane.turn(90);
        plane.move(30);
        plane.turn(-90);
        plane.move(15);
        plane.turn(120);
        plane.move(110);
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        croccurveA();
        plane.turn(-185);
        plane.move(110);
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        croccurveB();
        plane.move(135);




    }
    public void crocspikes(){
    plane.trailWidth=9;
    plane.startingAngle(-20);
    plane.move(5);
    plane.turn(45);
    plane.move(10);
    plane.turn(-45);
    plane.move(5);
    plane.turn(-45);
    plane.move(10);
    plane.turn(45);
    plane.move(5);

    }
    public void crocteeth(){
        plane.setColor(240,225,175);
        plane.move(5);
        plane.turn(-120);
        plane.move(5);
        plane.turn(-120);
        plane.move(5);




    }
    public void crocfillingin(){
        plane.setColor(9,150,26);
        plane.trailWidth=30;
        plane.turn(90);
        plane.teleport(218,494);
        plane.move(350);
        plane.teleport(220,525);
        plane.move(350);
        plane.teleport(208,466);
        plane.turn(-5);
        plane.trailWidth=20;
        plane.teleport(186,459);
        plane.move(22);
        plane.move(350);
        plane.teleport(196,502);
        plane.move(30);
        plane.teleport(199,490);
        plane.trailWidth=30;
        plane.move(10);
        plane.teleport(204,580);
        plane.move(47);
        plane.turn(20);
        plane.teleport(209,478);
        plane.move(87);
        plane.turn(-30);
        plane.teleport(299,449);
        plane.move(30);
        plane.turn(-4);
        plane.teleport(304,455);
        plane.move(90);
        plane.turn(12);
        plane.move(30);
        plane.teleport(308,450);
        plane.move(10);
        plane.teleport(308,450);
        plane.move(10);
        plane.teleport(312,450);
        plane.move(10);
        plane.move(100);
        plane.teleport(278,421);
        plane.move(200);
        plane.turn(2);
        plane.trailWidth=21;
        plane.teleport(195,445);
        plane.move(300);
        plane.teleport(194,452);
        plane.move(2);
        plane.teleport(187,459);
        plane.move(2);
        plane.teleport(193,456);
        plane.trailWidth=2;
        plane.move(7);
        plane.teleport(193,455);
        plane.trailWidth=6;
        plane.turn(90);
        plane.move(1);
        plane.teleport(191,458);
        plane.move(1);
        plane.teleport(197,582);
        plane.trailWidth=25;
        plane.move(80);
        plane.teleport(228,575);
        plane.move(25);
        plane.teleport(218,578);
        plane.move(60);
        plane.teleport(197,515);
        plane.move(40);
        plane.teleport(178,585);
        plane.move(30);
        plane.teleport(171,561);
        plane.move(30);
        plane.teleport(175,511);
        plane.move(16);
        plane.teleport(171,591);
        plane.trailWidth=10;
        plane.move(50);
        plane.turn(-39);
        plane.move(98);
        plane.teleport(186,448);
        plane.turn(-50);
        plane.move(399);
        plane.teleport(496,341);
        plane.move(70);
        plane.teleport(563,304);
        plane.turn(-51);
        plane.move(82);
        plane.teleport(567,319);
        plane.move(30);
        plane.teleport(557,324);
        plane.move(60);
        plane.teleport(553,329);
        plane.trailWidth=15;
        plane.move(60);
        plane.teleport(599,338);
        plane.move(15);
        plane.teleport(600,337);
        plane.move(17);
        plane.teleport(590,325);
        plane.move(43);
        plane.teleport(596,323);
        plane.move(37);
        plane.teleport(607,321);
        plane.move(31);
        plane.teleport(616,320);
        plane.move(28);
        plane.teleport(631,318);
        plane.move(21);
        plane.teleport(643,316);
        plane.move(19);
        plane.teleport(655,316);
        plane.move(12);
        plane.teleport(672,317);
        plane.move(6);
        plane.teleport(561,346);
        plane.move(50);
        plane.teleport(580,357);
        plane.move(30);
        plane.trailWidth=35;
        plane.teleport(561,361);
        plane.move(2);
        plane.teleport(585,366);
        plane.trailWidth=21;
        plane.move(1);
        plane.teleport(590,370);
        plane.move(1);
        plane.teleport(598,367);
        plane.move(1);
        plane.teleport(595,387);
        plane.trailWidth=7;
        plane.move(1);
        plane.turn(45);
        plane.trailWidth=12;
        plane.teleport(613,372);
        plane.move(42);
        plane.trailWidth=10;
        plane.move(10);
        plane.trailWidth=8;
        plane.move(25);
        plane.trailWidth=6;
        plane.move(5);
        plane.turn(11);
        plane.move(5);
        plane.turn(-17);
        plane.teleport(612,368);
        plane.trailWidth=11;
        plane.move(46);
        plane.teleport(599,365);
        plane.move(63);
        plane.teleport(605,386);
        plane.trailWidth=3;
        plane.move(26);
        plane.teleport(537,390);
        plane.turn(-16);
        plane.move(30);
        plane.turn(15);
        plane.trailWidth=8;
        plane.move(15);
        plane.teleport(564,400);
        plane.turn(8);
        plane.move(15);
        plane.teleport(243,558);
        plane.turn(15);
        plane.trailWidth=20;
        plane.move(300);
        plane.teleport(429,450);
        plane.turn(-2);
        plane.move(100);
        plane.teleport(418,473);
        plane.trailWidth=11;
        plane.move(150);
        plane.teleport(633,346);
        plane.move(50);
        plane.teleport(680,318);
        plane.turn(-10);
        plane.trailWidth=16;
        plane.move(15);
        plane.teleport(230,560);
        plane.move(20);
        plane.teleport(310,550);
        plane.turn(35);
        plane.move(50);
        plane.teleport(306,561);
        plane.turn(50);
        plane.move(20);
        plane.teleport(318,565);
        plane.turn(-110);
        plane.trailWidth=7;
        plane.move(22);
        plane.turn(15);
        plane.teleport(489,445);
        plane.turn(26);
        plane.move(30);
        plane.teleport(510,440);
        plane.turn(5);
        plane.trailWidth=19;
        plane.move(60);
        plane.teleport(489,433);
        plane.turn(-75);
        plane.trailWidth=13;
        plane.move(30);
        plane.teleport(484,444);
        plane.move(5);
        plane.teleport(483,451);
        plane.turn(15);
        plane.trailWidth=8;
        plane.move(90);
        plane.teleport(547,410);
        plane.turn(-15);
        plane.move(101);
        plane.teleport(573,405);
        plane.move(100);
        plane.teleport(561,408);
        plane.move(100);
        plane.turn(36);
        plane.move(30);
        plane.trailWidth=6;
        plane.move(3);
        plane.teleport(576,488);
        plane.turn(7);
        plane.move(30);
        plane.trailWidth=5;
        plane.turn(-3);
        plane.move(7);
        plane.teleport(527,467);
        plane.turn(27);
        plane.move(85);
        plane.teleport(525,466);
        plane.move(35);
        plane.teleport(520,462);
        plane.move(50);
        plane.teleport(531,453);
        plane.move(50);
        plane.teleport(552,450);
        plane.move(30);
        plane.teleport(547,445);
        plane.move(25);
        plane.teleport(548,442);
        plane.trailWidth=10;
        plane.move(15);
        plane.teleport(557,428);
        plane.move(30);
        plane.teleport(549,443);
        plane.move(5);
        plane.teleport(535,460);
        plane.turn(-62);
        plane.trailWidth=13;
        plane.move(35);
        plane.turn(16);
        plane.move(15);
        plane.teleport(552,461);
        plane.trailWidth=10;
        plane.turn(-17);
        plane.move(40);
        plane.teleport(545,427);
        plane.move(3);
        plane.teleport(178,589);
        plane.turn(-5);
        plane.move(17);
        plane.turn(6);
        plane.move(5);
        plane.turn(22);
        plane.move(170);
        plane.teleport(238,602);
        plane.move(130);
        plane.teleport(253,602);
        plane.move(100);
        plane.teleport(256,602);
        plane.move(100);
        plane.teleport(250,595);
        plane.move(145);
        plane.teleport(311,600);
        plane.move(80);
        plane.teleport(319,599);
        plane.move(77);
        plane.teleport(322,597);
        plane.move(73);
        plane.teleport(329,595);
        plane.move(67);
        plane.teleport(336,593);
        plane.move(60);
        plane.teleport(342,595);
        plane.move(60);
        plane.teleport(347,597);
        plane.move(60);
        plane.teleport(350,599);
        plane.move(48);
        plane.teleport(353,601);
        plane.move(48);
        plane.teleport(367,620);
        plane.move(18);
        plane.turn(57);
        plane.move(92);
        plane.teleport(394,603);
        plane.move(50);
        plane.teleport(385,601);
        plane.move(40);
        plane.teleport(378,599);
        plane.move(35);
        plane.teleport(369,598);
        plane.move(30);
        plane.teleport(363,598);
        plane.move(25);
        plane.teleport(358,597);
        plane.move(20);
        plane.teleport(353,597);
        plane.move(22);
        plane.teleport(347,599);
        plane.move(22);
        plane.teleport(343,599);
        plane.move(17);
        plane.teleport(267,595);
        plane.turn(-50);
        plane.move(80);
        plane.teleport(266,593);
        plane.move(80);
        plane.teleport(275,588);
        plane.move(30);
        plane.teleport(277,583);
        plane.move(30);
        plane.teleport(277,588);
        plane.move(27);
        plane.teleport(277,581);
        plane.move(28);
        plane.teleport(277,584);
        plane.turn(80);
        plane.move(28);
        plane.teleport(289,590);
        plane.move(12);
        plane.teleport(347,600);
        plane.turn(10);
        plane.move(13);
        plane.teleport(279,574);
        plane.turn(10);
        plane.move(12);
        plane.teleport(289,587);
        plane.turn(10);
        plane.move(10);
        plane.teleport(347,598);
        plane.move(10);
        plane.teleport(360,518);
        plane.turn(-78);
        plane.setColor(230,203,131);


    }

}
