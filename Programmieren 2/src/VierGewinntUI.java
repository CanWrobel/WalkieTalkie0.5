import java.util.Scanner;

public class VierGewinntUI {
    private static final String PRINT = "print", PRINTSHORT = "p", PRINTDESC = ".. print board";
    private static final String EXIT = "exit", EXITSHORT = "e", EXITDESC = "... exit the game";
    private static final String CONNECT = "connect", CONNECTSHORT = "c", CONNECTDESC = "... connect as a tcp client";
    private static final String OPEN = "open", OPENSHORT = "o", OPENDESC = "... open port to become the tcp server";
    private static final String SET = "set", SETSHORT = "s", SETDESC = "... set a piece";

    private Brett brett;

    public static void main(String[] args) {
        System.out.println("Welcome to Vier Gewinnt");

        VierGewinntUI brettUI = new VierGewinntUI();
        brettUI.printCommandList();
        brettUI.runcommandloop();


    }
    public VierGewinntUI(){
        this.brett = new Brett();
    }

    public void printCommandList() {
        StringBuilder b = new StringBuilder();

        b.append("\n");
        b.append("valid commands:");
        b.append("\n");
        b.append(CONNECT);
        b.append(CONNECTDESC);
        b.append("\n");
        b.append(OPEN);
        b.append(OPENDESC);
        b.append("\n");
        b.append(PRINT);
        b.append(PRINTDESC);
        b.append("\n");
        b.append(SET);
        b.append(SETDESC);
        b.append("\n");
        b.append(EXIT);
        b.append(EXITDESC);
        b.append("\n");
        System.out.println(b);
    }

    public void runcommandloop(){

        boolean run = true;
        while(run) {
            String commandString = "";

            System.out.print("<Enter Command>: ");
            Scanner scanner = new Scanner(System.in);
            commandString = scanner.nextLine();
            switch (commandString) {
                case PRINT:
                case PRINTSHORT:
                    this.doPrint();
                    break;
                case SETSHORT:
                case SET:
                    this.doSet();
                    // redraw
                    this.doPrint();
                    break;
                case EXITSHORT:
                case EXIT:
                    this.doExit();
                    run = false;
                    break; // end loop
                case CONNECTSHORT:
                case CONNECT:
                    this.doConnect();
                    break;
                case OPENSHORT:
                case OPEN:
                    this.doOpen();
                    break;
                default:
                    System.out.println("Unknown command try one of these:");
                    this.printCommandList();
                    break;

            }
            //break;

        }
    }

    private void doOpen() {
        System.out.println("Here we open a game server");
    }

    private void doConnect() {
        System.out.println("Here we enter a valid game server port\nFormat: connect <server port>");
    }

    private void doPrint() {

        for (int i = 0; i < Brett.hoehe; i++) {
            System.out.println();
            for (int j = 0; j < Brett.breite; j++) {
                System.out.print(brett.getBildschirmausgabeBrett(i,j));
            }
        }
        System.out.println();
        System.out.println("Prints the board. ");

    }
    private void doSet(){
        System.out.println("Set the pieces");
        brett.setFeldarray(0,3," Z ");
        brett.setFeldarray(0,2," Z ");
        brett.setFeldarray(0,1," Z ");
        brett.setFeldarray(0,0," Z ");
    }
    private void doExit(){
        System.out.println("you quit the game");
    }
}
