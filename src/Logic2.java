public class Logic2 {
    public static boolean makeBricks(int small, int big, int goal) {
        int brickSum = 0;
        int[][] brick = {
                {big, small},
                {5, 1}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < brick[0][i]; j++) {
                brickSum += brick[1][i];
                if (brickSum > goal) {
                    brickSum -= brick[1][i];
                    break;

                } else if (brickSum == goal) break;
            }
        }

//        for (int i = 0; i < big; i++) {
//            if (brickSum > goal) {
//                brickSum--;
//                break;
//
//            } else if (brickSum == goal) break;
//
//            brickSum += 5;
//        }
//
//        for (int i = 0; i < small; i++) {
//            if (brickSum > goal) {
//                brickSum--;
//                break;
//
//            } else if (brickSum == goal) break;
//
//            brickSum += 1;
//        }

        return brickSum == goal;
    }
}
