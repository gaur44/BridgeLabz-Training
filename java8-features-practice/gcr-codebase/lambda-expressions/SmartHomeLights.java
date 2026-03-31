@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLights {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> 
            System.out.println("Lights turned ON at full brightness");

        LightAction nightTimeTrigger = () -> 
            System.out.println("Lights set to dim mode");

        LightAction voiceTrigger = () -> 
            System.out.println("Lights changed to warm color");

        // executing different behaviors
        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceTrigger.activate();
    }
}

