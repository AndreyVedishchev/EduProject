package enum_.task1;

public class Order {

    private OrderStatus status = OrderStatus.NEW;

    public void processOrder(OrderStatus nextStatus) {
        try {
            status.validateTransition(nextStatus);
            status = nextStatus;
        } catch (IllegalStateException e) {
            System.out.println("Иключение по причине: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Order order = new Order();

        System.out.println("status: " + order.status);
        order.processOrder(OrderStatus.PROCESSING);

        System.out.println("status: " + order.status);
        order.processOrder(OrderStatus.SHIPPED);
        System.out.println("status: " + order.status);

    }
}
