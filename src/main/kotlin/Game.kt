import piece.*

class Game {
    private lateinit var board: Array<Array<out Piece?>>
    private var player = arrayOf(Player("white", true), Player("black", false))

    fun create() {
        // init board
        board =
            arrayOf(
                arrayOf(
                    Rook(false,0,0),
                    Knight(false,0,1),
                    Bishop(false,0,2),
                    King(false,0,3),
                    Queen(false,0,4),
                    Bishop(false,0,5),
                    Knight(false,0,6),
                    Rook(false,0,7)),
                arrayOf(
                    Pawn(false,1,0),
                    Pawn(false,1,1),
                    Pawn(false,1,2),
                    Pawn(false,1,3),
                    Pawn(false,1,4),
                    Pawn(false,1,5),
                    Pawn(false,1,6),
                    Pawn(false,1,7)),
                arrayOfNulls(8),
                arrayOfNulls(8),
                arrayOfNulls(8),
                arrayOfNulls(8),
                arrayOf(
                    Pawn(true,6,0),
                    Pawn(true,6,1),
                    Pawn(true,6,2),
                    Pawn(true,6,3),
                    Pawn(true,6,4),
                    Pawn(true,6,5),
                    Pawn(true,6,6),
                    Pawn(true,6,7)),
                arrayOf(
                    Rook(true,7,0),
                    Knight(true,7,1),
                    Bishop(true,7,2),
                    King(true,7,3),
                    Queen(true,7,4),
                    Bishop(true,7,5),
                    Knight(true,7,6),
                    Rook(true,7,7))
            )
        // init player
        println("Enter name white player")
        player[PlayerEnum.WHITE.ordinal].name= readLine().toString()
        println("Enter name black player")
        player[PlayerEnum.BLACK.ordinal].name= readLine().toString()



    }
}