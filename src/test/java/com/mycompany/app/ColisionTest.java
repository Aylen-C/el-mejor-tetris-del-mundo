import org.junit.jupiter.api.Test;

@Test
public void stickBaja(){
    Board board = new Board(20,10);
    PieceStick stick = new PieceStick();
    stick.rotateRight();


board.setPiezaActual(stick, 4);

while(board.canMoveDown()){



}
}