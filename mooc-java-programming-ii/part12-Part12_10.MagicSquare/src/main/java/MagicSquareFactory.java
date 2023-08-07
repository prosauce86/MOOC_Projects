
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if (square.getWidth() % 2 == 0) return null;

        int rowPosition = 0; // top row
        int columnPosition = square.getWidth() / 2; // middle position
        int maxValue = square.getWidth() * square.getWidth(); // all possible numbers in square

        // Populate squares
        for (int i = 1; i <= maxValue; i++) { // each iteration should populate square using value of i
            square.placeValue(rowPosition, columnPosition, i);

            int nextRow = (rowPosition - 1 + size) % size; // get next row according to algorithm
            int nextCol = (columnPosition + 1) % size; // get next column

            if (square.readValue(nextRow, nextCol) != 0) {
                // Java initializes array indices to 0 until they are set.
                // Check if next position is something other than 0 meaning it was
                // set previously, and we should move down instead of up and over
                rowPosition = (rowPosition + 1) % size;
            } else {
                rowPosition = nextRow;
                columnPosition = nextCol;
            }
        }

        return square;
    }

}