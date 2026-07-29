
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService inbox = new MessagingService();
        
        Message text1 = new Message("Fred","Lorem ipsum dolor sit amet consectetur adipiscing elit.");
        Message text2 = new Message("Steve","Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos. Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.");
        Message text3 = new Message("Jane","Lorem ipsum dolor sit amet consectetur adipiscing elit.");
        Message text4 = new Message("Jack","Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.");
        Message text5 = new Message("Will","Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat.");
        
        System.out.println("Messages:");
        System.out.println(inbox);
        System.out.println("");
        
        inbox.add(text1);
        inbox.add(text2);
        inbox.add(text3);
        inbox.add(text4);
        inbox.add(text5);
        
        System.out.println("Messages:");
        System.out.println(inbox);
    }
}
