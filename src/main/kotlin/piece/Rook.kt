package piece

import Position

class Rook(isWhite:Boolean, row:Int, col:Int): Piece(isWhite, row, col, if(isWhite) "♖" else "♜") {

    override fun isValidMoveSpecific(newPosition: Position): Boolean {
        return newPosition.row > limit_move_min && newPosition.col > limit_move_min &&
            newPosition.row < limit_move_max && newPosition.col < limit_move_max
    }

    override fun move(row: Int, col: Int) {
        position.row = row
        position.col = col
        isMoved = true
    }

    override fun toBeCaptured() {
        isCaptured = true
    }
}
