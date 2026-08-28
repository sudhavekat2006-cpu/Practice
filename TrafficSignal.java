class TrafficSignal {
    public synchronized void pass(String carName) {
        System.out.println(carName + " is waiting at the signal...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(carName + " has passed the signal.");
    }
}

class Car extends Thread {
    private String carName;
    private TrafficSignal signal;

    Car(String carName, TrafficSignal signal) {
        this.carName = carName;
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.pass(carName);
    }
}

public class TrafficSignal{
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();

        Car car1 = new Car("Car-1", signal);
        Car car2 = new Car("Car-2", signal);
        Car car3 = new Car("Car-3", signal);
        Car car4 = new Car("Car-4", signal);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All cars have passed safely!");
    }
}
