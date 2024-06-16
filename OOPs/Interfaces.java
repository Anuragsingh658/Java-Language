public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonally(in any direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right --> only in Straight way");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("One Square Horizantally, Vertically, Diagonally");
    }
}