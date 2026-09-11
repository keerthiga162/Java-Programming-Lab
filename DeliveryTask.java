class DeliveryTask extends Thread {

    String task;

    DeliveryTask(String task) {
        this.task = task;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(task + " - Step " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        DeliveryTask order =
            new DeliveryTask("Order Placement");

        DeliveryTask delivery =
            new DeliveryTask("Order Delivery");

        order.start();
        delivery.start();
    }
}
