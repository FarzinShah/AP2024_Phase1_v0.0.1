package third.all.controller;

import third.all.data.Properties;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Constants {
    public static final double GLASS_FRAME_DIMENSION_MAX_WIDTH = 600.0;
    public static final double GLASS_FRAME_DIMENSION_MAX_HEIGHT = 600.0;
    public static double boundX = 450.0;
    public static double boundY = 100.0;

    public static Integer EPSILON_WIDTH = 50;
    public static Integer EPSILON_LENGTH = 50;
    public static Integer ACCELERATION_OF_GREEN_ENEMIES = 2;
    public static Integer ACCELERATION_OF_YELLOW_ENEMIES = 2;
    public static Integer ACCELERATION_OF_EPSILON = 2;
    public static final Color COLOR1 = new Color(0xFF545252, true);
    public static final Color BLUE_BACKGROUND = (new Color(0x6A8CA8));
    public static boolean waveOHB = false;
    public static boolean IS_VALID_STORE = false;
    public static boolean is_Writ_Of_Proteus = false;
    public static boolean is_Writ_Of_Aceso = false;
    public static boolean is_Writ_Of_Ares = false;
    public static Integer REDUCTION_RATE_OF_HP_OF_ENEMY = 1;

//    public static double SECOND_FRAME_LOCATION_X = 700, SECOND_FRAME_LOCATION_Y = 0;
//    public static double THIRD_FRAME_LOCATION_X = 600, THIRD_FRAME_LOCATION_Y = 150;
//    public static double FOURTH_FRAME_LOCATION_X = 600, FOURTH_FRAME_LOCATION_Y = 300;
//    public static int FIFTH_FRAME_LOCATION_X = 1400, FIFTH_FRAME_LOCATION_Y = 510;
    public static final Point STARTING_POINT  = new Point(100,100);
    public static final String OMENOCT_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Omenoct.png";
    public static final String WYRM_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Wyrm.png";
    public static final String NECROPICK_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Necropick.png";
    public static final String BEAUTIFUL_HEART_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\BeautifulHeart.png";
    public static final String ARCHMIRE_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Archmire.png";
    public static final String LOULOU_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\loulou.png";
    public static final String BARRICADOS_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Barricados.png";
    public static final String ORB_PATH = "src\\main\\java\\third\\all\\utils\\p2Enemies\\Orb.png";
    public static final String HEAD_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossFace\\HeadEmoji.png";
    public static final String LEFT_HAND_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossFace\\Hand2.png";
    public static final String RIGHT_HAND_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossFace\\RightHand2.png";
    public static final String FIST_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossFace\\BossFist.png";
    public static final String SKULL_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossFace\\Skull.png";
    public static final String PentagonalEpsilon_PATH = "src\\main\\java\\third\\all\\utils\\epsilonShapes\\PentagonalEpsilon.png";
    public static final String HexagonalEpsilon_PATH = "src\\main\\java\\third\\all\\utils\\epsilonShapes\\HexagonalEpsilon.png";
    public static final String TriangleEpsilon_PATH = "src\\main\\java\\third\\all\\utils\\epsilonShapes\\TriangonalEpsilon.png";
    public static final String Background_Annihilator_1_PATH = "src\\main\\java\\third\\all\\utils\\backgroundsOfAnnihilator\\Background_Annihilator_1.png";
    public static final String Background_Annihilator_2_PATH = "src\\main\\java\\third\\all\\utils\\backgroundsOfAnnihilator\\Background_Annihilator_2.png";
    public static final String Background_Annihilator_3_PATH = "src\\main\\java\\third\\all\\utils\\backgroundsOfAnnihilator\\Background_Annihilator_3.png";
    public static final String Background_Starting_PATH = "src\\main\\java\\third\\all\\utils\\images\\WelcomeImage.png";

    public static final String SAVING_DATA_PATH = "src\\main\\java\\third\\all\\data\\savingPath\\gameState.json";
    public static final String SAVING_DATA_PATH_WP = "src\\main\\java\\third\\all\\data\\savingPath\\gameStateWP.json";


    //todo: Alerts:
    public static final String SavingOption_PATH = "src\\main\\java\\third\\all\\utils\\optionsAlert\\SavingOption.png";
    public static final String CollectibleOption_PATH = "src\\main\\java\\third\\all\\utils\\optionsAlert\\CollectibleOption.png";
    public static final String LaserOption_PATH = "src\\main\\java\\third\\all\\utils\\optionsAlert\\LaserOption.png";
    public static final String BlackOrbsAlert_PATH = "src\\main\\java\\third\\all\\utils\\optionsAlert\\BlackOrbsAlert.png";

    //todo: BossNotice:
    public static final String AnnihilatorAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\AnnihilatorAttack.png";
    public static final String PowerPunchAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\PowerPunchAttack.png";
    public static final String ProjectileAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\ProjectileAttack.png";
    public static final String QuakeAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\QuakeAttack.png";
    public static final String RapidFireAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\RapidFireAttack.png";
    public static final String SlapAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\SlapAttack.png";
    public static final String SqueezeAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\SqueezeAttack.png";
    public static final String VomitAttack_PATH = "src\\main\\java\\third\\all\\utils\\bossData\\BossAttackNotice\\VomitAttack.png";

    public static final String BOSS_MUSIC_PATH = "src\\main\\java\\third\\all\\utils\\bossFightSong.mp3";


    public static final Image OMENOCT = new ImageIcon(OMENOCT_PATH).getImage();
    public static final Image WYRM = new ImageIcon(WYRM_PATH).getImage();
    public static final Image NECROPICK = new ImageIcon(NECROPICK_PATH).getImage();
    public static final Image BEAUTIFUL_HEART = new ImageIcon(BEAUTIFUL_HEART_PATH).getImage();
    public static final Image ARCHMIRE = new ImageIcon(ARCHMIRE_PATH).getImage();
    public static final Image LOULOU = new ImageIcon(LOULOU_PATH).getImage();
    public static final Image BARRICADOS = new ImageIcon(BARRICADOS_PATH).getImage();
    public static final Image ORB = new ImageIcon(ORB_PATH).getImage();
    public static final Image HEAD = new ImageIcon(HEAD_PATH).getImage();
    public static final Image LEFT_HAND = new ImageIcon(LEFT_HAND_PATH).getImage();
    public static final Image RIGHT_HAND = new ImageIcon(RIGHT_HAND_PATH).getImage();
    public static final Image FIST = new ImageIcon(FIST_PATH).getImage();
    public static final Image SKULL = new ImageIcon(SKULL_PATH).getImage();
    public static final Image PentagonalEpsilon = new ImageIcon(PentagonalEpsilon_PATH).getImage();
    public static final Image Background_Starting = new ImageIcon(Background_Starting_PATH).getImage();
    public static final Image BlackOrbsAlert = new ImageIcon(BlackOrbsAlert_PATH).getImage();


    public static final Image SAVING_OPTION = new ImageIcon(SavingOption_PATH).getImage();
    public static final Image COLLECTIBLE_OPTION = new ImageIcon(CollectibleOption_PATH).getImage();
    public static final Image LASER_OPTION = new ImageIcon(LaserOption_PATH).getImage();

    public static final Image AnnihilatorAttack = new ImageIcon(AnnihilatorAttack_PATH).getImage();
    public static final Image PowerPunchAttack = new ImageIcon(PowerPunchAttack_PATH).getImage();
    public static final Image ProjectileAttack = new ImageIcon(ProjectileAttack_PATH).getImage();
    public static final Image QuakeAttack = new ImageIcon(QuakeAttack_PATH).getImage();
    public static final Image RapidFireAttack = new ImageIcon(RapidFireAttack_PATH).getImage();
    public static final Image SlapAttack = new ImageIcon(SlapAttack_PATH).getImage();
    public static final Image SqueezeAttack = new ImageIcon(SqueezeAttack_PATH).getImage();
    public static final Image VomitAttack = new ImageIcon(VomitAttack_PATH).getImage();

    public static final Image Background_Annihilator_1 = new ImageIcon((Background_Annihilator_1_PATH)).getImage();
    public static final Image Background_Annihilator_2 = new ImageIcon((Background_Annihilator_2_PATH)).getImage();
    public static final Image Background_Annihilator_3 = new ImageIcon((Background_Annihilator_3_PATH)).getImage();




    //TODO: P2 Enemies:
    public static Point OMENOCT_POSITION = new Point(400,200);
    public static int OMENOCT_SIZE = 25;
    public static Point NECROPICK_POSITION = new Point(200,200);
    public static int NECROPICK_SIZE = 50;
    public static Point ARCHMIRE_POSITION = new Point(300,400);
    public static int ARCHMIRE_SIZE = 60;


    public static final double GLASS_FRAME_DIMENSION_MIN_WIDTH = 500.0;
    public static final double GLASS_FRAME_DIMENSION_MIN_HEIGHT = 500.0;
//    public static double GLASS_FRAME_DIMENSION_WIDTH = 600.0;
//    public static double GLASS_FRAME_DIMENSION_HEIGHT = 600.0;

    public static final double SIZE_OF_TWM_ITEM = 10;
    public static final double SIZE_OF_SHOT_BULLET = 10;

    public static final Dimension GLASS_FRAME_DIMENSION = new Dimension((int) Properties.getInstance().GLASS_FRAME_DIMENSION_WIDTH,(int) Properties.getInstance().GLASS_FRAME_DIMENSION_HEIGHT);
    public static final Dimension PANEL_SIZE = new Dimension((int) (GLASS_FRAME_DIMENSION.getWidth()/2), (int) (GLASS_FRAME_DIMENSION.getHeight()/2));
    public static final int FPS = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].getDisplayMode().getRefreshRate();;
    public static final double FRAME_UPDATE_TIME=(double) TimeUnit.SECONDS.toMillis(1)/(5*FPS);
    public static final int UPS = 100;
    public static final double MODEL_UPDATE_TIME=(double) TimeUnit.SECONDS.toMillis(1)/(5*UPS);
    public static final double SPEED = 60D/UPS;
    public static final double MAX_RADIUS = 50;
    public static final int NUMBER_OF_YELLOW_ENEMIES =2;//first value: 100

}
