public class PC {
    //composition
    private Case theCase;
    private Monitor monitor;
    private  MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }

    public void powerUp(int x,int y, String color){
        monitor.drawPixelAt(x,y,color);
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
