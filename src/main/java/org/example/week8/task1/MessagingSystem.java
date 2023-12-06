package org.example.week8.task1;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission("user")
    public void sendMessage(User user) {
        System.out.println("User " + user.getUsername() + " is restricted.");
    }

    @CanSendMessage
    @RequiresPermission("admin")
    public void sendMessage(Admin admin) {
        System.out.println("Admin " + admin.getUsername() + " sent a message.");
    }

    public static void main(String[] args) {
        User regularUser = new User("RegularUser");
        Admin adminUser = new Admin("AdminUser");

        MessagingSystem messagingSystem = new MessagingSystem();
        messagingSystem.sendMessage(regularUser);
        messagingSystem.sendMessage(adminUser);
    }
}

