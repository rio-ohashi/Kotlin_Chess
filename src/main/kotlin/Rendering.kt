import piece.Piece

class Rendering {
    //    fun render() {
    fun render(b: Array<Array<out Piece?>>) {
        println("     a    b    c    d    e    f    g    h ")
        for (row in 7 downTo 0) {
            println("  ==========================================")
            var cols = "${row+1} || "
            for (col in 0..7) {
                cols += if (b[row][col]?.character.isNullOrBlank() ||
                    b[row][col]?.isCaptured == true) {
                    " "
                } else {
                    b[row][col]?.character
                }
            }
            cols = " ${row+1}"
            println(cols)
        }
        println("  ==========================================")
        println("     a    b    c    d    e    f    g    h ")
    }
}