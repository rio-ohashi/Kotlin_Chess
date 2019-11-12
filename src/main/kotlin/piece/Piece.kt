package piece

import Position

abstract class Piece(isWhite: Boolean, row:Int, col:Int, character:String) {
    protected val limit_move_min = 0
    protected val limit_move_max = 8

    val character: String = character
    var isCaptured = false

    protected var position: Position = Position(8, 8)
    protected var isWhite: Boolean = isWhite
    protected var isMoved = false

    abstract fun isValidMoveSpecific(newPosition: Position): Boolean
    abstract fun move(row: Int, col: Int)
    abstract fun toBeCaptured()
}