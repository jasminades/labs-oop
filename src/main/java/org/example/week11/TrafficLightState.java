package org.example.week11;


public interface TrafficLightState {
    void transitionToRed();
    void transitionToGreen();
    void transitionToYellow();
}


public class RedLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Already in Red state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Switching to Green state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Switching to Yellow state");
    }
}


public class YellowLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Switching to Red state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Switching to Green state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Already in Yellow state");
    }
}


public class GreenLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Switching to Red state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Already in Green state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Switching to Yellow state");
    }
}


public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        // Set the initial state to RedLightState
        this.currentState = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void transitionToRed() {
        currentState.transitionToRed();
    }

    public void transitionToGreen() {
        currentState.transitionToGreen();
    }

    public void transitionToYellow() {
        currentState.transitionToYellow();
    }
}


public class TrafficLightController {
    public static void main(String[] args) {

        TrafficLightContext context = new TrafficLightContext();

        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
    }
}
