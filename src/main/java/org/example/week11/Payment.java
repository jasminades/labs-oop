package org.example.week11;

public interface Payment {
    void processPayment();
}


public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");

        System.out.println("Credit card payment processed successfully!");
    }
}

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal payment processed successfully!");
    }
}


public interface PaymentFactory {
    Payment createPayment();
}


public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}


public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}


public class Main {
    public static void main(String[] args) {
        // Instantiate payment factories
        PaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
        PaymentFactory payPalPaymentFactory = new PayPalPaymentFactory();

        // Use factories to create payment objects
        Payment creditCardPayment = creditCardPaymentFactory.createPayment();
        Payment payPalPayment = payPalPaymentFactory.createPayment();

        // Call processPayment method on each payment object
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
