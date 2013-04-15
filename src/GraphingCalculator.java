public class GraphingCalculator
{
    public GraphingCalculator(){}
    //Instance field GUI
    static GUI gui = new GUI();
    //Initialize Calculator Components
    private void Initialize(GUI _GUI)
    {        
        _GUI.setVisible(true);        
    }
    //Run
    public void run() throws InterruptedException
    {
        Initialize(gui);
        Ghost.delayInt=256;
        Ghost.go();
    }

}