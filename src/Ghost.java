public class Ghost {    
    static void plot() {
        //Simulating a service running in the background
        //It can force plot the calculator after a timer runs out!
        while(true) {
            try{Thread.sleep(1);}catch(Exception e){}
            if(delayInt>0){
                delayInt--;                
                if(delayInt==0){
                    GraphingCalculator.gui.plot();                    
                }
            }
        }        
    }    
    static void go() { plot(); }
    static int delayInt=0;
}
