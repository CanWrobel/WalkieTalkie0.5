public interface VierGewinntInterface {
    /**
     *
     */


    boolean set();

    /**
     *
     * @return returns the current GameBoard
     */
    GameBoard getBoard();

    /**
     *
     * @return game status
     */
    Status getStatus();

    /**
     * @return if active - can set a piece, false otherwise
     */
    boolean isActive();

    /**
     * @return true if won, false otherwise
     */
    boolean hasWon();

    /**
     * @return true if lost, false otherwise
     */
    boolean hasLost();
}
