package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H' },
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0' },
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0' },

    };

    public void print() {
        for(int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char obstacleType) {
        int sum = 0;
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (environment[i][j] == obstacleType) {
                    sum++;
                }
            }
        }return sum;
    }


    public int[] countObstaclesPerRow(int rowIdx){
        int[] erg = new int[2];
        int holeCount = 0;
        int barrierCount = 0;
        for(int i=0; i<environment[rowIdx].length; i++){
            if(environment[rowIdx][i] == 'L'){
                holeCount++;
            }
            if(environment[rowIdx][i] == 'H'){
                barrierCount++;
            }
        }
        erg[0] = barrierCount;
        erg[1] = holeCount;
        return erg; // TODO IMPLEMENT ME
    }


    public int energyNeededInRow(int row) {
        int ergPoint = 0;
        boolean foundHole = false;
        for (int i = 0; i < environment[row].length; i++) {
            if (environment[row][i] == 'L') {
                foundHole = true;
                return -1;
            }
        }
        if (!foundHole) {
            for (int i = 0; i < environment[row].length; i++) {
                if (environment[row][i] == 'H') {
                    ergPoint = ergPoint + 2;
                }
            }

        }return ergPoint;
    }


    public int ableToFinishHiking(int points){
            int count = 0;
            for(int i=0; i<environment.length; i++){
                if (points >= energyNeededInRow(i) && energyNeededInRow(i)!=-1){
                    count = count + 1;
                }
            }return count;
        }
}
