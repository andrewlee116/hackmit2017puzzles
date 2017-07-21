import java.io.PrintStream;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class WarpCLI {
    private static final long START_EPOCH = 786281444;

    public static void main(String[] arrstring) {
        Instant instant = Instant.ofEpochSecond(786281445);
        Instant instant2 = Instant.ofEpochSecond(786281444);
        Instant instant3 = instant2.plus(1, ChronoUnit.DAYS);
        if (instant.isAfter(instant2) && instant.isBefore(instant3)) {
            System.out.println(new Object(){
                int t;

                public String toString() {
                    byte[] arrby = new byte[47];
                    this.t = -315808409;
                    arrby[0] = (byte)(this.t >>> 2);
                    this.t = -1905316511;
                    arrby[1] = (byte)(this.t >>> 16);
                    this.t = -1552585339;
                    arrby[2] = (byte)(this.t >>> 16);
                    this.t = 1044431832;
                    arrby[3] = (byte)(this.t >>> 17);
                    this.t = -940729176;
                    arrby[4] = (byte)(this.t >>> 10);
                    this.t = -421565451;
                    arrby[5] = (byte)(this.t >>> 17);
                    this.t = -1118094743;
                    arrby[6] = (byte)(this.t >>> 7);
                    this.t = 329025571;
                    arrby[7] = (byte)(this.t >>> 6);
                    this.t = 19893550;
                    arrby[8] = (byte)(this.t >>> 5);
                    this.t = -1415423586;
                    arrby[9] = (byte)(this.t >>> 19);
                    this.t = -1234942579;
                    arrby[10] = (byte)(this.t >>> 5);
                    this.t = 647774407;
                    arrby[11] = (byte)(this.t >>> 9);
                    this.t = 983492710;
                    arrby[12] = (byte)(this.t >>> 9);
                    this.t = 495034807;
                    arrby[13] = (byte)(this.t >>> 10);
                    this.t = -1651224238;
                    arrby[14] = (byte)(this.t >>> 18);
                    this.t = 1377864149;
                    arrby[15] = (byte)(this.t >>> 16);
                    this.t = -114249572;
                    arrby[16] = (byte)(this.t >>> 7);
                    this.t = 521565932;
                    arrby[17] = (byte)(this.t >>> 4);
                    this.t = -422004336;
                    arrby[18] = (byte)(this.t >>> 7);
                    this.t = -1145170633;
                    arrby[19] = (byte)(this.t >>> 19);
                    this.t = 1622317074;
                    arrby[20] = (byte)(this.t >>> 15);
                    this.t = 2099356567;
                    arrby[21] = (byte)(this.t >>> 3);
                    this.t = 274518736;
                    arrby[22] = (byte)(this.t >>> 23);
                    this.t = -1601484697;
                    arrby[23] = (byte)(this.t >>> 11);
                    this.t = -1180767941;
                    arrby[24] = (byte)(this.t >>> 23);
                    this.t = 1503083206;
                    arrby[25] = (byte)(this.t >>> 8);
                    this.t = -1105191118;
                    arrby[26] = (byte)(this.t >>> 16);
                    this.t = 1093264486;
                    arrby[27] = (byte)(this.t >>> 4);
                    this.t = -1431525248;
                    arrby[28] = (byte)(this.t >>> 13);
                    this.t = -34905557;
                    arrby[29] = (byte)(this.t >>> 8);
                    this.t = 361789448;
                    arrby[30] = (byte)(this.t >>> 15);
                    this.t = 1216708807;
                    arrby[31] = (byte)(this.t >>> 2);
                    this.t = 839601726;
                    arrby[32] = (byte)(this.t >>> 24);
                    this.t = 269693187;
                    arrby[33] = (byte)(this.t >>> 3);
                    this.t = -882730919;
                    arrby[34] = (byte)(this.t >>> 7);
                    this.t = 644323473;
                    arrby[35] = (byte)(this.t >>> 7);
                    this.t = -1407135290;
                    arrby[36] = (byte)(this.t >>> 10);
                    this.t = 958098136;
                    arrby[37] = (byte)(this.t >>> 15);
                    this.t = -1736888189;
                    arrby[38] = (byte)(this.t >>> 2);
                    this.t = 66124160;
                    arrby[39] = (byte)(this.t >>> 3);
                    this.t = -248145956;
                    arrby[40] = (byte)(this.t >>> 16);
                    this.t = 742043991;
                    arrby[41] = (byte)(this.t >>> 16);
                    this.t = 1383376489;
                    arrby[42] = (byte)(this.t >>> 5);
                    this.t = -1193220268;
                    arrby[43] = (byte)(this.t >>> 10);
                    this.t = 1159767353;
                    arrby[44] = (byte)(this.t >>> 16);
                    this.t = -1038480413;
                    arrby[45] = (byte)(this.t >>> 11);
                    this.t = -1549775494;
                    arrby[46] = (byte)(this.t >>> 8);
                    return new String(arrby);
                }
            }.toString());
        } else {
            System.out.println("It's not your time ;)");
        }
    }

}